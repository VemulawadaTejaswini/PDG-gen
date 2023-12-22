import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.List;

public class Main {
	static InputStream is;
	static PrintWriter out;
	static String INPUT = "";
	
	static void solve()
	{
		
		SuffixAutomatonOfBit sa = SuffixAutomatonOfBit.build(ns().toCharArray());
		int K = ni();
		sa.sortTopologically();
		sa.lexSort();
		
		out.println(sa.kthDistinctSubstring(K, sa.preprocessDistinctSubstring()));
	}
	
	public static class SuffixAutomatonOfBit {
		public Node t0;
		public int len;
		public Node[] nodes;
		public int gen;
		private boolean sortedTopologically = false;
		private boolean lexsorted = false;
		
		private SuffixAutomatonOfBit(int n)
		{
			gen = 0;
			nodes = new Node[2*n];
			this.t0 = makeNode(0, null);
		}
		
		private Node makeNode(int len, Node original)
		{
			Node node = new Node();
			node.id = gen;
			node.original = original;
			node.len = len;
			nodes[gen++] = node;
			return node;
		}
		
		public static class Node
		{
			public int id;
			public int len;
			public char key;
			public Node link;
			private Node[] next = new Node[3];
			public Node original;
			public int np = 0;
			public long hit = 0;
			
			public int id(char c)
			{
//				return c >= 'a' ? c-'a' : c-'A'+26;
				return c-'a';
			}
			
			public void putNext(char c, Node to)
			{
				to.key = c;
				if(hit<<~id(c)<0){
					for(int i = 0;i < np;i++){
						if(next[i].key == c){
							next[i] = to;
							return;
						}
					}
				}
				hit |= 1L<<id(c);
				if(np == next.length){
					next = Arrays.copyOf(next, np*2);
				}
				next[np++] = to;
			}
			
			public boolean containsKeyNext(char c)
			{
				return hit<<~id(c)<0;
//				for(int i = 0;i < np;i++){
//					if(next[i].key == c)return true;
//				}
//				return false;
			}
			
			public Node getNext(char c)
			{
				if(hit<<~id(c)<0){
					for(int i = 0;i < np;i++){
						if(next[i].key == c)return next[i];
					}
				}
				return null;
			}
			
			public List<String> suffixes(char[] s)
			{
				List<String> list = new ArrayList<String>();
				if(id == 0)return list;
				int first = original != null ? original.len : len;
				for(int i = link.len + 1;i <= len;i++){
					list.add(new String(s, first - i, i));
				}
				return list;
			}
		}

		public static SuffixAutomatonOfBit build(char[] str)
		{
			int n = str.length;
			SuffixAutomatonOfBit sa = new SuffixAutomatonOfBit(n);
			sa.len = str.length;
			
			Node last = sa.t0;
			for(char c : str){
				last = sa.extend(last, c);
			}
			
			return sa;
		}
		
		public Node extend(Node last, char c)
		{
			Node cur = makeNode(last.len+1, null);
			Node p;
			for(p = last; p != null && !p.containsKeyNext(c);p = p.link){
				p.putNext(c, cur);
			}
			if(p == null){
				cur.link = t0;
			}else{
				Node q = p.getNext(c); // not null
				if(p.len + 1 == q.len){
					cur.link = q;
				}else{
					Node clone = makeNode(p.len+1, q);
					clone.next = Arrays.copyOf(q.next, q.next.length);
					clone.hit = q.hit;
					clone.np = q.np;
					clone.link = q.link;
					for(;p != null && q.equals(p.getNext(c)); p = p.link){
						p.putNext(c, clone);
					}
					q.link = cur.link = clone;
				}
			}
			return cur;
		}
		
		public SuffixAutomatonOfBit lexSort()
		{
			for(int i = 0;i < gen;i++){
				Node node = nodes[i];
				Arrays.sort(node.next, 0, node.np, new Comparator<Node>() {
					public int compare(Node a, Node b) {
						return a.key - b.key;
					}
				});
			}
			lexsorted = true;
			return this;
		}
		
		public SuffixAutomatonOfBit sortTopologically()
		{
			int[] indeg = new int[gen];
			for(int i = 0;i < gen;i++){
				for(int j = 0;j < nodes[i].np;j++){
					indeg[nodes[i].next[j].id]++;
				}
			}
			Node[] sorted = new Node[gen];
			sorted[0] = t0;
			int p = 1;
			for(int i = 0;i < gen;i++){
				Node cur = sorted[i];
				for(int j = 0;j < cur.np;j++){
					if(--indeg[cur.next[j].id] == 0){
						sorted[p++] = cur.next[j];
					}
				}
			}
			
			for(int i = 0;i < gen;i++)sorted[i].id = i;
			nodes = sorted;
			sortedTopologically = true;
			return this;
		}
		
		// visualizer
		
		public String toString()
		{
			StringBuilder sb = new StringBuilder();
			for(Node n : nodes){
				if(n != null){
					sb.append(String.format("{id:%d, len:%d, link:%d, cloned:%b, ",
							n.id,
							n.len,
							n.link != null ? n.link.id : null,
							n.original.id));
					sb.append("next:{");
					for(int i = 0;i < n.np;i++){
						sb.append(n.next[i].key + ":" + n.next[i].id + ",");
					}
					sb.append("}");
					sb.append("}");
					sb.append("\n");
				}
			}
			return sb.toString();
		}
		
