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
		int s = 0;
		for(int v : a){
			s += v;
		}
		int h = s/2;
		int m = (h>>>6)+1;
		long[] dp = new long[m];
		dp[0] = 1;
		for(int v : a){
			long[] temp = Arrays.copyOf(dp, m);
			or(temp, 0, m*64-v, dp, v);
		}
		for(int i = s/2;i >= 0;i--){
			if(dp[i>>>6]<<~i<0){
				out.println(s-i);
				return;
			}
		}
	}
	
	public static void or(long[] from, int fl, int fr, long[] to, int tl)
	{
		if(!(fl >= 0 && fl < from.length<<6))throw new RuntimeException();
		if(!(fr >= 0 && fr <= from.length<<6))throw new RuntimeException();
		if(!(tl >= 0 && tl < to.length<<6))throw new RuntimeException();
		if(!(tl+(fr-fl) >= 0 && tl+(fr-fl) <= to.length<<6))throw new RuntimeException();
		if(fl >= fr)return;
		
		int tr = tl+(fr-fl);
		if(tl>>>6 == tr-1>>>6){
			if(fl>>>6 == fr-1>>>6){
				to[tl>>>6] |= from[fl>>>6]<<-fr>>>fl-fr<<tl;
			}else{
				to[tl>>>6] |= from[fl>>>6]>>>fl<<tl | from[(fl>>>6)+1]<<-fr>>>-fr<<tr-fr;
			}
		}else if((fl&63) < (tl&63)){
			to[tl>>>6] |= from[fl>>>6]>>>fl<<tl;
			for(int i = (tl>>>6)+1, j = (fl>>>6);i <= (tr-1>>>6)-1;i++,j++){
				to[i] |= from[j]>>>fl-tl | from[j+1]<<-(fl-tl);
			}
			if((fr-1&63) < (tr-1&63)){
				to[tr-1>>>6] |= from[(fr-1>>>6)-1]>>>fl-tl | from[fr-1>>>6]<<-fr>>>-tr;
			}else{
				to[tr-1>>>6] |= from[fr-1>>>6]<<-fr>>>-tr;
			}
		}else if((fl&63) > (tl&63)){
			to[tl>>>6] |= from[fl>>>6]>>>fl<<tl | from[(fl>>>6)+1]<<-(fl-tl);
			for(int i = (tl>>>6)+1, j = (fl>>>6)+1;i <= (tr-1>>>6)-1;i++,j++){
				to[i] |= from[j]>>>fl-tl | from[j+1]<<-(fl-tl);
			}
			if((fr-1&63) > (tr-1&63)){
				to[tr-1>>>6] |= from[fr-1>>>6]<<-fr>>>-tr;
			}else{
				to[tr-1>>>6] |= from[(fr-1>>>6)-1]>>>fl-tl | from[fr-1>>>6]<<-fr>>>-tr;
			}
		}else{
			to[tl>>>6] |= from[fl>>>6]>>>fl<<tl;
			for(int i = (tl>>>6)+1, j = (fl>>>6)+1;i <= (tr-1>>>6)-1;i++,j++){
				to[i] |= from[j];
			}
			to[tr-1>>>6] |= from[fr-1>>>6]<<-fr>>>-tr;
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
