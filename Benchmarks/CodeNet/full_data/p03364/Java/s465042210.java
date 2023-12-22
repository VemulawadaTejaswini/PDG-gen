import java.io.*;
import java.util.*;

class Hash{
	long h1, h2;
	
	public Hash(long h1, long h2) {
		super();
		this.h1 = h1;
		this.h2 = h2;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (h1 ^ (h1 >>> 32));
		result = prime * result + (int) (h2 ^ (h2 >>> 32));
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hash other = (Hash) obj;
		if (h1 != other.h1)
			return false;
		if (h2 != other.h2)
			return false;
		return true;
	}
	
}

class RollingHash{
	final long[] base = {1007, 2009};
	final long[] mod = {1_000_000_007,1_000_000_009};
	long[][] hash, power;
	String s;
	RollingHash(String s) {
		this.s = s;
		hash = new long[1][s.length() + 1];
		power = new long[1][s.length() + 1];
		power[0][0] = power[0][0] = 1;
		for(int i=0;i<1;i++) {
			for(int j=0;j<s.length();j++) {
				hash[i][j+1] = (hash[i][j] * base[i] + s.charAt(j)) % mod[i];
				power[i][j+1] = power[i][j] * base[i] % mod[i]; 
			}
		}
	}
	
	/** get hash of S[left:right] **/
	Hash getHash(int l, int r) {
		long h[] = new long[2];
		for(int i=0;i<1;i++) {
			h[i] = hash[i][r] - hash[i][l] * power[i][r - l] % mod[i];
			if(h[i] < 0) h[i] += mod[i]; 
		}
		return new Hash(h[0], h[0]);
	}
	
	/** Returns idxs in S with which T starts **/ 
	ArrayList<Integer> getIdxs(String t){
		if(s.length() < t.length()) return new ArrayList<>();
		long[] sHash = new long[2];
		long[] tHash = new long[2];
		boolean[][] idxs = new boolean[2][s.length()];
		for(int i=0;i<2;i++) {
			for(int j=0;j<t.length();j++) {
				sHash[i] = (sHash[i] * base[i] + s.charAt(j)) % mod[i];
				tHash[i] = (tHash[i] * base[i] + t.charAt(j)) % mod[i];
			}
			for(int j=0;j<=s.length() - t.length();j++) {
				if(sHash[i] == tHash[i]) {
					idxs[i][j] = true;
				}
				if(j == s.length() - t.length())break;
				sHash[i] = (sHash[i] - s.charAt(j) * power[i][t.length() - 1]) % mod[i];
				if(sHash[i] < 0) sHash[i] += mod[i];
				sHash[i] = ( sHash[i] * base[i] + s.charAt(j + t.length()) ) % mod[i];
			}
		}
		ArrayList<Integer> idxsList = new ArrayList<>();
		for(int i=0;i<s.length();i++) {
			if(idxs[0][i] && idxs[1][i]) idxsList.add(i);
		}
		return idxsList;
	}
	
	/** Returns if S contains T **/
	boolean contains(String t) {
		return getIdxs(t).size() > 0;
	}
	
	/** Returns if hash[] A and B is same value **/ 
	boolean hashEquals(long[] a, long[] b) {
		return Arrays.equals(a, b);
	}
}

public class Main {
	
	static int run(int n, char[][] f) {
		RollingHash[] rh0 = new RollingHash[n];
		RollingHash[] rh1 = new RollingHash[n];
		for(int i=0;i<n;i++) {
			String s = String.valueOf(f[i]);
			s = s + s;
			rh0[i] = new RollingHash(s);
		}
		for(int i=0;i<n;i++) {
			StringBuilder sb = new StringBuilder();
			for(int j=0;j<n;j++){
				sb.append(f[j][i]);
			}
			sb = sb.append(sb);
			String s = sb.toString();
			rh1[i] = new RollingHash(s);
		}
		int cnt = 0;
		for(int a=0;a<n;a++) {
			for(int b=0;b<n;b++) {
				boolean ok = true;
				for(int i=0;i<n;i++) {
					Hash hash0 = rh0[(i + a + n) % n].getHash(b, b + n);
					Hash hash1 = rh1[(i + b + n) % n].getHash(a, a + n);
					if(hash0.h1 != hash1.h1 || hash0.h2 != hash1.h2) {
						ok = false;
						break;
					}
				}
				if(ok) cnt++;
			}
		}
		return cnt;
	}
	
