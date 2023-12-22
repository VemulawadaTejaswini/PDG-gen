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
		int n = ni(), m = ni(), d = ni();
		char[] C = "RGYB".toCharArray();
		if(d % 2 == 0){
			char[][] s = new char[n][m];
			for(int i = -d/2;i < n + d/2;i+=d/2){
				for(int j = -d/2;j < m + d/2;j+=d/2){
					int r = i / (d/2);
					int c = j / (d/2);
					if((r+c)%2 != 0)continue;
					
					char color;
					if((r+c)%4 == 0){
						if((r-c)%4 == 0){
							color = C[0];
						}else{
							color = C[1];
						}
					}else{
						if((r-c)%4 == 0){
							color = C[2];
						}else{
							color = C[3];
						}
					}
					
					int cr = i + d/2 - 1;
					int cc = j;
					for(int k = cr - d/2 + 1;k <= cr + d/2;k++){
						for(int l = cc - d/2 + 1;l <= cc + d/2 - 1;l++){
							if(
									Math.abs(cr - k) + Math.abs(cc - l) <= d/2-1 ||
									Math.abs(cr+1 - k) + Math.abs(cc - l) <= d/2-1){
								if(k >= 0 && k < n && l >= 0 && l < m){
									s[k][l] = color;
								}
							}
						}
					}
				}
			}
			for(char[] row : s){
				out.println(new String(row));
			}
		}else{
			char[][] s = new char[n][m];
			for(int i = 0;i < n;i++){
				for(int j = 0;j < m;j++){
					if((i+j)% 2 == 0){
						s[i][j] = C[0];
					}else{
						s[i][j] = C[1];
					}
				}
			}
//			check(s, d);
			for(char[] row : s){
				out.println(new String(row));
			}
		}
	}
	
	static void check(char[][] map, int d)
	{
		int n = map.length, m = map[0].length;
		for(int i = 0;i < n;i++){
			for(int j = 0;j < m;j++){
				for(int k = 0;k < n;k++){
					for(int l = 0;l < m;l++){
						if(Math.abs(i-k)+Math.abs(j-l) == d){
							if(map[i][j] == map[k][l])throw new RuntimeException();
						}
					}
				}
			}
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
