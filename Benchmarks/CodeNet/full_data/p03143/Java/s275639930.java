import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Random;

public class Main {
	static InputStream is;
	static PrintWriter out;
	static String INPUT = "";
	
	static void solve()
	{
		int n = ni(), m = ni();
		int[] a = na(n);
		int[][] es = new int[m][];
		for(int i = 0;i < m;i++){
			es[i] = new int[]{ni()-1, ni()-1, ni()};
		}
		Arrays.sort(es, new Comparator<int[]>() {
			public int compare(int[] a, int[] b) {
				return a[2] - b[2];
			}
		});
		DJSet ds = new DJSet(n);
		for(int i =  0;i < n;i++)ds.w[i] = a[i];
		int[] from = new int[n-1];
		int[] to = new int[n-1];
		int[] ws = new int[n-1];
		int p = 0;
		for(int[] e : es){
			if(!ds.union(e[0], e[1])){
				from[p] = e[0];
				to[p] = e[1];
				ws[p] = e[2];
				p++;
			}
		}
		
		int[][][] g = packWU(n, from, to, ws);
		int[][] pars = parents(g, 0);
		int[] par = pars[0], pw = pars[4];
//		int[][] rs = makeRights(g, par, 0);
//		intord = rs[0]; iord = rs[1]; right = rs[2];
		
		EulerTour et = nodalEulerTour(g, 0);
		Node[] nodes = new Node[n];
		Node root = null;
		for(int i = 0;i < 2*n;i++){
			if(et.first[et.vs[i]] == i){
				root = merge(root, nodes[et.vs[i]] = new Node(et.vs[i], pw[et.vs[i]], a[et.vs[i]]));
			}else{
				root = merge(root, new Node(et.vs[i], -1, 0));
			}
		}
		for(int i = 0;i < n;i++){
			Node F = get(root, et.first[i]);
			Node L = get(root, et.last[i]);
			F.dual = L;
			L.dual = F;
		}
		removed = new boolean[n];
		removed[0] = true;
		dfs(root);
		
		ds = new DJSet(n);
		for(int i = 0;i < n;i++)ds.w[i] = a[i];
		for(int i = 1;i < n;i++){
			if(!removed[i]){
				ds.union(i, par[i]);
			}
		}
		int nrem = 0;
		for(int[] e : es){
			if(!ds.equiv(e[0], e[1])){
				nrem++;
			}else if(ds.w[ds.root(e[0])] < e[2]){
				nrem++;
			}
		}
		out.println(nrem);
	}
	
	static boolean[] removed;
	
	static void dfs(Node root)
	{
		while(root.nwsum < root.pwargmax.pw){
			Node nrf = root.pwargmax;
			Node nrl = nrf.dual;
//			tr(index(nrf), index(nrl)+1, nrf.pw, nrl.pw, root.nwsum);
			removed[nrf.id] = true;
			nrf.pw = -1;
			for(Node x = nrf;x != null;x = x.parent){
				update(x);
			}
			Node[] lm_r = split(root, index(nrl)+1);
			Node[] l_m = split(lm_r[0], index(nrf));
			Node nr = l_m[1];
			root = merge(l_m[0], lm_r[1]);
			
			dfs(nr);
		}
	}
	
	public static class EulerTour
	{
		public int[] vs; // vertices
		public int[] first; // first appeared time
		public int[] last; // last appeared time
		
		public EulerTour(int[] vs, int[] f, int[] l) {
			this.vs = vs;
			this.first = f;
			this.last = l;
		}
	}
	
	public static EulerTour nodalEulerTour(int[][][] g, int root)
	{
		int n = g.length;
		int[] vs = new int[2*n];
		int[] f = new int[n];
		int[] l = new int[n];
		int p = 0;
		Arrays.fill(f, -1);
		
		int[] stack = new int[n];
		int[] inds = new int[n];
		int sp = 0;
		stack[sp++] = root;
		outer:
		while(sp > 0){
			int cur = stack[sp-1], ind = inds[sp-1];
			if(ind == 0){
				vs[p] = cur;
				f[cur] = p;
				p++;
			}
			while(ind < g[cur].length){
				int nex = g[cur][ind++][0];
				if(f[nex] == -1){ // child
					inds[sp-1] = ind;
					stack[sp] = nex;
					inds[sp] = 0;
					sp++;
					continue outer;
				}
			}
			inds[sp-1] = ind;
			if(ind == g[cur].length){
				vs[p] = cur;
				l[cur] = p;
				p++;
				sp--;
			}
		}
		
		return new EulerTour(vs, f, l);
	}

