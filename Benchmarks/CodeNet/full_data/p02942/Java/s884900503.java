import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;

public class Main {
	static InputStream is;
	static PrintWriter out;
	static String INPUT = "";
	
	static void solve()
	{
		int n = ni(), m = ni();
		int[][] a = new int[n][];
		for(int i = 0;i < n;i++)a[i] = na(m);
		
		EQ[][] g = new EQ[n][n]; // input to
		for(int i = 0;i < n;i++){
			for(int j = 0;j < n;j++){
				g[i][j] = new EQ();
			}
			for(int j = 0;j < m;j++){
				g[i][(a[i][j]-1)/m].add(a[i][j]-1);
			}
		}
		
		int[][] go = new int[n][m];
		int[][] go2 = new int[n][m];
		for(int z = 0;z < m;z++){
			boolean[][] lg = new boolean[n][n];
			for(int i = 0;i < n;i++){
				for(int j = 0;j < n;j++){
					lg[i][j] = g[i][j].size() > 0;
				}
			}
			int[] mat = doBipartiteMatching(lg);
			for(int i = 0;i < n;i++){
				int num = g[i][mat[i]].poll();
				go[i][z] = num;
				go2[num/m][z] = num;
			}
		}
		
		for(int i = 0;i < n;i++){
			for(int j = 0;j < m;j++){
				out.print(go[i][j]+1 + " ");
			}
			out.println();
		}
		for(int i = 0;i < n;i++){
			for(int j = 0;j < m;j++){
				out.print(go2[i][j]+1 + " ");
			}
			out.println();
		}
	}
	
	public static class EQ {
		public int[] q;
		protected int pt, ph;
		public EQ(){ q = new int[2]; pt = ph = 0; }
		public void add(int x){
			if(ph == q.length)scale();
			q[ph++] = x;
		}
		public void scale()
		{
			int n = q.length;
			int[] nq = new int[n*3/2];
			System.arraycopy(q, pt, nq, 0, ph-pt);
			q = nq;
			ph = ph-pt;
			pt = 0;
		}
		public void clear(){ pt = ph = 0; }
		public int poll(){ return q[pt++]; }
		public int size(){ return ph-pt; }
		public boolean isEmpty(){ return ph==pt; }
	}	
	public static int[] doBipartiteMatching(boolean[][] g)
	{
		int n = g.length;
		if(n == 0)return new int[0];
		int m = g[0].length;
		if(m == 0){
			int[] ret = new int[n];
			Arrays.fill(ret, -1);
			return ret;
		}
		int[] im = new int[m];
		Arrays.fill(im, -1);
		boolean[] visited = new boolean[n];
		int matched = 0;
		for(int i = 0;i < n;i++){
			if(visit(g, i, visited, im)) {
				Arrays.fill(visited, false);
				matched++;
			}
		}

		int[] ret = new int[n];
		Arrays.fill(ret, -1);
		for(int i = 0;i < m;i++){
			if(im[i] != -1)ret[im[i]] = i;
		}
		return ret;
	}

	public static boolean visit(boolean[][] g, int cur, boolean[] visited, int[] im)
	{
		if(cur == -1)return true;

		int m = g[cur].length;
		for(int i = 0;i < m;i++){
			if(!visited[i] && g[cur][i]){
				visited[i] = true;
				if(visit(g, im[i], visited, im)){
					im[i] = cur;
					return true;
				}
			}
		}
		return false;
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
