import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;

public class Main {
	static InputStream is;
	static PrintWriter out;
	static String INPUT = "";
	
	static int M;
	static long[][] win;
	
	static void solve()
	{
		int n = ni();
		char[][] map = new char[n][];
		for(int i = 1;i < n;i++){
			map[i] = ns().toCharArray();
		}
		
		M = (n>>>6)+1;
		win = new long[n][M];
		for(int i = 0;i < n;i++){
			for(int j = 0;j < i;j++){
				if(map[i][j] == '1'){
					win[i][j>>>6] |= 1L<<j;
				}else{
					win[j][i>>>6] |= 1L<<i;
				}
			}
		}
		
		int ct = 0;
		rcache = new int[n][n];
		lcache = new int[n][n];
		wcache = new int[n][n];
		for(int i = 0;i < n;i++){
			if(rwin(0, i) && lwin(i, n-1)){
				ct++;
			}
		}
//		for(int[] u : rcache){
//			tr(u);
//		}
		out.println(ct);
	}
	
	static int[][] rcache;
	static int[][] lcache;
	static int[][] wcache;
	static Random gen = new Random();
	
	static boolean wwin(int l, int r)
	{
		if(wcache[l][r] != 0)return wcache[l][r] == 1;
		if(r-l >= 50){
			for(int k = 0;k < 50;k++){
				int j = l + gen.nextInt(r-l);
				if(lwin(l, j) && rwin(j+1, r)){
					wcache[l][r] = 1;
					return true;
				}
			}
		}else{
			for(int j = l;j <= r-1;j++){
				if(lwin(l, j) && rwin(j+1, r)){
					wcache[l][r] = 1;
					return true;
				}
			}
		}
		wcache[l][r] = -1;
		return false;
	}
	
	// in [0,r] r win?
	static boolean rwin(int l, int r)
	{
		if(rcache[l][r] != 0)return rcache[l][r] == 1;
		assert l <= r;
		if(l == r){
			rcache[l][r] = 1;
			return true;
		}
		
		if(r-l >= 50){
			for(int k = 0;k < 50;k++){
				int i = l + gen.nextInt(r-l);
				if(win[r][i>>>6]<<~i<0){
					boolean ret = rwin(l, i) && wwin(i, r);
					if(ret){
						rcache[l][r] = 1;
						return true;
					}
				}
			}
		}else{
			for(int i = r-1;i >= l;i--){
				if(win[r][i>>>6]<<~i<0){
					boolean ret = rwin(l, i) && wwin(i, r);
					if(ret){
						rcache[l][r] = 1;
						return true;
					}
				}
			}
		}
		rcache[l][r] = -1;
		return false;
	}
	
	static boolean lwin(int l, int r)
	{
		if(lcache[l][r] != 0)return lcache[l][r] == 1;
		assert l <= r;
		if(l == r){
			lcache[l][r] = 1;
			return true;
		}
		
		if(r-l >= 50){
			for(int k = 0;k < 50;k++){
				int i = l+1 + gen.nextInt(r-l);
				if(win[l][i>>>6]<<~i<0){
					boolean ret = lwin(i, r) && wwin(l, i);
					if(ret){
						lcache[l][r] = 1;
						return true;
					}
				}
			}
		}else{
			for(int i = l+1;i <= r;i++){
				if(win[l][i>>>6]<<~i<0){
					boolean ret = lwin(i, r) && wwin(l, i);
					if(ret){
						lcache[l][r] = 1;
						return true;
					}
				}
			}
		}
		lcache[l][r] = -1;
		return false;
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
