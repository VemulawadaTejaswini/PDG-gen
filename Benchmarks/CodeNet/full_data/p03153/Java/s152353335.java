import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.PriorityQueue;

public class Main {
	static InputStream is;
	static PrintWriter out;
	static String INPUT = "";
	
	static void solve()
	{
		int n = ni(), D = ni();
		int[] a = na(n);
		int[][] res = dfs(0, n, a, D);
		long ans = 0;
		for(int[] e : res){
			ans += cost(e[0], e[1], a, D);
		}
		out.println(ans);
	}
	
	static int[][] dfs(int l, int r, int[] a, long D)
	{
		if(r-l <= 1)return new int[0][];
		int h = l+r>>1;
		// [l,h), [h,r)
		long[][] cs = new long[r-h][];
		for(int i = h;i < r;i++){
			cs[i-h] = new long[]{a[i] + (i-h)*D, i};
		}
		Arrays.sort(cs, new Comparator<long[]>() {
			public int compare(long[] a, long[] b) {
				return Long.compare(a[0], b[0]);
			}
		});
		int[][] les = dfs(l, h, a, D);
		int[][] res = dfs(h, r, a, D);
		PriorityQueue<long[]> pq = new PriorityQueue<>((x, y) -> Long.compare(x[0], y[0]));
		if(les.length > 0)pq.add(new long[]{cost(les[0][0], les[0][1], a, D), -1, 0});
		if(res.length > 0)pq.add(new long[]{cost(res[0][0], res[0][1], a, D), -2, 0});
		for(int i = l;i < h;i++){
			pq.add(new long[]{cs[0][0] + (h-i)*D + a[i], i, 0});
		}
		
		DJSet ds = new DJSet(r-l);
		int[][] ret = new int[r-l-1][];
		int rp = 0;
		while(rp < ret.length){
			long[] cur = pq.poll();
			int ind = (int)cur[2];
			if(cur[1] == -1){
				if(!ds.union(les[ind][0]-l, les[ind][1]-l)){
					ret[rp++] = les[ind];
				}
				if(++ind < les.length){
					cur[0] = cost(les[ind][0], les[ind][1], a, D);
					cur[2]++;
					pq.add(cur);
				}
			}else if(cur[1] == -2){
				if(!ds.union(res[ind][0]-l, res[ind][1]-l)){
					ret[rp++] = res[ind];
				}
				if(++ind < res.length){
					cur[0] = cost(res[ind][0], res[ind][1], a, D);
					cur[2]++;
					pq.add(cur);
				}
			}else{
				int left = (int)cur[1];
				int right = (int)cs[ind][1];
				if(!ds.union(left-l, right-l)){
					ret[rp++] = new int[]{left, right};
					if(++ind < cs.length){
						cur[0] = cs[ind][0] + (h-left)*D + a[left];
						cur[2]++;
						pq.add(cur);
					}
				}
			}
		}
		return ret;
	}
	
	static long cost(int x, int y, int[] a, long D)
	{
		return Math.abs(x-y)*D + a[x]+a[y];
	}
		
		public static class DJSet {
			public int[] upper;

			public DJSet(int n) {
				upper = new int[n];
				Arrays.fill(upper, -1);
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
