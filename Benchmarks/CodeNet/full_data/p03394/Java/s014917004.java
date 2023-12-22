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
		// 30000
		int n = ni();
		
		int[] freq = new int[30];
		for(int i = 1;i <= 30000;i++){
			if(i % 2 == 0 || i % 3 == 0 || i % 5 == 0){
				freq[i%30]++;
			}
		}
//		tr(freq);
		
		int[] use = new int[30];
		if(n >= 90){
			boolean found = false;
			out:
			for(int i = 0;i <= 40;i++){
				for(int j = 0;j <= 40;j++){
					int k = n%30+30-i-j;
					if(k < 0)continue;
					
					if((2*i+3*j+5*k) % 30 == 0){
						use[2] += i;
						use[3] += j;
						use[5] += k;
						freq[2] -= i;
						freq[3] -= j;
						freq[5] -= k;
						n -= i+j+k;
						found = true;
						break out;
					}
				}
			}
			assert n % 30 == 0;
			assert found;
			
			n = n / 30 * 30;
			for(int i = 2;i < 32;i++){
				int ii = i % 30;
				int u = Math.min(n, freq[ii]/30*30);
				use[ii] += u;
				n -= u;
			}
			
			assert n == 0;
		}else if(n > 6){
			boolean found = false;
			out:
			for(int i = 0;i <= n;i++){
				for(int j = 0;i+j <= n;j++){
					int k = n-i-j;
					int[] x = {i, j, k};
					Arrays.sort(x);
					if(x[1] == 0)continue;
					if((2*i+3*j+5*k) % 30 == 0){
						use[2] += i;
						use[3] += j;
						use[5] += k;
						found = true;
						break out;
					}
				}
			}
			assert found;
		}else if(n == 6){
			out.println("2 3 4 5 6 10"); return;
		}else if(n == 5){
			out.println("2 3 4 6 9"); return;
		}else if(n == 4){
			out.println("2 3 4 9"); return;
		}else if(n == 3){
			out.println("2 3 25"); return;
		}
		
		for(int i = 0;i < 30;i++){
			for(int j = i % 30;j <= 30000;j+=30){
				if(j == 0)continue;
				if(use[i] > 0){
					out.print(j + " ");
					use[i]--;
				}else{
					break;
				}
			}
		}
		out.println();
	}
	
	public static int gcd(int a, int b) {
		while (b > 0) {
			int c = a;
			a = b;
			b = c % b;
		}
		return a;
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
