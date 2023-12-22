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
		int n = ni();
		int[][] wh = new int[n][];
		for(int i = 0;i < n;i++){
			wh[i] = new int[]{ni(), ni()};
		}
		int[][] xs = new int[2*n][];
		for(int i = 0;i < n;i++){
			xs[i] = new int[]{wh[i][0], i, 0};
			xs[i+n] = new int[]{wh[i][1], i, 1};
		}
		Arrays.sort(xs, new Comparator<int[]>() {
			public int compare(int[] a, int[] b) {
				return a[0] - b[0];
			}
		});
		int[][] ix = new int[n][2];
		for(int i = 0;i < 2*n;i++){
			ix[xs[i][1]][xs[i][2]] = i;
		}
		
		int B = Math.max(1, (int)Math.sqrt(2*n));
		int low = 0, high = 1000000000/(n-1)+7;
		int sup = 2*n*2+2*n*(2*n/B+1)*2+2*n*B*3;
//		int sup = 10000000;
		int[] from = new int[sup];
		int[] to = new int[sup];
		int Q = 2*n/B+1;
		outer:
		while(high - low > 1){
			int d = high+low>>1;
			int p = 0;
			for(int j = 0;j < 2*n;j++){
				from[p] = xs[j][2]*n+xs[j][1];
				to[p] = 2*n+j/B;
				p++;
				from[p] = 2*n+Q+j/B;
				to[p] = (1^xs[j][2])*n+xs[j][1];
				p++;
			}
			for(int i = 0;i < 2*n;i++){
				for(int j = 0;j < 2*n;j+=B){
					int k = Math.min(j+B-1, 2*n-1);
					if(i/B != j/B && Math.abs(xs[i][0]-xs[j][0]) < d &&
							Math.abs(xs[i][0]-xs[k][0]) < d){
						from[p] = xs[i][2]*n+xs[i][1];
						to[p] = 2*n+Q+j/B;
						p++;
						from[p] = 2*n+j/B;
						to[p] = (1^xs[i][2])*n+xs[i][1];
						p++;
					}else if(Math.abs(xs[i][0]-xs[j][0]) < d ||
							Math.abs(xs[i][0]-xs[k][0]) < d ||
							xs[j][0] <= xs[i][0] && xs[i][0] <= xs[k][0]
							){
						for(int l = j;l <= k;l++){
							if(i == l)continue;
							if(Math.abs(xs[i][0]-xs[l][0]) < d){
								from[p] = xs[i][2]*n+xs[i][1];
								to[p] = (1^xs[l][2])*n+xs[l][1];
								p++;
								from[p] = xs[l][2]*n+xs[l][1];
								to[p] = (1^xs[i][2])*n+xs[i][1];
								p++;
							}
						}
					}
				}
			}
			int[][] g = packD(2*n+2*Q, from, to, p);
			int[] clus = decomposeToSCC(g);
			for(int j = 0;j < n;j++){
				if(clus[j] == clus[j+n]){
					high = d;
					continue outer;
				}
			}
			low = d;
		}
		out.println(low);
	}
	
	public static int[][] packD(int n, int[] from, int[] to){ return packD(n, from, to, from.length);}
	public static int[][] packD(int n, int[] from, int[] to, int sup)
	{
		int[][] g = new int[n][];
		int[] p = new int[n];
		for(int i = 0;i < sup;i++)p[from[i]]++;
		for(int i = 0;i < n;i++)g[i] = new int[p[i]];
		for(int i = 0;i < sup;i++){
			g[from[i]][--p[from[i]]] = to[i];
		}
		return g;
	}
	
	public static int[] decomposeToSCC(int[][] g)
	{
		int n = g.length;
		int[] stack = new int[n+1];
		int[] ind = new int[n+1];
		int[] ord = new int[n];
		Arrays.fill(ord, -1);
		int[] low = new int[n];
		Arrays.fill(low, -1);
		int sp = 0;
		int id = 0; // preorder
		int[] clus = new int[n];
		int cid = 0;
		int[] cstack = new int[n+1];
		int csp = 0;
		boolean[] incstack = new boolean[n];
		for(int i = 0;i < n;i++){
			if(ord[i] == -1){
				ind[sp] = 0;
				cstack[csp++] = i;
				stack[sp++] = i;
				incstack[i] = true;
				while(sp > 0){
					int cur = stack[sp-1];
					if(ind[sp-1] == 0){
						ord[cur] = low[cur] = id++;
					}
					if(ind[sp-1] < g[cur].length){
						int nex = g[cur][ind[sp-1]];
						if(ord[nex] == -1){
							ind[sp-1]++;
							ind[sp] = 0;
							incstack[nex] = true;
							cstack[csp++] = nex;
							stack[sp++] = nex;
						}else{
							// shortcut
//							U.tr(cur, nex, incstack[nex], low[nex], stack);
							if(incstack[nex])low[cur] = Math.min(low[cur], low[nex]);
							ind[sp-1]++;
						}
					}else{
						if(ord[cur] == low[cur]){
							while(csp > 0){
								incstack[cstack[csp-1]] = false;
								clus[cstack[--csp]] = cid;
								if(cstack[csp] == cur)break;
							}
							cid++;
						}
						if(--sp >= 1)low[stack[sp-1]] = Math.min(low[stack[sp-1]], low[stack[sp]]);
					}
				}
			}
		}
		return clus;
	}

	
	static int i(int x, int n)
	{
		return x < n ? x + n : x - n;
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