	static int naive(int n, char[][] f) {
		int cnt = 0;
		char[][] g = new char[n][n];
		for(int a=0;a<n;a++) {
			for(int b=0;b<n;b++) {
				for(int i=0;i<n;i++) {
					for(int j=0;j<n;j++) {
						g[i][j] = f[(i + a) % n][(j + b) % n];
					}
				}
				boolean ok = true;
				for(int i=0;i<n;i++) {
					for(int j=0;j<n;j++) {
						if(g[i][j] != g[j][i])ok = false;
					}
				}
				if(ok) cnt++;
			}
		}
		return cnt;
	}
	
	static void solve() {
		int n = ni();
		char[][] f = nm(n,n);
		out.println(run(n, f));
		
//		char[][] test = new char[3][3];
//		for(int i=0;i<3;i++)for(int j=0;j<3;j++) {
//			if(i == j)test[i][j] = 'b';
//			else test[i][j] = 'a';
//		}
//		
//		System.out.println(run(3, test));
//		
//		while(true) {
//			int n = 3;
//			char[][] f = new char[n][n];
//			Random random = new Random();
//			for(int i=0;i<n;i++)for(int j=0;j<n;j++) {
//				int ran = random.nextInt(2);
//				f[i][j] = (char)('a' + ran);
//			}
//			
//			int a = naive(n, f);
//			int b = run(n, f);
//			if(a != b) {
//				out.println(a + " " + b);
//				for(int i=0;i<n;i++) {
//					for(int j=0;j<n;j++) {
//						out.print(f[i][j]);
//					}
//					out.println();
//				}
//				return;
//			}
//		}
//		
	}	
	
	//constants
	static final int inf = Integer.MAX_VALUE / 2;
	static final long linf = Long.MAX_VALUE / 3;
	static final double dinf = Double.MAX_VALUE / 3;
	static final long mod = (long) 1e9 + 7;
	static final int[] dx = { -1, 0, 1, 0 }, dy = { 0, -1, 0, 1 }, dx8 = { -1, -1, -1, 0, 0, 1, 1, 1 }, dy8 = { -1, 0, 1, -1, 1, -1, 0, 1 };
	static final double eps = 1e-10;
	