	public static Random gen = new Random();
	
	static public class Node
	{
		public int id;
		public long pw; // pw value
		public long nw;
		public long priority;
		public Node left, right, parent;
		
		public int count;
		
		public Node pwargmax;
		public long nwsum;
		public Node dual;
		
		public Node(int id, long pw, long nw)
		{
			this.id = id;
			this.pw = pw;
			this.nw = nw;
			priority = gen.nextLong();
			update(this);
		}
		
		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("Node [v=");
			builder.append(pw);
			builder.append(", count=");
			builder.append(count);
			builder.append(", parent=");
			builder.append(parent != null ? parent.pw : "null");
			builder.append(", sum=");
			builder.append(nwsum);
			builder.append("]");
			return builder.toString();
		}
	}

	public static Node update(Node a)
	{
		if(a == null)return null;
		a.count = 1;
		if(a.left != null)a.count += a.left.count;
		if(a.right != null)a.count += a.right.count;
		
		a.pwargmax = a;
		if(a.left != null && a.left.pwargmax.pw > a.pwargmax.pw)a.pwargmax = a.left.pwargmax;
		if(a.right != null && a.right.pwargmax.pw > a.pwargmax.pw)a.pwargmax = a.right.pwargmax;
		
		a.nwsum = a.nw;
		if(a.left != null)a.nwsum += a.left.nwsum;
		if(a.right != null)a.nwsum += a.right.nwsum;
		return a;
	}
	
	public static Node disconnect(Node a)
	{
		if(a == null)return null;
		a.left = a.right = a.parent = null;
		return update(a);
	}
	
	public static Node root(Node x)
	{
		if(x == null)return null;
		while(x.parent != null)x = x.parent;
		return x;
	}
	
	public static int count(Node a)
	{
		return a == null ? 0 : a.count;
	}
	
	public static void setParent(Node a, Node par)
	{
		if(a != null)a.parent = par;
	}
