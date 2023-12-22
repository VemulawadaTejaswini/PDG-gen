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
		int[] a = na(n);
		// 16 1 4 1 16
		// 2 2 0
		
		// +4 -2 +2 -4
		// 4 2 4 0
		
		long[] pref = make(a);
		long[] suff = make(rev(a));
		for(int i = 0;i < suff.length;i++){
			suff[i] += (suff.length-i);
		}
		
		long ans = Math.min(pref[0], suff[0]);
		for(int i = 0;i < n-1;i++){
			ans = Math.min(pref[i+1] + suff[n-1-i], ans);
		}
		out.println(ans);
	}
	
	public static int[] rev(int[] a)
	{
		int[] b = new int[a.length];
		for(int i = 0;i < a.length;i++)b[a.length-1-i] = a[i];
		return b;
	}

	
	static long[] make(int[] a)
	{
		int n = a.length;
		int[] pl = new int[n-1];
		for(int i = n-2;i >= 0;i--){
			long v = a[i+1];
			int num = 0;
			while(a[i] > v){
				v *= 4;
				num++;
			}
			long q = a[i];
			while(q*4 <= v){
				q *= 4;
				num--;
			}
			pl[i] = num;
		}
		
		int[] cum = new int[n];
		for(int i = 0;i < n-1;i++){
			cum[i+1] = cum[i] + pl[i];
		}
		st = buildP(cum);
		
		ans = new long[n];
		dfs(0, n, cum, 0L);
		
		long[] prefix = new long[n];
		for(int i = 0;i < n;i++){
			prefix[i] = ans[i] * 2;
		}
		return prefix;
	}
	
	static int[][][] st;
	
	public static int[][][] buildP(int[] a)
	{
		int n = a.length;
		int b = 32-Integer.numberOfLeadingZeros(n);
		int[][] ret = new int[b][];
		int[][] pos = new int[b][];
		for(int i = 0, l = 1;i < b;i++, l*=2) {
			if(i == 0) {
				ret[i] = a;
				pos[i] = new int[n];
				for(int j = 0;j < n;j++)pos[i][j] = j;
			}else {
				ret[i] = new int[n-l+1];
				pos[i] = new int[n-l+1];
				for(int j = 0;j < n-l+1;j++) {
					if(ret[i-1][j] == ret[i-1][j+l/2]){
						ret[i][j] = ret[i-1][j];
						pos[i][j] = Math.max(pos[i-1][j], pos[i-1][j+l/2]);
					}else if(ret[i-1][j] < ret[i-1][j+l/2]){
						ret[i][j] = ret[i-1][j];
						pos[i][j] = pos[i-1][j];
					}else{
						ret[i][j] = ret[i-1][j+l/2];
						pos[i][j] = pos[i-1][j+l/2];
					}
				}
			}
		}
		return new int[][][]{ret, pos};
	}
	
	public static int rmqpos(int[][][] st, int a, int b)
	{
		int t = 31-Integer.numberOfLeadingZeros(b-a);
		if(st[0][t][a] < st[0][t][b-(1<<t)]){
			return st[1][t][a];
		}else{
			return st[1][t][b-(1<<t)];
		}
	}
	
	public static int rmqval(int[][][] st, int a, int b)
	{
		int t = 31-Integer.numberOfLeadingZeros(b-a);
		if(st[0][t][a] < st[0][t][b-(1<<t)]){
			return st[0][t][a];
		}else{
			return st[0][t][b-(1<<t)];
		}
	}
	
	public static int[] rmq(int[][][] st, int a, int b)
	{
		int t = 31-Integer.numberOfLeadingZeros(b-a);
		if(st[0][t][a] < st[0][t][b-(1<<t)+1]){
			return new int[]{st[0][t][a], st[1][t][a]};
		}else{
			return new int[]{st[0][t][b-(1<<t)+1], st[1][t][b-(1<<t)+1]};
		}
	}

	
	static long[] ans;
	
	static void dfs(int l, int r, int[] cum, long offset)
	{
		if(l >= r)return;
//		tr(l, r-1);
		int min = -1, arg = -1;
		if(l == r-1){
			min = cum[l];
			arg = l;
		}else{
			int[] va = rmq(st, l, r-1);
			min = va[0];
			arg = va[1];
		}
//		tr(min, arg, cum, l, r, offset);
		long s = offset;
		for(int i = arg;i < r;i++){
			s += cum[i] - min;
		}
//		tr(s, offset, arg);
		ans[arg] = s;
		dfs(l, arg, cum, s);
		dfs(arg+1, r, cum, offset);
	}
	
	public static void main(String[] args) throws Exception
	{
		long S = System.currentTimeMillis();
		is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());
		out = new PrintWriter(System.out);
		
		Thread t = new Thread(null, null, "~", Runtime.getRuntime().maxMemory()){
			@Override
			public void run() {
				solve();
				out.flush();
			}
		};
		t.start();
		t.join();
		
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
