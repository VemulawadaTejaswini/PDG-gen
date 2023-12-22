import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.InputMismatchException;

public class Main {
	static InputStream is;
	static PrintWriter out;
	static String INPUT = "";
	
	static void solve()
	{
		int r1 = ni(), c1 = ni(), r2 = ni(), c2 = ni();
		if(r1 > r2){
			{int r = r1; r1 = r2; r2 = r;}
			{int r = c1; c1 = c2; c2 = r;}
		}
		int n = ni();
		int[][] co = new int[n][];
		for(int i = 0;i < n;i++){
			co[i] = new int[]{ni(), ni()};
		}
		if(c1 > c2){
			c1 = 100000000-c1;
			c2 = 100000000-c2;
			for(int i = 0;i < n;i++){
				co[i][1] = 100000000-co[i][1];
			}
		}
		if(r1 == r2){
			int f = 0;
			for(int i = 0;i < n;i++){
				if(co[i][0] == r1 && Math.min(c1, c2) <= co[i][1] && co[i][1] <= Math.max(c1, c2)){
					f++;
				}
			}
			out.printf("%.14f\n", Math.abs(c1-c2)*100+f*(-20+Math.PI*10));
			return;
		}
		if(c1 == c2){
			int f = 0;
			for(int i = 0;i < n;i++){
				if(co[i][1] == c1 && Math.min(r1, r2) <= co[i][0] && co[i][0] <= Math.max(r1, r2)){
					f++;
				}
			}
			out.printf("%.14f\n", Math.abs(r1-r2)*100+f*(-20+Math.PI*10));
			return;
		}
		int[][] vs = new int[n][];
		int p = 0;
		for(int i = 0;i < n;i++){
			if(r1 <= co[i][0] && co[i][0] <= r2 &&
					Math.min(c1, c2) <= co[i][1] &&
					co[i][1] <= Math.max(c1, c2)){
				vs[p++] = co[i];
			}
		}
		vs = Arrays.copyOf(vs, p);
		Arrays.sort(vs, new Comparator<int[]>() {
			public int compare(int[] a, int[] b) {
				return a[0] - b[0];
			}
		});
		int[] a = new int[p];
		for(int i = 0;i < p;i++)a[i] = vs[i][1];
		int lis = lis(a);
		if(lis == Math.min(Math.abs(r1-r2)+1, Math.abs(c1-c2)+1)){
			out.printf("%.14f\n", (Math.abs(r1-r2)+Math.abs(c1-c2))*100 + lis*(-20+10*Math.PI/2)+Math.PI/2*10);
		}else{
			out.printf("%.14f\n", (Math.abs(r1-r2)+Math.abs(c1-c2))*100 + lis*(-20+10*Math.PI/2));
		}
	}
	
	public static int lis(int[] in)
	{
		int n = in.length;
		int ret = 0;
		int[] h = new int[n + 1];
		Arrays.fill(h, Integer.MIN_VALUE / 2);
		for(int i = 0;i < n;i++){
			int ind = Arrays.binarySearch(h, 0, ret + 1, in[i]);
			if(ind < 0){
				ind = -ind-2;
				h[ind+1] = in[i];
				if(ind >= ret)ret++;
			}
		}
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
