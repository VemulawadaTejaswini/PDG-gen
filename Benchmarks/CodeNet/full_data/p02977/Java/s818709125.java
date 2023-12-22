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
	
	// 5-4-3-2-5-4-3-2
	
	static void solve()
	{
		int n = ni();
		if(n % 4 == 3){
			out.println("Yes");
			for(int i = 1;i <= 2*n-1;i++){
				out.println(i + " " + (i+1));
			}
		}else if(n % 4 == 2){
			if(n == 2){
				out.println("No");
			}else{
				int[] a = new int[2*n-2];
				int p = 0;
				a[p++] = n/4*4;
				for(int i = 2;i <= n;i++){
					if(i == n/4*4)continue;
					a[p++] = i;
				}
				a[p++] = n/4*4+n;
				for(int i = 2;i <= n;i++){
					if(i == n/4*4)continue;
					a[p++] = i+n;
				}
				for(int i = 0;i < 2*n-3;i++){
					out.println(a[i] + " " + a[i+1]);
				}
				out.println(1 + " " + 2);
				out.println((n+1) + " " + 3);
				out.println(n + " " + 2);
				out.println((n+n) + " " + n/4*4);
			}
		}else if(n % 4 == 0){
			if((n&n-1) == 0){
				out.println("No");
			}else{
				int[] a = new int[2*n-2];
				int p = 0;
				int x = Integer.highestOneBit(n);
				int y = n-x;
				for(int i = 1;i <= n-1;i++){
					if(i == x)continue;
					if(i == y)continue;
					a[p++] = i;
				}
				a[p++] = x;
				a[p++] = y;
				for(int i = 1;i <= n-1;i++){
					if(i == x)continue;
					if(i == y)continue;
					a[p++] = i+n;
				}
				a[p++] = x+n;
				a[p++] = y+n;
				for(int i = 0;i < 2*n-3;i++){
					out.println(a[i] + " " + a[i+1]);
				}
				out.println(n + " " + x);
				out.println((n+n) + " " + y);
			}
		}else if(n % 4 == 1){
			if(n == 1){
				out.println("No");
			}else{
				for(int i = 2;i <= 2*n-1;i++){
					if(i == n+1)continue;
					int ne = i == n ? n+2 : i+1;
					out.println(i + " " + ne);
				}
				out.println(1 + " " + 2);
				out.println((n+1) + " " + 3);
			}
		}else{
			out.println("No");
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