	//libraries
	static long[] cum(int a[]) {
		long[] cum = new long[a.length + 1];
		for(int i=0;i<a.length;i++) cum[i+1] = cum[i] + a[i];
		return cum;
	}
	static long[] cum(long a[]) {
		long[] cum = new long[a.length + 1];
		for(int i=0;i<a.length;i++) cum[i+1] = cum[i] + a[i];
		return cum;
	}
	static void reverse(int ar[]) {
		int len = ar.length;
		for (int i = 0; i < len / 2; i++) {
			int t = ar[i];
			ar[i] = ar[len - 1 - i];
			ar[len - 1 - i] = t;
		}
	}
	static void reverse(long ar[]) {
		int len = ar.length;
		for (int i = 0; i < len / 2; i++) {
			long t = ar[i];
			ar[i] = ar[len - 1 - i];
			ar[len - 1 - i] = t;
		}
	}
	static void reverse(double ar[]) {
		int len = ar.length;
		for (int i = 0; i < len / 2; i++) {
			double t = ar[i];
			ar[i] = ar[len - 1 - i];
			ar[len - 1 - i] = t;
		}
	}
	static void reverse(char ar[]) {
		int len = ar.length;
		for (int i = 0; i < len / 2; i++) {
			char t = ar[i];
			ar[i] = ar[len - 1 - i];
			ar[len - 1 - i] = t;
		}
	}
	static String getReverse(String s) {
		StringBuilder sb = new StringBuilder(s);
		return sb.reverse().toString();
	}
	static <T> void reverse(T[] ar) {
		int len = ar.length;
		for (int i = 0; i < len / 2; i++) {
			T t = ar[i];
			ar[i] = ar[len - 1 - i];
			ar[len - 1 - i] = t;
		}
	}
	static int[] concat(int x, int arr[]) {
		int ret[] = new int[arr.length + 1];
		System.arraycopy(arr, 0, ret, 1, ret.length - 1);
		ret[0] = x;
		return ret;
	}
	static int[] concat(int arr[], int x) {
		int ret[] = new int[arr.length + 1];
		System.arraycopy(arr, 0, ret, 0, ret.length - 1);
		ret[ret.length - 1] = x;
		return ret;
	}
	static long[] concat(long x, long arr[]) {
		long ret[] = new long[arr.length + 1];
		System.arraycopy(arr, 0, ret, 1, ret.length - 1);
		ret[0] = x;
		return ret;
	}
	static long[] concat(long arr[], long x) {
		long ret[] = new long[arr.length + 1];
		System.arraycopy(arr, 0, ret, 0, ret.length - 1);
		ret[ret.length - 1] = x;
		return ret;
	}
	static char[] concat(char x, char arr[]) {
		char ret[] = new char[arr.length + 1];
		System.arraycopy(arr, 0, ret, 0, ret.length - 1);
		ret[ret.length - 1] = x;
		return ret;
	}
	static char[] concat(char arr[], char x) {
		char ret[] = new char[arr.length + 1];
		System.arraycopy(arr, 0, ret, 0, ret.length - 1);
		ret[ret.length - 1] = x;
		return ret;
	}
	static int max(int x, int y) {
		return Math.max(x, y);
	}
	static int min(int x, int y) {
		return Math.min(x, y);
	}
	static int max(int x, int y, int z) {
		x = Math.max(x, y);
		x = Math.max(x, z);
		return x;
	}
	static int min(int x, int y, int z) {
		x = Math.min(x, y);
		x = Math.min(x, z);
		return x;
	}
	static long max(long x, long y) {
		return Math.max(x, y);
	}
	static long min(long x, long y) {
		return Math.min(x, y);
	}
	static long max(long x, long y, long z) {
		x = Math.max(x, y);
		x = Math.max(x, z);
		return x;
	}
	static long min(long x, long y, long z) {
		x = Math.min(x, y);
		x = Math.min(x, z);
		return x;
	}
	static double max(double x, double y) {
		return Math.max(x, y);
	}
	static double min(double x, double y) {
		return Math.min(x, y);
	}
	static double max(double x, double y, double z) {
		x = Math.max(x, y);
		x = Math.max(x, z);
		return x;
	}
	static double min(double x, double y, double z) {
		x = Math.min(x, y);
		x = Math.min(x, z);
		return x;
	}
	static void sort(int[] ar) {
		Arrays.sort(ar);
	}
	static void sort(long[] ar) {
		Arrays.sort(ar);
	}
	static void sort(double[] ar) {
		Arrays.sort(ar);
	}
	static void sort(char[] ar) {
		Arrays.sort(ar);
	}
	static void rsort(int[] ar) {
		Arrays.sort(ar);
		int len = ar.length;
		for (int i = 0; i < len / 2; i++) {
			int tmp = ar[i];
			ar[i] = ar[len - 1 - i];
			ar[len - 1 - i] = tmp;
		}
	}
	static void rsort(long[] ar) {
		Arrays.sort(ar);
		int len = ar.length;
		for (int i = 0; i < len / 2; i++) {
			long tmp = ar[i];
			ar[i] = ar[len - 1 - i];
			ar[len - 1 - i] = tmp;
		}
	}
	static void rsort(double[] ar) {
		Arrays.sort(ar);
		int len = ar.length;
		for (int i = 0; i < len / 2; i++) {
			double tmp = ar[i];
			ar[i] = ar[len - 1 - i];
			ar[len - 1 - i] = tmp;
		}
	}
	static void rsort(char[] ar) {
		Arrays.sort(ar);
		int len = ar.length;
		for (int i = 0; i < len / 2; i++) {
			char tmp = ar[i];
			ar[i] = ar[len - 1 - i];
			ar[len - 1 - i] = tmp;
		}
	}
	static void fill(int arr[], int x) {
		Arrays.fill(arr, x);
	}
	static void fill(long arr[], long x) {
		Arrays.fill(arr, x);
	}
	static void fill(boolean arr[], boolean x) {
		Arrays.fill(arr, x);
	}
	static void fill(double arr[], double x) {
		Arrays.fill(arr, x);
	}
	static void fill(int arr[][], int x) {
		for (int i = 0; i < arr.length; i++)
			Arrays.fill(arr[i], x);
	}
	static void fill(long arr[][], long x) {
		for (int i = 0; i < arr.length; i++)
			Arrays.fill(arr[i], x);
	}
	static void fill(double arr[][], double x) {
		for (int i = 0; i < arr.length; i++)
			Arrays.fill(arr[i], x);
	}
	static void fill(boolean arr[][], boolean x) {
		for (int i = 0; i < arr.length; i++)
			Arrays.fill(arr[i], x);
	}
	//MOD culc
	static long plus(long x, long y) {
		long res = (x + y) % mod;
		return res < 0 ? res + mod : res;
	}
	static long sub(long x, long y) {
		long res = (x - y) % mod;
		return res < 0 ? res + mod : res;
	}
	static long mul(long x, long y) {
		long res = (x * y) % mod;
		return res < 0 ? res + mod : res;
	}
	static long div(long x, long y) {
		long res = x * pow(y, mod - 2) % mod;
		return res < 0 ? res + mod : res;
	}
	static long pow(long x, long y) {
		if (y < 0)
			return 0;
		if (y == 0)
			return 1;
		if (y % 2 == 1)
			return (x * pow(x, y - 1)) % mod;
		long root = pow(x, y / 2);
		return root * root % mod;
	}
	public static void main(String[] args) throws Exception {
		is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());
		out = new PrintWriter(System.out);
		solve();
		out.flush();
	}
	//input
	static InputStream is;
	static PrintWriter out;
	static String INPUT = "";
	private static byte[] inbuf = new byte[1024];
	static int lenbuf = 0, ptrbuf = 0;
	private static int readByte() {
		if (lenbuf == -1)
			throw new InputMismatchException();
		if (ptrbuf >= lenbuf) {
			ptrbuf = 0;
			try {
				lenbuf = is.read(inbuf);
			} catch (IOException e) {
				throw new InputMismatchException();
			}
			if (lenbuf <= 0)
				return -1;
		}
		return inbuf[ptrbuf++];
	}
	private static boolean isSpaceChar(int c) {
		return !(c >= 33 && c <= 126);
	}
	private static int skip() {
		int b;
		while ((b = readByte()) != -1 && isSpaceChar(b))
			;
		return b;
	}
	@SuppressWarnings("unused")
	private static double nd() {
		return Double.parseDouble(ns());
	}
	@SuppressWarnings("unused")
	private static char nc() {
		return (char) skip();
	}
	private static String ns() {
		int b = skip();
		StringBuilder sb = new StringBuilder();
		while (!(isSpaceChar(b))) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}
	private static char[] ns(int n) {
		char[] buf = new char[n];
		int b = skip(), p = 0;
		while (p < n && !(isSpaceChar(b))) {
			buf[p++] = (char) b;
			b = readByte();
		}
		return n == p ? buf : Arrays.copyOf(buf, p);
	}
	@SuppressWarnings("unused")
	private static char[][] nm(int n, int m) {
		char[][] map = new char[n][];
		for (int i = 0; i < n; i++)
			map[i] = ns(m);
		return map;
	}
	@SuppressWarnings("unused")
	private static int[] na(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = ni();
		return a;
	}
	@SuppressWarnings("unused")
	private static long[] nla(int n) {
		long[] a = new long[n];
		for (int i = 0; i < n; i++)
			a[i] = nl();
		return a;
	}
	@SuppressWarnings("unused")
	private static int[][] na(int n, int m){
		int[][] res = new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				res[i][j] = ni();
			}
		}
		return res;
	}
	@SuppressWarnings("unused")
	private static long[][] nla(int n, int m){
		long[][] res = new long[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				res[i][j] = nl();
			}
		}
		return res;
	}
	private static int ni() {
		int num = 0, b;
		boolean minus = false;
		while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'))
			;
		if (b == '-') {
			minus = true;
			b = readByte();
		}
		
		while (true) {
			if (b >= '0' && b <= '9') {
				num = num * 10 + (b - '0');
			} else {
				return minus ? -num : num;
			}
			b = readByte();
		}
	}
	private static long nl() {
		long num = 0;
		int b;
		boolean minus = false;
		while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'))
			;
		if (b == '-') {
			minus = true;
			b = readByte();
		}
		
		while (true) {
			if (b >= '0' && b <= '9') {
				num = num * 10 + (b - '0');
			} else {
				return minus ? -num : num;
			}
			b = readByte();
		}
	}
}