		public String toGraphviz(boolean next, boolean suffixLink)
		{
			StringBuilder sb = new StringBuilder("http://chart.apis.google.com/chart?cht=gv:dot&chl=");
			sb.append("digraph{");
			for(Node n : nodes){
				if(n != null){
					if(suffixLink && n.link != null){
						sb.append(n.id)
						.append("->")
						.append(n.link.id)
						.append("[style=dashed],");
					}
					
					if(next && n.next != null){
						for(int i = 0;i < n.np;i++){
							sb.append(n.id)
							.append("->")
							.append(n.next[i].id)
							.append("[label=")
							.append(n.next[i].key)
							.append("],");
						}
					}
				}
			}
			sb.append("}");
			return sb.toString();
		}
		
		public String label(Node n)
		{
			if(n.original != null){
				return n.id + "C";
			}else{
				return n.id + "";
			}
		}
		
		public String toDot(boolean next, boolean suffixLink)
		{
			StringBuilder sb = new StringBuilder("digraph{\n");
			sb.append("graph[rankdir=LR];\n");
			sb.append("node[shape=circle];\n");
			for(Node n : nodes){
				if(n != null){
					if(suffixLink && n.link != null){
						sb.append("\"" + label(n) + "\"")
						.append("->")
						.append("\"" + label(n.link) + "\"")
						.append("[style=dashed];\n");
					}
					
					if(next && n.next != null){
						for(int i = 0;i < n.np;i++){
							sb.append("\"" + label(n) + "\"")
							.append("->")
							.append("\"" + label(n.next[i]) + "\"")
							.append("[label=\"")
							.append(n.next[i].key)
							.append("\"];\n");
						}
					}
				}
			}
			sb.append("}\n");
			return sb.toString();
		}
		
		// algorithm
		
		/**
		 * 相異なる連続部分文字列の個数
		 * @return
		 */
		public long numberOfDistinctSubstrings(){
			assert sortedTopologically;
			long[] dp = new long[gen];
			dp[0] = 1;
			long ret = 0;
			for(int i = 0;i < gen;i++){
				Node n = this.nodes[i];
				ret += dp[i];
				for(int j = 0;j < n.np;j++){
					dp[n.next[j].id] += dp[i];
				}
			}
			return ret-1; // remove empty
		}
		
		public char[] lcs(char[] t)
		{
			if(t.length == 0)return new char[0];
			Node v = t0;
			int l = 0, best = 0, bestPos = 0;
			for(int i = 0;i < t.length;i++){
				while(v != t0 && !v.containsKeyNext(t[i])){
					v = v.link;
					l = v.len;
				}
				if(v.containsKeyNext(t[i])){
					v = v.getNext(t[i]);
					l++;
				}
				if(l > best){
					best = l; bestPos = i;
				}
			}
			return Arrays.copyOfRange(t, bestPos-best+1, bestPos+1);
		}
		
		public int lcslen(char[] t)
		{
			if(t.length == 0)return 0;
			Node v = t0;
			int l = 0, best = 0;
			for(int i = 0;i < t.length;i++){
				while(v != t0 && !v.containsKeyNext(t[i])){
					v = v.link;
					l = v.len;
				}
				if(v.containsKeyNext(t[i])){
					v = v.getNext(t[i]);
					l++;
				}
				if(l > best){
					best = l;
				}
			}
			return best;
		}
		
		public int indexOf(char[] q)
		{
			Node cur = t0;
			for(int i = 0;i < q.length;i++){
				char c = q[i];
				Node nex = cur.getNext(c);
				if(nex == null)return -(i+1);
				cur = nex;
			}
			return cur.original != null ? cur.link.len-q.length : cur.len-q.length;
		}
		
		public Node[][] ilinks()
		{
			int n = gen;
			int[] ip = new int[n];
			for(int i = 1;i < n;i++)ip[nodes[i].link.id]++;
			Node[][] ilink = new Node[n][];
			for(int i = 0;i < n;i++)ilink[i] = new Node[ip[i]];
			for(int i = 1;i < n;i++)ilink[nodes[i].link.id][--ip[nodes[i].link.id]] = nodes[i];
			return ilink;
		}
		
		public Node track(char[] q)
		{
			Node cur = t0;
			for(char c : q){
				cur = cur.getNext(c);
				if(cur == null)return null;
			}
			return cur;
		}
		
		public BitSet indexOfAll(char[] q, Node[][] ilinks)
		{
			BitSet occurs = new BitSet();
			Node cur = track(q);
			if(cur == null)return occurs;
			dfsIndexOfAll(cur, q.length, ilinks, occurs);
			return occurs;
		}
		
		private void dfsIndexOfAll(Node cur, int qlen, Node[][] ilinks, BitSet bs)
		{
			if(cur.original == null)bs.set(cur.len-qlen);
			for(Node e : ilinks[cur.id])dfsIndexOfAll(e, qlen, ilinks, bs);
		}
		
		public long[] preprocessDistinctSubstring()
		{
			assert sortedTopologically;
			int n = gen;
			// preprocess
			long[] dp = new long[n];
			for(int i = n-1;i >= 0;i--){
				dp[i] = 1;
				Node node = nodes[i];
				for(int j = 0;j < node.np;j++){
					int toid = node.next[j].id;
					dp[i] += dp[toid];
				}
			}
			return dp;
		}
		
		public String kthDistinctSubstring(long K, long[] dp)
		{
			assert lexsorted;
			if(K <= 0)return null;
			if(K >= dp[0])return null;
			
			// greedy
			Node cur = t0;
			StringBuilder sb = new StringBuilder();
			while(K > 0){
				K--;
				for(int j = 0;j < cur.np;j++){
					Node next = cur.next[j];
					int toid = next.id;
					if(K-dp[toid] < 0){
						sb.append(next.key);
						cur = next;
						break;
					}else{
						K -= dp[toid];
					}
				}
			}
			return sb.toString();
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
