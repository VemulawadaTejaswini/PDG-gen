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
		int n = ni(), Q = ni();
		int[] ss = new int[n];
		int[] ts = new int[n];
		int[] xs = new int[n];
		for(int i = 0;i < n;i++) {
			ss[i] = ni();
			ts[i] = ni();
			xs[i] = ni();
		}
		long[] ai = new long[n];
		for(int i = 0;i < n;i++)ai[i] = (long)xs[i]<<32|i;
		Arrays.sort(ai);
		
		int[] qs = na(Q);
		
		SegmentTreeOverwrite st = new SegmentTreeOverwrite(Q);
		for(int i = 0;i < n;i++) {
			int ind = (int)ai[i];
			// [k[0],k[1]) : x
			// (x-k[1], x-k[0]]
			// [k[0]-x, k[1]-x)
			int l = Arrays.binarySearch(qs, ss[ind]-xs[ind]);
			if(l < 0)l = -l-1;
			int r = Arrays.binarySearch(qs, ts[ind]-xs[ind]);
			if(r < 0)r = -r-1;
			// [l,r)
			st.update(l, r, xs[ind]);
		}
		for(int i = 0;i < Q;i++) {
			int val = st.get(i);
			if(val == st.I) {
				out.println(-1);
			}else {
				out.println(val);
			}
		}
	}
	
	public static class SegmentTreeOverwrite {
		public int M, H, N;
		public int[] cover;
		public int I = Integer.MAX_VALUE;
		
		public SegmentTreeOverwrite(int n)
		{
			N = n;
			M = Integer.highestOneBit(Math.max(N-1, 1))<<2;
			H = M>>>1;
			cover = new int[M];
			Arrays.fill(cover, I);
			for(int i = H-1;i >= 1;i--){
				propagate(i);
			}
		}
		
		private void propagate(int i){}
		
		public void update(int l, int r, int v){ update(l, r, v, 0, H, 1); }
		
		private void update(int l, int r, int v, int cl, int cr, int cur)
		{
			if(l <= cl && cr <= r){
				cover[cur] = v;
				propagate(cur);
			}else{
				int mid = cl+cr>>>1;
				if(cover[cur] != I){ // back-propagate
					cover[2*cur] = cover[2*cur+1] = cover[cur];
					cover[cur] = I;
					propagate(2*cur);
					propagate(2*cur+1);
				}
				if(cl < r && l < mid){
					update(l, r, v, cl, mid, 2*cur);
				}
				if(mid < r && l < cr){
					update(l, r, v, mid, cr, 2*cur+1);
				}
				propagate(cur);
			}
		}
		
		public int get(int x){ 
			int val = I;
			for(int i = H+x;i >= 1;i>>>=1){
				if(cover[i] != I)val = cover[i];
			}
			return val;
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
