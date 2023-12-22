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
		char[] s = ns(n);
		int[] cs = new int[n];
		int p = 0;
		for(int i = 1;i < n-1;i++){
			if(s[i-1] == '1' && s[i] == '0' && s[i+1] == '1'){
				cs[p++] = i;
			}
		}
		int[] ls = new int[p];
		for(int i = 0;i < p;i++){
			for(int j = cs[i]-1;j >= 0 && s[j] != '0';j--){
				ls[i]++;
			}
		}
		int[] rs = new int[p];
		for(int i = 0;i < p;i++){
			for(int j = cs[i]+1;j < n && s[j] != '0';j++){
				rs[i]++;
			}
		}
		int[][] dp = new int[p+1][4]; // none,left,right,almost
		for(int i = 0;i < p;i++){
			dp[i+1][0] = Math.max(dp[i+1][0], dp[i][0]);
			dp[i+1][1] = Math.max(dp[i+1][1], dp[i][0] + ls[i]);
			dp[i+1][2] = Math.max(dp[i+1][2], dp[i][0] + rs[i]);
			dp[i+1][3] = Math.max(dp[i+1][3], dp[i][0] + rs[i]-1);
			
			boolean con = i > 0 && ls[i] == cs[i] - cs[i-1]-1;
			boolean nei = i > 0 && 2 == cs[i] - cs[i-1];
			dp[i+1][0] = Math.max(dp[i+1][0], dp[i][1]);
			if(!nei)dp[i+1][1] = Math.max(dp[i+1][1], dp[i][1] + (con ? ls[i] - 1 : ls[i]));
			if(!nei)dp[i+1][2] = Math.max(dp[i+1][2], dp[i][1] + rs[i]);
			if(!nei)dp[i+1][3] = Math.max(dp[i+1][3], dp[i][1] + rs[i]-1);
			
			dp[i+1][0] = Math.max(dp[i+1][0], dp[i][2]);
			if(!con){
				dp[i+1][1] = Math.max(dp[i+1][1], dp[i][2] + ls[i]);
				dp[i+1][2] = Math.max(dp[i+1][2], dp[i][2] + rs[i]);
				dp[i+1][3] = Math.max(dp[i+1][3], dp[i][2] + rs[i]-1);
			}

			dp[i+1][0] = Math.max(dp[i+1][0], dp[i][3]);
			dp[i+1][1] = Math.max(dp[i+1][1], dp[i][3] + (con ? 1 : ls[i]));
			dp[i+1][2] = Math.max(dp[i+1][2], dp[i][3] + rs[i]);
			dp[i+1][3] = Math.max(dp[i+1][3], dp[i][3] + rs[i]-1);
		}
		out.println(Arrays.stream(dp[p]).max().getAsInt());
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
