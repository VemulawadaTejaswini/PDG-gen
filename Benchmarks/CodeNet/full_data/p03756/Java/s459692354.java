import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.InputMismatchException;

public class Main {
	static InputStream is;
	static PrintWriter out;
	static String INPUT = "";
	
	static void solve()
	{
		int h = ni(), w = ni(), n = ni();
		long f = ni();
		int sr = ni()-1, sc = ni()-1;
		int gr = ni()-1, gc = ni()-1;
		int[][] co = new int[n+1][];
		int sid = -1, gid = n;
		for(int i = 0;i < n;i++){
			co[i] = new int[]{ni()-1, ni()-1, nc(), ni(), ni(), i};
			if(co[i][0] == sr && co[i][1] == sc)sid = i;
		}
		co[n] = new int[]{gr, gc, 'E', 0, 0, n};
		n++;
		if(sid == -1){
			out.println(-1);
			return;
		}
		int[] from = new int[16*n];
		int[] to = new int[16*n];
		long[] ws = new long[16*n];
		int p = 0;
		
		{
			int[][] xco = new int[3*n][];
			for(int i = 0;i < n;i++){
				xco[i] = co[i];
				xco[i+n] = new int[]{co[i][0], co[i][1] + co[i][3], i+n};
				xco[i+2*n] = new int[]{co[i][0], co[i][1] - co[i][3], i+2*n};
				from[p] = i; to[p] = i+n; ws[p] = co[i][2] == 'E' ? 0 : co[i][4]; p++;
				from[p] = i; to[p] = i+2*n; ws[p] = co[i][2] == 'W' ? 0 : co[i][4]; p++;
			}
			Arrays.sort(xco, new Comparator<int[]>() {
				public int compare(int[] a, int[] b) {
					if(a[0] != b[0])return a[0] - b[0];
					if(a[1] != b[1])return a[1] - b[1];
					return a.length - b.length;
				}
			});
			for(int i = 0;i < 3*n;){
				int k = i;
				while(k < 3*n && xco[k][0] == xco[i][0])k++;
				int prev = -1;
				for(int j = i;j < k;j++){
					if(prev != -1){
						from[p] = xco[prev].length == 3 ? xco[prev][2] : xco[prev][5];
						to[p] = xco[j].length == 3 ? xco[j][2] : xco[j][5];
						ws[p] = f * (xco[j][1] - xco[prev][1]);
						p++;
					}
					if(xco[j].length == 3){
						prev = j;
					}
				}
				prev = -1;
				for(int j = k-1;j >= i;j--){
					if(prev != -1){
						to[p] = xco[prev].length == 3 ? xco[prev][2] : xco[prev][5];
						from[p] = xco[j].length == 3 ? xco[j][2] : xco[j][5];
						ws[p] = f * (xco[prev][1] - xco[j][1]);
						p++;
					}
					if(xco[j].length == 3){
						prev = j;
					}
				}
				
				i = k;
			}
		}
		{
			int[][] xco = new int[3*n][];
			for(int i = 0;i < n;i++){
				xco[i] = co[i];
				xco[i+n] = new int[]{co[i][0] + co[i][3], co[i][1], i+3*n};
				xco[i+2*n] = new int[]{co[i][0] - co[i][3], co[i][1], i+4*n};
				from[p] = i; to[p] = i+3*n; ws[p] = co[i][2] == 'S' ? 0 : co[i][4]; p++;
				from[p] = i; to[p] = i+4*n; ws[p] = co[i][2] == 'N' ? 0 : co[i][4]; p++;
			}
			Arrays.sort(xco, new Comparator<int[]>() {
				public int compare(int[] a, int[] b) {
					if(a[1] != b[1])return a[1] - b[1];
					if(a[0] != b[0])return a[0] - b[0];
					return a.length - b.length;
				}
			});
			for(int i = 0;i < 3*n;){
				int k = i;
				while(k < 3*n && xco[k][1] == xco[i][1])k++;
				
				int prev = -1;
				for(int j = i;j < k;j++){
					if(prev != -1){
						from[p] = xco[prev].length == 3 ? xco[prev][2] : xco[prev][5];
						to[p] = xco[j].length == 3 ? xco[j][2] : xco[j][5];
						ws[p] = f * (xco[j][0] - xco[prev][0]);
						p++;
					}
					if(xco[j].length == 3){
						prev = j;
					}
				}
				prev = -1;
				for(int j = k-1;j >= i;j--){
					if(prev != -1){
						to[p] = xco[prev].length == 3 ? xco[prev][2] : xco[prev][5];
						from[p] = xco[j].length == 3 ? xco[j][2] : xco[j][5];
						ws[p] = f * (xco[prev][0] - xco[j][0]);
						p++;
					}
					if(xco[j].length == 3){
						prev = j;
					}
				}
				
				i = k;
			}
		}
//		tr(from);
//		tr(to);
//		tr(ws);
//		tr(p);
		
		Graph g = packWD(5*n, from, to, ws, p);
		long ret = dijkl(g, sid)[gid];
		if(ret < Long.MAX_VALUE / 2){
			out.println(ret);
		}else{
			out.println(-1);
		}
	}
	
