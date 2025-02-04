import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.PriorityQueue;

public class Main {
	static InputStream is;
	static PrintWriter out;
	static String INPUT = "";
	
	static void solve()
	{
		int n = ni(), Q = ni();
		PriorityQueue<int[]> pq = new PriorityQueue<>((x,y) -> x[2]-y[2]);
		for(int i = 0;i < Q;i++){
			int[] q = new int[]{ni(), ni(), ni()};
			pq.add(q);
		}
		DJSet ds = new DJSet(n);
		DJSet xds = new DJSet(3*n+1);
		long ret = 0;
		int con = 0;
		while(true){
			int[] cur = pq.poll();
			if(!ds.union(cur[0], cur[1])){
//				tr("union", cur[0], cur[1]);
				ret += cur[2];
				if(++con == n-1){
					break;
				}
			}
			int[] nm = new int[2];
			
			for(int i = 0;i < 2;i++){
				while(true){
//					tr(cur[i], xds.max[xds.root(cur[i])] + 1);
					int nv = xds.max[xds.root(cur[i])] + 1;
					nm[i] = nv % n;
					if(ds.equiv(cur[i], nv % n)){
//						tr("union", cur[i], nv);
						xds.union(cur[i], nv);
						xds.union(cur[i]+n, nv+n);
					}else{
						break;
					}
				}
			}
//			tr("nmcur", nm, cur);
			// 1 3 5 7 9
			int d0 = nm[0]-cur[0];
			assert d0 != 0;
			if(d0 < 0)d0 += n;
			
			int d1 = nm[1]-cur[1];
			assert d1 != 0;
			if(d1 < 0)d1 += n;
			
			if(d0 <= d1){
				int n0 = cur[1] + d0-1;
				int n1 = cur[0] + d0;
				n0 %= n;
				n1 %= n;
				cur[0] = n0; cur[1] = n1;
				cur[2]+=2*d0-1;
				pq.add(cur);
			}else{
				int n0 = cur[0] + d1;
				int n1 = cur[1] + d1;
				n0 %= n;
				n1 %= n;
				cur[0] = n0; cur[1] = n1;
				cur[2]+=2*d1;
				pq.add(cur);
			}
		}
		out.println(ret);
	}
	
	public static class DJSet {
		public int[] upper;
		public int[] max;

		public DJSet(int n) {
			upper = new int[n];
			max = new int[n];
			Arrays.fill(upper, -1);
			for(int i = 0;i < n;i++){
				max[i] = i;
			}
		}

		public int root(int x) {
			return upper[x] < 0 ? x : (upper[x] = root(upper[x]));
		}

		public boolean equiv(int x, int y) {
			return root(x) == root(y);
		}

		public boolean union(int x, int y) {
			x = root(x);
			y = root(y);
			if (x != y) {
				if (upper[y] < upper[x]) {
					int d = x;
					x = y;
					y = d;
				}
				max[x] = Math.max(max[x], max[y]);
				upper[x] += upper[y];
				upper[y] = x;
			}
			return x == y;
		}

		public int count() {
			int ct = 0;
			for (int u : upper)
				if (u < 0)
					ct++;
			return ct;
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
