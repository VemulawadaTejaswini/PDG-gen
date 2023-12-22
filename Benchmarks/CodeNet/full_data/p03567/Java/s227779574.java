import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;

public class I3 {
	InputStream is;
	PrintWriter out;
	String INPUT = "";
	
	long[] fs;
	int mod = 1000000007;
	long[][] C;
	int Z = 2200;
	long[][] lmp;
	long[][] cmp;
	
	void preprocess()
	{
		fs = new long[Z];
		fs[0] = 1;
		for(int i = 1;i < Z;i++){
			fs[i] = fs[i-1] * i % mod;
		}
		C = new long[Z][Z];
		for(int i = 0;i < Z;i++){
			C[i][0] = 1;
			for(int j = 1;j <= i;j++){
				C[i][j] = C[i-1][j-1] + C[i-1][j];
				if(C[i][j] >= mod)C[i][j] -= mod;
			}
		}
		long[] psum = new long[Z];
		lmp = new long[Z][Z];
		cmp = new long[Z][Z];
		for(int i = 0;i < Z;i++){
			for(int j = 2*i;j < Z;j++){
				lmp[j][i] = i > 0 ? psum[j-2] : 1;
				cmp[j][i] = i > 0 ? psum[j-2] + lmp[j-2][i-1] : 1;
				if(cmp[j][i] >= mod)cmp[j][i] -= mod;
			}
			psum[0] = lmp[0][i];
			for(int j = 1;j < Z;j++){
				psum[j] = psum[j-1] + lmp[j][i];
				if(psum[j] >= mod)psum[j] -= mod;
			}
		}
	}
	
	long[] getPoly(int[] cs, int l, int r)
	{
		if(r-l == 1){
			return Arrays.copyOf(cmp[cs[l]*2], cs[l]+1);
		}
		int h = (l+r)/2;
		long[] p1 = getPoly(cs, l, h);
		long[] p2 = getPoly(cs, h, r);
		long[] res = new long[p1.length+p2.length-1];
//		tr(p1, p2, deg);
		for(int i = 0;i < p1.length;i++){
			for(int j = 0;j < p2.length;j++){
				res[i+j] += p1[i]*p2[j];
				res[i+j] %= mod;
			}
		}
		return res;
	}
	
	long solve(int[] cs, int n)
	{
		long[] f = getPoly(cs, 0, cs.length);
		for(int i = n;i >= 0;i--){
			f[i] = f[i] * fs[n-i] % mod;
			for(int l = i+1;l <= n;l++){
				f[i] -= f[l]*C[l][i];
				f[i] %= mod;
				if(f[i] < 0)f[i] += mod;
			}
		}
		return f[0];
	}
	
	void solve()
	{
		preprocess();
		for(int T = 1;T > 0;T--){
			int n = ni();
			int[] a = na(n);
			int[] b = na(n);
			for(int i = 0;i < n;i++)a[i]--;
			for(int i = 0;i < n;i++)b[i]--;
			int[] ib = new int[n];
			for(int i = 0;i < n;i++)ib[b[i]] = i;
			int[] f = new int[n];
			
			for(int i = 0;i < n;i++)f[i] = ib[a[i]];
			int[] cs = splitIntoCycleSizes(f);
			Arrays.sort(cs);
			out.println(solve(cs, n));
		}
	}
	
	public static int[] splitIntoCycleSizes(int[] f)
	{
		int n = f.length;
		int[] szs = new int[n];
		boolean[] ved = new boolean[n];
		int q = 0;
		for(int i = 0;i < n;i++){
			if(!ved[i]){
				int p = 0;
				for(int cur = i;!ved[cur];cur = f[cur], p++)ved[cur] = true;
				szs[q++] = p;
			}
		}
		return Arrays.copyOf(szs, q);
	}
	
	public static boolean nextPermutation(int[] a) {
		int n = a.length;
		int i;
		for (i = n - 2; i >= 0 && a[i] >= a[i + 1]; i--)
			;
		if (i == -1)
			return false;
		int j;
		for (j = i + 1; j < n && a[i] < a[j]; j++)
			;
		int d = a[i];
		a[i] = a[j - 1];
		a[j - 1] = d;
		for (int p = i + 1, q = n - 1; p < q; p++, q--) {
			d = a[p];
			a[p] = a[q];
			a[q] = d;
		}
		return true;
	}

	
	void run() throws Exception
	{
		is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());
		out = new PrintWriter(System.out);
		
		long s = System.currentTimeMillis();
		solve();
		out.flush();
		if(!INPUT.isEmpty())tr(System.currentTimeMillis()-s+"ms");
	}
	
	public static void main(String[] args) throws Exception { new I3().run(); }
	
	private byte[] inbuf = new byte[1024];
	public int lenbuf = 0, ptrbuf = 0;
	
	private int readByte()
	{
		if(lenbuf == -1)throw new InputMismatchException();
		if(ptrbuf >= lenbuf){
			ptrbuf = 0;
			try { lenbuf = is.read(inbuf); } catch (IOException e) { throw new InputMismatchException(); }
			if(lenbuf <= 0)return -1;
		}
		return inbuf[ptrbuf++];
	}
	
	private boolean isSpaceChar(int c) { return !(c >= 33 && c <= 126); }
	private int skip() { int b; while((b = readByte()) != -1 && isSpaceChar(b)); return b; }
	
	private double nd() { return Double.parseDouble(ns()); }
	private char nc() { return (char)skip(); }
	
	private String ns()
	{
		int b = skip();
		StringBuilder sb = new StringBuilder();
		while(!(isSpaceChar(b))){ // when nextLine, (isSpaceChar(b) && b != ' ')
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}
	
	private char[] ns(int n)
	{
		char[] buf = new char[n];
		int b = skip(), p = 0;
		while(p < n && !(isSpaceChar(b))){
			buf[p++] = (char)b;
			b = readByte();
		}
		return n == p ? buf : Arrays.copyOf(buf, p);
	}
	
	private char[][] nm(int n, int m)
	{
		char[][] map = new char[n][];
		for(int i = 0;i < n;i++)map[i] = ns(m);
		return map;
	}
	
	private int[] na(int n)
	{
		int[] a = new int[n];
		for(int i = 0;i < n;i++)a[i] = ni();
		return a;
	}
	
	private int ni()
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
	
	private long nl()
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
	
	private static void tr(Object... o) { System.out.println(Arrays.deepToString(o)); }
}