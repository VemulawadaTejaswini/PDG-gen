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
		// 重要度が高いほうから勉強していく
		// 重要度をどう割り当てるか
		// b1 l1 u1
		// b2 l2 u2
		// b1*u1+b2*l2-b1*X < b2*u2+b1*l1-b2*X
		int n = ni(), X = ni();
		long[][] blu = new long[n][];
		for(int i = 0;i < n;i++){
			blu[i] = new long[]{ni(), ni(), ni()};
		}
		Arrays.sort(blu, new Comparator<long[]>() {
			public int compare(long[] a, long[] b) {
				return Long.compare(
						(long)a[0]*a[2]+(long)b[0]*b[1]-(long)a[2]*X,
						(long)b[0]*b[2]+(long)a[0]*a[1]-(long)b[2]*X
						);
			}
		});
		long low = -1, high = (long)n*X+1;
		while(high - low > 1){
			long h = high+low>>1;
			
			long bmax = Long.MIN_VALUE;
			
			{
				long B = 0;
				for(int i = 0;i < h/X;i++){
					B -= blu[i][2] * blu[i][0];
					B += X * blu[i][2];
				}
				for(int i = (int)(h/X);i < n;i++){
					B -= blu[i][1] * blu[i][0];
				}
				// 8 4 4 7 2 8
				if(h/X < blu.length){
					long p1 = Long.MIN_VALUE;
					for(int i = (int)(h/X);i < n;i++){
						p1 = Math.max(p1, h%X*blu[i][1]);
						p1 = Math.max(p1, (h%X-blu[i][0])*blu[i][2] + blu[i][1]*blu[i][0]);
					}
					B += p1;
				}
				bmax = Math.max(B, bmax);
			}
			
			if(h/X < blu.length){
				long B = 0;
				for(int i = 0;i < h/X+1;i++){
					B -= blu[i][2] * blu[i][0];
					B += X * blu[i][2];
				}
				for(int i = (int)(h/X+1);i < n;i++){
					B -= blu[i][1] * blu[i][0];
				}
				
				long rem = X-h%X;
				
				long p1 = Long.MIN_VALUE;
				for(int i = 0;i <= (int)(h/X);i++){
					p1 = Math.max(p1, -rem*blu[i][2]);
					p1 = Math.max(p1, -(X-blu[i][0])*blu[i][2]+(h%X-blu[i][0])*blu[i][1]);
				}
				B += p1;
				
				bmax = Math.max(B, bmax);
			}
			
			if(bmax >= 0){
				high = h;
			}else{
				low = h;
			}
		}
		out.println(high);
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