	public static long[] dijkl(Graph g, int from)
	{
		int n = g.g.length;
		long[] td = new long[n];
		
		Arrays.fill(td, Long.MAX_VALUE / 2);
		MinHeapL q = new MinHeapL(n);
		q.add(from, 0);
		td[from] = 0;
		
		while(q.size() > 0){
			int cur = q.argmin();
			q.remove(cur);
			
			for(int i = 0;i < g.g[cur].length;i++){
				int next = g.g[cur][i];
				long nd = td[cur] + g.wg[cur][i];
				if(nd < td[next]){
					td[next] = nd;
					q.update(next, nd);
				}
			}
		}
		
		return td;
	}
	
	public static class MinHeapL {
		public long[] a;
		public int[] map;
		public int[] imap;
		public int n;
		public int pos;
		public static long INF = Long.MAX_VALUE;
		
		public MinHeapL(int m)
		{
			n = Integer.highestOneBit((m+1)<<1);
			a = new long[n];
			map = new int[n];
			imap = new int[n];
			Arrays.fill(a, INF);
			Arrays.fill(map, -1);
			Arrays.fill(imap, -1);
			pos = 1;
		}
		
		public long add(int ind, long x)
		{
			int ret = imap[ind];
			if(imap[ind] < 0){
				a[pos] = x; map[pos] = ind; imap[ind] = pos;
				pos++;
				up(pos-1);
			}
			return ret != -1 ? a[ret] : x;
		}
		
		public long update(int ind, long x)
		{
			int ret = imap[ind];
			if(imap[ind] < 0){
				a[pos] = x; map[pos] = ind; imap[ind] = pos;
				pos++;
				up(pos-1);
			}else{
				a[ret] = x;
				up(ret);
				down(ret);
			}
			return x;
		}
		
		public long remove(int ind)
		{
			if(pos == 1)return INF;
			if(imap[ind] == -1)return INF;
			
			pos--;
			int rem = imap[ind];
			long ret = a[rem];
			map[rem] = map[pos];
			imap[map[pos]] = rem;
			imap[ind] = -1;
			a[rem] = a[pos];
			a[pos] = INF;
			map[pos] = -1;
			
			up(rem);
			down(rem);
			return ret;
		}
		
		public long min() { return a[1]; }
		public int argmin() { return map[1]; }
		public int size() {	return pos-1; }
		
		private void up(int cur)
		{
			for(int c = cur, p = c>>>1;p >= 1 && a[p] > a[c];c>>>=1, p>>>=1){
				long d = a[p]; a[p] = a[c]; a[c] = d;
				int e = imap[map[p]]; imap[map[p]] = imap[map[c]]; imap[map[c]] = e;
				e = map[p]; map[p] = map[c]; map[c] = e;
			}
		}
		
		private void down(int cur)
		{
			for(int c = cur;2*c < pos;){
				int b = a[2*c] < a[2*c+1] ? 2*c : 2*c+1;
				if(a[b] < a[c]){
					long d = a[c]; a[c] = a[b]; a[b] = d;
					int e = imap[map[c]]; imap[map[c]] = imap[map[b]]; imap[map[b]] = e;
					e = map[c]; map[c] = map[b]; map[b] = e;
					c = b;
				}else{
					break;
				}
			}
		}
	}

	static class Graph
	{
		int[][] g;
		long[][] wg;
	}
	
	public static Graph packWD(int n, int[] from, int[] to, long[] w, int sup)
	{
		Graph g = new Graph();
		g.g = new int[n][];
		g.wg = new long[n][];
		int[] p = new int[n];
		for(int i = 0;i < sup;i++)p[from[i]]++;
		for(int i = 0;i < n;i++){
			g.g[i] = new int[p[i]];
			g.wg[i] = new long[p[i]];
		}
		for(int i = 0;i < sup;i++){
			--p[from[i]];
			g.g[from[i]][p[from[i]]] = to[i];
			g.wg[from[i]][p[from[i]]] = w[i];
		}
		return g;
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
