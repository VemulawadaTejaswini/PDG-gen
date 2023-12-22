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
		long n = ni();
		int[] a = na(3);
		int[] b = na(3);
		int ptn = 0;
		for(int i = 0;i < 3;i++){
			if(a[i] < b[i]){
				ptn |= 1<<i;
			}
		}
		n = go(n, a, b, ptn);
		ptn = 0;
		for(int i = 0;i < 3;i++){
			if(a[i] > b[i]){
				ptn |= 1<<i;
			}
		}
		n = go(n, b, a, ptn);
		out.println(n);
	}
	
	// a < b
	static long go(long cur, int[] a, int[] b, int ptn)
	{
		if(ptn == 0)return cur;
		if(Integer.bitCount(ptn) == 1){
			int x = Integer.numberOfTrailingZeros(ptn);
			return cur%a[x] + cur/a[x]*b[x];
		}
		
		if(Integer.bitCount(ptn) == 2){
			int[] xs = new int[2];
			int p = 0;
			for(int i = 0;i < 3;i++){
				if(ptn<<~i<0){
					xs[p++] = i;
				}
			}
			assert p == 2;
			
			long max = 0;
			for(int j = 0;(long)a[xs[0]]*j <= cur;j++){
				long v = (long)j * b[xs[0]];
				long m = cur - (long)a[xs[0]]  * j;
				v += m%a[xs[1]] + m/a[xs[1]] * b[xs[1]];
				max = Math.max(max, v);
			}
			return max;
		}
		
		long[] dp = new long[(int)cur+1];
		Arrays.fill(dp, Long.MIN_VALUE / 10);
		dp[(int)cur] = 0;
		
		for(int k = 0;k < 3;k++){
			int la = a[k], lb = b[k];
			
			long[] ndp = new long[dp.length];
			Arrays.fill(ndp, Long.MIN_VALUE / 10);
			for(int i = 0;i < dp.length;i++){
				for(int j = 0;j*la <= i;j++){
					ndp[i-j*la] = Math.max(ndp[i-j*la], dp[i] + j*lb);
				}
			}
			
			dp = ndp;
		}
		
		long ret = 0;
		for(int i = 0;i < dp.length;i++){
			ret = Math.max(ret, dp[i] + i);
		}
		
		// 
		return ret;
		
		
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
