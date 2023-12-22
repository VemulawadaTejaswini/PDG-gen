import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.SplittableRandom;

public class Main {
	static InputStream is;
	static PrintWriter out;
	static String INPUT = "";
	
	static int[][] make(int D1)
	{
		int[][] d1s = new int[1000][];
		int p = 0;
		for(int x = 0;x*x <= D1;x++){
			int y = (int)Math.sqrt(D1-x*x);
			if(x*x+y*y == D1){
				d1s[p++] = new int[]{x, y};
				if(y > 0){
					d1s[p++] = new int[]{-x, y};
				}
			}
		}
		return Arrays.copyOf(d1s, p);
	}
	
	static void solve()
	{
		int n = ni(), D1 = ni(), D2 = ni();
		if(D1 > D2){
			int d = D1; D1 = D2; D2 = d;
		}
		
		// 1 2 box
		// 1 4 keima
		// 1 8 2ok 2ng
		// 1 10 
		// 2 4
		// 2 5
		// 2 8
		// 2 13
		
		int[][] s1 = make(D1);
		int[][] s2 = make(D2);
		
		boolean[][] map = greedy1(n, s1, s2);
		
		if(map == null)map = greedy2(n, s1, s2);
		if(map == null)map = greedy3(n, s1, s2);
		if(map == null)map = greedy4(n, s1, s2);
		if(map == null)map = greedy5(n, s1, s2);
		if(map == null)map = sa(n, s1, s2);
		// 109 26 25
//		assert put == n*n;
		
		for(int i = 0;i < 2*n;i++){
			for(int j = 0;j < 2*n;j++){
				if(map[i][j]){
					out.println(i + " " + j);
				}
			}
		}
	}
	
	static boolean[][] sa(int n, int[][] s1, int[][] s2)
	{
		boolean[][] map = new boolean[2*n][2*n];
		
//		int put = 0;
//		for(int i = 0;i < 2*n;i++){
//			for(int j = 0;j < 2*n;j++){
//				if(pex(i, j, n, map, s1) == 0 && 
//						pex(i, j, n, map, s2) == 0){
//					map[i][j] = true;
//					put++;
//				}
//			}
//		}
		
		int put = 0;
		for(int i = 0;i < n;i++){
			for(int j = 0;j < n;j++){
				inner:
				for(int k = 0;k < 2;k++){
					for(int l = 0;l < 2;l++){
						if(pex(i*2+k, j*2+l, n, map, s1) == 0 && 
								pex(i*2+k, j*2+l, n, map, s2) == 0){
							map[i*2+k][j*2+l] = true;
							put++;
							break inner;
						}
					}
				}
			}
		}
		
		for(int i = 0;i < 2*n;i++){
			for(int j = 0;j < 2*n;j++){
				if(put < n*n && !map[i][j]){
					map[i][j] = true;
					put++;
				}
			}
		}
		
		
//		for(int i = 0;i < n;i++){
//			for(int j = 0;j < n;j++){
//				map[i][j] = true;
//			}
//		}
		int pe = 0;
		for(int i = 0;i < 2*n;i++){
			for(int j = 0;j < 2*n;j++){
				if(map[i][j]){
					pe += pe(i, j, n, map, s1);
					pe += pe(i, j, n, map, s2);
				}
			}
		}
		
		SplittableRandom gen = new SplittableRandom();
		while(pe > 0){
			int x = gen.nextInt(2*n);
			int y = gen.nextInt(2*n);
			if(!map[x][y])continue;
			
			int tx = -1, ty = -1;
			while(true){
				tx = gen.nextInt(2*n);
				ty = gen.nextInt(2*n);
				if(map[tx][ty])continue;
				break;
			}
			
			int npe = pe;
			npe -= pex(x, y, n, map, s1);
			npe -= pex(x, y, n, map, s2);
			map[x][y] = false;
			map[tx][ty] = true;
			npe += pex(tx, ty, n, map, s1);
			npe += pex(tx, ty, n, map, s2);
			
			if(npe <= pe){
				pe = npe;
			}else{
				map[x][y] = true;
				map[tx][ty] = false;
			}
		}
		return map;
	}
	
	static boolean[][] greedy2(int n, int[][] s1, int[][] s2)
	{
		boolean[][] map = new boolean[2*n][2*n];
		int put = 0;
		for(int i = 0;i < n;i++){
			for(int j = 0;j < n;j++){
				inner:
				for(int k = 0;k < 2;k++){
					for(int l = 0;l < 2;l++){
						if(pex(i*2+k, j*2+l, n, map, s1) == 0 && 
								pex(i*2+k, j*2+l, n, map, s2) == 0){
							map[i*2+k][j*2+l] = true;
							if(++put == n*n)return map;
							break inner;
						}
					}
				}
			}
		}
		return null;
	}
	
