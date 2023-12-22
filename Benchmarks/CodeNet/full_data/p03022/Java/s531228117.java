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
		int n = ni();
		long[] a = tol(na(1<<n));
		long S = 0;
		for(long v : a)S += v;
		int mod = 998244353;
		
		a[0] = (a[0] + mod - S) % mod;
		long[] ha = fwht(a, mod);
		long[] b = new long[1<<n];
		b[0] = S*((1L<<n)-1)%mod;
		for(int i = 1;i < 1<<n;i++){
			b[i] = mod-S;
		}
		long[] hb = fwht(b, mod);
		
		long[] hx = new long[1<<n];
		for(int i = 0;i < 1<<n;i++){
			hx[i] = hb[i] * invl(ha[i], mod) % mod;
		}
		long[] x = fwht(hx, mod);
		
		long u = invl(1<<n, mod);
		for(int i = 0;i < 1<<n;i++){
			x[i] = x[i] * u % mod;
		}
		out.println(0);
		for(int i = 1;i < 1<<n;i++){
			x[i] -= x[0];
			x[i] %= mod;
			if(x[i] < 0)x[i] += mod;
			out.println(x[i]);
		}
		// -11 3 5 3
		// -12 4 4 4
		// -3 1 1 1
		
		// (P0-1)E0 + ... + P(n-1)E(n-1) = -1+?
		// (P1)E0 + ... + P(n-1^1)E(n-1) = -1
		
		// E0=0
		// (1/6)(-5E0+2E1+E2+2E3) = 3
		// (1/6)(2E0-5E1+2E2+E3) = -1
		// (1/6)(E0+2E1-5E2+2E3) = -1
		// (1/6)(2E0+E1+2E2-5E3) = -1
	}
	
	static long[] tol(int[] a)
	{
		long[] b = new long[a.length];
		for(int i = 0;i < a.length;i++)b[i] = a[i];
		return b;
	}
	
	public static long[] fwht(long[] a, int mod)
	{
		int n = a.length;
		assert (n&n-1) == 0;
		a = Arrays.copyOf(a, n);
		for(int w = Integer.numberOfTrailingZeros(n)-1;w >= 0;w--){
			for(int i = 0;i < n;i++){
				if(i<<~w>=0){
					long nal = a[i]+a[i|1<<w];
					long nar = a[i]-a[i|1<<w];
					if(nal >= mod)nal -= mod;
					if(nar < 0)nar += mod;
					a[i] = nal; a[i|1<<w] = nar;
				}
			}
		}
		return a;
	}

	
	public static long invl(long a, long mod) {
		long b = mod;
		long p = 1, q = 0;
		while (b > 0) {
			long c = a / b;
			long d;
			d = a;
			a = b;
			b = d % b;
			d = p;
			p = q;
			q = d - c * q;
		}
		return p < 0 ? p + mod : p;
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