//	
//	public static long sum(Node a, int L, int R)
//	{
//		if(a == null || L >= R || L >= count(a) || R <= 0)return 0L;
//		if(L <= 0 && R >= count(a)){
//			return a.nwsum;
//		}else{
//			long ret = 0;
//			ret += sum(a.left, L, R);
//			ret += sum(a.right, L-count(a.left)-1, R-count(a.left)-1);
//			if(L <= count(a.left) && count(a.left) < R)ret += a.pw;
//			return ret;
//		}
//	}
	
	public static Node merge(Node a, Node b)
	{
		if(b == null)return a;
		if(a == null)return b;
		if(a.priority > b.priority){
			setParent(a.right, null);
			setParent(b, null);
			a.right = merge(a.right, b);
			setParent(a.right, a);
			return update(a);
		}else{
			setParent(a, null);
			setParent(b.left, null);
			b.left = merge(a, b.left);
			setParent(b.left, b);
			return update(b);
		}
	}
	
	// [0,K),[K,N)
	public static Node[] split(Node a, int K)
	{
		if(a == null)return new Node[]{null, null};
		if(K <= count(a.left)){
			setParent(a.left, null);
			Node[] s = split(a.left, K);
			a.left = s[1];
			setParent(a.left, a);
			s[1] = update(a);
			return s;
		}else{
			setParent(a.right, null);
			Node[] s = split(a.right, K-count(a.left)-1);
			a.right = s[0];
			setParent(a.right, a);
			s[0] = update(a);
			return s;
		}
	}
	
	public static Node get(Node a, int K)
	{
		while(a != null){
			if(K < count(a.left)){
				a = a.left;
			}else if(K == count(a.left)){
				break;
			}else{
				K = K - count(a.left)-1;
				a = a.right;
			}
		}
		return a;
	}
	
	public static int lowerBound(Node a, int q)
	{
		int lcount = 0;
		while(a != null){
			if(a.pw >= q){
				a = a.left;
			}else{
				lcount += count(a.left) + 1;
				a = a.right;
			}
		}
		return lcount;
	}
	
	public static int search(Node a, int q)
	{
		int lcount = 0;
		while(a != null){
			if(a.id == q){
				lcount += count(a.left);
				break;
			}
			if(q < a.id){
				a = a.left;
			}else{
				lcount += count(a.left) + 1;
				a = a.right;
			}
		}
		return a == null ? -(lcount+1) : lcount;
	}
	
	public static int index(Node a)
	{
		if(a == null)return -1;
		int ind = count(a.left);
		while(a != null){
			Node par = a.parent;
			if(par != null && par.right == a){
				ind += count(par.left) + 1;
			}
			a = par;
		}
		return ind;
	}
	
	public static Node[] nodes(Node a) { return nodes(a, new Node[count(a)], 0, count(a)); }
	public static Node[] nodes(Node a, Node[] ns, int L, int R)
	{
		if(a == null)return ns;
		nodes(a.left, ns, L, L+count(a.left));
		ns[L+count(a.left)] = a;
		nodes(a.right, ns, R-count(a.right), R);
		return ns;
	}
	
	public static String toString(Node a, String indent)
	{
		if(a == null)return "";
		StringBuilder sb = new StringBuilder();
		sb.append(toString(a.left, indent + "  "));
		sb.append(indent).append(a).append("\n");
		sb.append(toString(a.right, indent + "  "));
		return sb.toString();
	}

	
	public static int[][] parents(int[][][] g, int root) {
		int n = g.length;
		int[] par = new int[n];
		Arrays.fill(par, -1);
		int[] dw = new int[n];
		int[] pw = new int[n];
		int[] dep = new int[n];

		int[] q = new int[n];
		q[0] = root;
		for (int p = 0, r = 1; p < r; p++) {
			int cur = q[p];
			for (int[] nex : g[cur]) {
				if (par[cur] != nex[0]) {
					q[r++] = nex[0];
					par[nex[0]] = cur;
					dep[nex[0]] = dep[cur] + 1;
					dw[nex[0]] = dw[cur] + nex[1];
					pw[nex[0]] = nex[1];
				}
			}
		}
		return new int[][] { par, q, dep, dw, pw };
	}

	
	public static int[] sortByPreorder(int[][][] g, int root){
		int n = g.length;
		int[] stack = new int[n];
		int[] ord = new int[n];
		boolean[] ved = new boolean[n];
		stack[0] = root;
		int p = 1;
		int r = 0;
		ved[root] = true;
		while(p > 0){
			int cur = stack[p-1];
			ord[r++] = cur;
			p--;
			for(int[] e : g[cur]){
				if(!ved[e[0]]){
					ved[e[0]] = true;
					stack[p++] = e[0];
				}
			}
		}
		return ord;
	}
	
	public static int[][] makeRights(int[][][] g, int[] par, int root)
	{
		int n = g.length;
		int[] ord = sortByPreorder(g, root);
		int[] iord = new int[n];
		for(int i = 0;i < n;i++)iord[ord[i]] = i;
		
		int[] right = new int[n];
		for(int i = n-1;i >= 1;i--){
			if(right[i] == 0)right[i] = i;
			int p = iord[par[ord[i]]];
			right[p] = Math.max(right[p], right[i]);
		}
		return new int[][]{ord, iord, right};
	}

	
	public static int[][][] packWU(int n, int[] from, int[] to, int[] w){ return packWU(n, from, to, w, from.length); }
	public static int[][][] packWU(int n, int[] from, int[] to, int[] w, int sup)
	{
		int[][][] g = new int[n][][];
		int[] p = new int[n];
		for(int i = 0;i < sup;i++)p[from[i]]++;
		for(int i = 0;i < sup;i++)p[to[i]]++;
		for(int i = 0;i < n;i++)g[i] = new int[p[i]][2];
		for(int i = 0;i < sup;i++){
			--p[from[i]];
			g[from[i]][p[from[i]]][0] = to[i];
			g[from[i]][p[from[i]]][1] = w[i];
			--p[to[i]];
			g[to[i]][p[to[i]]][0] = from[i];
			g[to[i]][p[to[i]]][1] = w[i];
		}
		return g;
	}

	
	public static class DJSet {
		public int[] upper;
		public long[] w;

		public DJSet(int n) {
			upper = new int[n];
			Arrays.fill(upper, -1);
			w = new long[n];
		}

		public int root(int x) {
			return upper[x] < 0 ? x : (upper[x] = root(upper[x]));
		}

		public boolean equiv(int x, int y) {
			return root(x) == root(y);
		}

		public boolean union(int x, int y) {
			x = root(x);
			y = root(y);
			if (x != y) {
				if (upper[y] < upper[x]) {
					int d = x;
					x = y;
					y = d;
				}
				upper[x] += upper[y];
				upper[y] = x;
				w[x] += w[y];
			}
			return x == y;
		}

		public int count() {
			int ct = 0;
			for (int u : upper)
				if (u < 0)
					ct++;
			return ct;
		}
	}

	
	public static void main(String[] args) throws Exception
	{
		long S = System.currentTimeMillis();
		is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());
		out = new PrintWriter(System.out);
		
		solve();
		out.flush();
		long G = System.currentTimeMillis();
		tr(G-S+"ms");
	}
	
	private static boolean eof()
	{
		if(lenbuf == -1)return true;
		int lptr = ptrbuf;
		while(lptr < lenbuf)if(!isSpaceChar(inbuf[lptr++]))return false;
		
		try {
			is.mark(1000);
			while(true){
				int b = is.read();
				if(b == -1){
					is.reset();
					return true;
				}else if(!isSpaceChar(b)){
					is.reset();
					return false;
				}
			}
		} catch (IOException e) {
			return true;
		}
	}
	
	private static byte[] inbuf = new byte[1024];
	static int lenbuf = 0, ptrbuf = 0;
	
	private static int readByte()
	{
		if(lenbuf == -1)throw new InputMismatchException();
		if(ptrbuf >= lenbuf){
			ptrbuf = 0;
			try { lenbuf = is.read(inbuf); } catch (IOException e) { throw new InputMismatchException(); }
			if(lenbuf <= 0)return -1;
		}
		return inbuf[ptrbuf++];
	}
	
	private static boolean isSpaceChar(int c) { return !(c >= 33 && c <= 126); }