	static boolean[][] greedy3(int n, int[][] s1, int[][] s2)
	{
		boolean[][] map = new boolean[2*n][2*n];
		int put = 0;
		for(int i = 0;i < n;i++){
			for(int j = 0;j < n;j++){
				inner:
				for(int k = 0;k < 2;k++){
					for(int l = 0;l < 2;l++){
						if(pex(i+k*n, j+l*n, n, map, s1) == 0 && 
								pex(i+k*n, j+l*n, n, map, s2) == 0){
							map[i+k*n][j+l*n] = true;
							if(++put == n*n)return map;
							break inner;
						}
					}
				}
			}
		}
		return null;
	}
	
	static boolean[][] greedy1(int n, int[][] s1, int[][] s2)
	{
		boolean[][] map = new boolean[2*n][2*n];
		int put = 0;
		for(int i = 0;i < 2*n;i++){
			for(int j = 0;j < 2*n;j++){
				if(pex(i, j, n, map, s1) == 0 && 
						pex(i, j, n, map, s2) == 0){
					map[i][j] = true;
					if(++put == n*n)return map;
				}
			}
		}
		return null;
	}
	
	static boolean[][] greedy5(int n, int[][] s1, int[][] s2)
	{
		boolean[][] map = new boolean[2*n][2*n];
		int put = 0;
		for(int q = 0;q < n;q++){
			for(int i = 0;i < 2*q+1;i++){
				int x = n-1-q+i, y = n-1-q;
				assert !map[x][y];
				if(pex(x, y, n, map, s1) == 0 && 
						pex(x, y, n, map, s2) == 0){
					map[x][y] = true;
					if(++put == n*n)return map;
				}
			}
			for(int i = 0;i < 2*q+1;i++){
				int x = n+q, y = n-1-q+i;
				assert !map[x][y];
				if(pex(x, y, n, map, s1) == 0 && 
						pex(x, y, n, map, s2) == 0){
					map[x][y] = true;
					if(++put == n*n)return map;
				}
			}
			for(int i = 0;i < 2*q+1;i++){
				int x = n+q-i, y = n+q;
				assert !map[x][y];
				if(pex(x, y, n, map, s1) == 0 && 
						pex(x, y, n, map, s2) == 0){
					map[x][y] = true;
					if(++put == n*n)return map;
				}
			}
			for(int i = 0;i < 2*q+1;i++){
				int x = n-1-q, y = n+q-i;
				assert !map[x][y];
				if(pex(x, y, n, map, s1) == 0 && 
						pex(x, y, n, map, s2) == 0){
					map[x][y] = true;
					if(++put == n*n)return map;
				}
			}
		}
		return null;
	}
	
	static boolean[][] greedy4(int n, int[][] s1, int[][] s2)
	{
		for(int rep = 0;rep < 10;rep++){
			boolean[][] map = new boolean[2*n][2*n];
			int[] ord = shuffle(4*n*n, new Random());
			int put = 0;
			for(int q = 0;q < 4*n*n;q++){
				int i = ord[q]/(2*n);
				int j = ord[q]%(2*n);
				if(pex(i, j, n, map, s1) == 0 && 
						pex(i, j, n, map, s2) == 0){
					map[i][j] = true;
					if(++put == n*n)return map;
				}
			}
		}
		return null;
	}
	
	public static int[] shuffle(int n, Random gen){ int[] a = new int[n]; for(int i = 0;i < n;i++)a[i] = i; for(int i = 0;i < n;i++){ int ind = gen.nextInt(n-i)+i; int d = a[i]; a[i] = a[ind]; a[ind] = d; } return a; }

	
	static int pe(int i, int j, int n, boolean[][] map, int[][] s1)
	{
		int pe = 0;
		for(int[] e : s1){
			int ni = i + e[0], nj = j + e[1];
			if(ni >= 0 && ni < 2*n && nj < 2*n && map[ni][nj]){
				pe++;
			}
		}
		return pe;
	}
	
	static int pex(int i, int j, int n, boolean[][] map, int[][] s1)
	{
		int pe = 0;
		for(int[] e : s1){
			{
				int ni = i + e[0], nj = j + e[1];
				if(ni >= 0 && ni < 2*n && nj < 2*n && map[ni][nj]){
					pe++;
				}
			}
			{
				int ni = i - e[0], nj = j - e[1];
				if(ni >= 0 && ni < 2*n && nj >= 0 && map[ni][nj]){
					pe++;
				}
			}
		}
		return pe;
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
