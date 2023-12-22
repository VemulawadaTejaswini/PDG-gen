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
		char[] s = ns().toCharArray();
		int n = s.length;
		long[] cum = new long[n+1];
		for(int i = 0;i < n;i++){
			cum[i+1] = cum[i] + (1L<<s[i]-'a');
		}
		int[][] to = new int[27][n+1];
		for(int j = 0;j < 27;j++){
			int p = 0;
			for(int i = 0;i < n+1;i++){
				while(p <= n && cum[p] - cum[i] < 1<<j){
					p++;
				}
				if(p <= n && cum[p] - cum[i] == 1<<j){
					to[j][i] = p;
				}else{
					to[j][i] = -1;
				}
			}
		}
		
		for(int j = 0;j < 26;j++){
			for(int i = 0;i < n;i++){
				if(to[j][i] != -1){
					int k = to[j][i];
					if(to[j][k] == -1){
						to[j+1][i] = -1;
					}
				}else if(to[j+1][i] != -1 && to[j+1][i] != i+1){
					to[j+1][i] = -1;
				}
			}
		}
		for(int z = 0;z < 26;z++){
			for(int j = 0;j < 26;j++){
				for(int i = 0;i <= n;i++){
					if(to[j][i] != -1 && to[j][to[j][i]] != -1){
						to[j+1][i] = to[j][to[j][i]];
					}
					if(to[j][i] != -1 && to[j+1][i] == -1){
						int k = to[j][i];
						if(to[j][k] == -1 && to[26][k] != -1){
							int l = to[26][k];
							if(to[j][l] != -1){
								to[j+1][i] = to[j][l];
							}
	//						if(to[j][l] != -1){
	//							tr("h", j, i, l, to[j][l], to[j+1][i]);
	//						}
						}
					}
				}
			}
		}
		
		int[] f = to[26];
		int[][] sf = sparseNext(f);
		for(int Q = ni();Q > 0;Q--){
			int l = ni()-1, r = ni()-1+1;
			for(int i = sf.length-1;i >= 0;i--){
				if(sf[i][l] == -1 || sf[i][l] > r){
				}else{
					l = sf[i][l];
				}
			}
			if(l == r){
				out.println("Yes");
			}else{
				out.println("No");
			}
		}
	}
	
	public static int[][] sparseNext(int[] f)
	{
		int n = f.length;
		final int m = 21; // 
		int[][] sf = new int[m][n];
		sf[0] = Arrays.copyOf(f, n);
		for(int i = 1;i < m;i++){
			for(int j = 0;j < n;j++){
				sf[i][j] = sf[i-1][j] == -1 ? -1 : sf[i-1][sf[i-1][j]];
			}
		}
		return sf;
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