//	private static boolean isSpaceChar(int c) { return !(c >= 32 && c <= 126); }
	private static int skip() { int b; while((b = readByte()) != -1 && isSpaceChar(b)); return b; }
	
	private static double nd() { return Double.parseDouble(ns()); }
	private static char nc() { return (char)skip(); }
	
	private static String ns()
	{
		int b = skip();
		StringBuilder sb = new StringBuilder();
		while(!(isSpaceChar(b))){
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}
	
	private static char[] ns(int n)
	{
		char[] buf = new char[n];
		int b = skip(), p = 0;
		while(p < n && !(isSpaceChar(b))){
			buf[p++] = (char)b;
			b = readByte();
		}
		return n == p ? buf : Arrays.copyOf(buf, p);
	}
	
	private static char[][] nm(int n, int m)
	{
		char[][] map = new char[n][];
		for(int i = 0;i < n;i++)map[i] = ns(m);
		return map;
	}
	
	private static int[] na(int n)
	{
		int[] a = new int[n];
		for(int i = 0;i < n;i++)a[i] = ni();
		return a;
	}
	
	private static int ni()
	{
		int num = 0, b;
		boolean minus = false;
		while((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'));
		if(b == '-'){
			minus = true;
			b = readByte();
		}
		
		while(true){
			if(b >= '0' && b <= '9'){
				num = num * 10 + (b - '0');
			}else{
				return minus ? -num : num;
			}
			b = readByte();
		}
	}
	
	private static long nl()
	{
		long num = 0;
		int b;
		boolean minus = false;
		while((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'));
		if(b == '-'){
			minus = true;
			b = readByte();
		}
		
		while(true){
			if(b >= '0' && b <= '9'){
				num = num * 10 + (b - '0');
			}else{
				return minus ? -num : num;
			}
			b = readByte();
		}
	}
	
	private static void tr(Object... o) { if(INPUT.length() != 0)System.out.println(Arrays.deepToString(o)); }
}
