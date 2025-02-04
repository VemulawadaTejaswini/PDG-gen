import java.io.*;
import java.util.*;

class MaxSegmentTree{
	int n;
	long node[];
	long inf = Long.MAX_VALUE/3;
	MaxSegmentTree(int x){
		n=1;
		while(n<x) {
			n<<=1;
		}
		node = new long[2*n-1];
	}
	
	void update(int x, int v) {
		x += (n-1);
		node[x] = v;
		while(x>0) {
			x = (x-1)/2;
			node[x] = Math.max(node[2*x+1], node[2*x+2]);
		}
	}
	
	long getMax(int a, int b) {
		return getMax(a, b, 0, 0, n);
	}
	long getMax(int a, int b, int k, int l, int r) {
		if(r<=a||b<=l)return -inf;
		if(l<=a&&b<=r)return node[k];
		return Math.max(getMax(a, b, 2*k+1, l, (l+r)/2), getMax(a,b,2*k+2,(l+r)/2,r));
	}
}
class MinSegmentTree{
	int n;
	long node[];
	long inf = Long.MAX_VALUE/3;
	MinSegmentTree(int x){
		n=1;
		while(n<x) {
			n<<=1;
		}
		node = new long[2*n-1];
	}
	
	void update(int x, int v) {
		x += n-1;
		node[x] = v;
		while(x>0) {
			x = (x-1)/2;
			node[x] = Math.min(node[2*x+1], node[2*x+2]);
		}
	}
	
	long getMin(int a, int b) {
		return getMin(a, b, 0, 0, n);
	}
	long getMin(int a, int b, int k, int l, int r) {
		if(r<=a||b<=l)return -inf;
		if(l<=a&&b<=r)return node[k];
		return Math.min(getMin(a, b, 2*k+1, l, (l+r)/2), getMin(a,b,2*k+2,(l+r)/2,r));
	}
}

public class Main {
	static InputStream is;
	static PrintWriter out;
	static String INPUT = "";

	static final long mod = (long) 1e9 + 7;
	static final int dx[] = { -1, 0, 1, 0 }, dy[] = { 0, -1, 0, 1 };
	static final int[] dx8 = { -1, -1, -1, 0, 0, 1, 1, 1 }, dy8 = { -1, 0, 1, -1, 1, -1, 0, 1 };
	static final int inf = Integer.MAX_VALUE / 3;
	static final long linf = Long.MAX_VALUE / 3;
	static final double dinf = Double.MAX_VALUE / 3;
	static final double eps = 1e-10;
	static final double pi = Math.PI;
	static StringBuilder sb = new StringBuilder();

	static void solve() {
		int n = ni(), k = ni();
		int p[] = na(n);
		MaxSegmentTree maxseg = new MaxSegmentTree(n);
		MinSegmentTree minseg = new MinSegmentTree(n);
		for(int i=0;i<n;i++) {
			maxseg.update(i, p[i]);
			minseg.update(i, p[i]);
		}

		
		int upsum[] = new int[n+1];
		for(int i=0;i<n;i++) {
			if(i==0) {
				upsum[i+1] = 0;
				continue;
			}
			if(p[i-1]<p[i]) upsum[i+1]=upsum[i] + 1;
			else upsum[i+1] = upsum[i];
		}
		
		int cnt = 1;
		boolean justup = false;
		for(int l=0;l<n;l++) {
			int r = l + k;
			if(r>=n)break;
			if( ! (p[l]==minseg.getMin(l, r+1)&&p[r]==maxseg.getMax(l, r+1) )) {
				if(upsum[r] - upsum[l]==k-1) {//単調増加列
					justup = true;
					continue;
				}
				cnt ++;
			}
		}
		if(justup)cnt++;
		out.println(cnt);
		
	}

	//libraries		
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

	static <T> void reverse(List<T> ls) {
		int sz = ls.size();
		for (int i = 0; i < sz / 2; i++) {
			T t = ls.get(i);
			ls.set(i, ls.get(sz - 1 - i));
			ls.set(sz - 1 - i, t);
		}
	}

	static void sbnl() {//StringBuilderに改行文字をappendする
		sb.append("\n");
	}

	static int lowerBound(int[] a, int x) {
		int l = -1, r = a.length;
		while (r - l > 1) {
			int c = (l + r) / 2;
			if (a[c] < x) {
				l = c;
			} else {
				r = c;
			}
		}
		return r;
	}

	static int upperBound(int[] a, int x) {
		int l = -1, r = a.length;
		while (r - l > 1) {
			int c = (l + r) / 2;
			if (a[c] <= x) {
				l = c;
			} else {
				r = c;
			}
		}
		return r;
	}

	static int rlowerBound(int[] a, int x) {
		int l = -1, r = a.length;
		while (r - l > 1) {
			int c = (l + r) / 2;
			if (a[c] > x) {
				l = c;
			} else {
				r = c;
			}
		}
		return r;
	}

	static int rupperBound(int[] a, int x) {
		int l = -1, r = a.length;
		while (r - l > 1) {
			int c = (l + r) / 2;
			if (a[c] >= x) {
				l = c;
			} else {
				r = c;
			}
		}
		return r;
	}

	static int lowerBound(long[] a, long x) {
		int l = -1, r = a.length;
		while (r - l > 1) {
			int c = (l + r) / 2;
			if (a[c] < x) {
				l = c;
			} else {
				r = c;
			}
		}
		return r;
	}

	static int upperBound(long[] a, long x) {
		int l = -1, r = a.length;
		while (r - l > 1) {
			int c = (l + r) / 2;
			if (a[c] <= x) {
				l = c;
			} else {
				r = c;
			}
		}
		return r;
	}

	static int rlowerBound(long[] a, long x) {
		int l = -1, r = a.length;
		while (r - l > 1) {
			int c = (l + r) / 2;
			if (a[c] > x) {
				l = c;
			} else {
				r = c;
			}
		}
		return r;
	}

	static int rupperBound(long[] a, long x) {
		int l = -1, r = a.length;
		while (r - l > 1) {
			int c = (l + r) / 2;
			if (a[c] >= x) {
				l = c;
			} else {
				r = c;
			}
		}
		return r;
	}

	static int lowerBound(double[] a, double x) {
		int l = -1, r = a.length;
		while (r - l > 1) {
			int c = (l + r) / 2;
			if (a[c] < x) {
				l = c;
			} else {
				r = c;
			}
		}
		return r;
	}

	static int upperBound(double[] a, double x) {
		int l = -1, r = a.length;
		while (r - l > 1) {
			int c = (l + r) / 2;
			if (a[c] <= x) {
				l = c;
			} else {
				r = c;
			}
		}
		return r;
	}

	static int rlowerBound(double[] a, double x) {
		int l = -1, r = a.length;
		while (r - l > 1) {
			int c = (l + r) / 2;
			if (a[c] > x) {
				l = c;
			} else {
				r = c;
			}
		}
		return r;
	}

	static int rupperBound(double[] a, double x) {
		int l = -1, r = a.length;
		while (r - l > 1) {
			int c = (l + r) / 2;
			if (a[c] >= x) {
				l = c;
			} else {
				r = c;
			}
		}
		return r;
	}

	static <T> int lowerBound(List<T> ls, T x) throws RuntimeException {
		if (ls.size() == 0)
			return -1;
		if (ls.get(0) instanceof Integer) {
			return ~Collections.binarySearch(ls, x, (t1, t2) -> ((Integer) t1).compareTo((Integer) t2) >= 0 ? 1 : -1);
		} else if (ls.get(0) instanceof Long) {
			return ~Collections.binarySearch(ls, x, (t1, t2) -> ((Long) t1).compareTo((Long) t2) >= 0 ? 1 : -1);
		} else if (ls.get(0) instanceof Double) {
			return ~Collections.binarySearch(ls, x, (t1, t2) -> ((Double) t1).compareTo((Double) t2) >= 0 ? 1 : -1);
		} else {
			System.err.println(
					String.format("%s:数値でないリストを二分探索しています。", Thread.currentThread().getStackTrace()[1].getMethodName()));
			throw new RuntimeException();
		}
	}

	static <T> int upperBound(List<T> ls, T x) throws RuntimeException {
		if (ls.size() == 0)
			return -1;
		if (ls.get(0) instanceof Integer) {
			return ~Collections.binarySearch(ls, x, (t1, t2) -> ((Integer) t1).compareTo((Integer) t2) > 0 ? 1 : -1);
		} else if (ls.get(0) instanceof Long) {
			return ~Collections.binarySearch(ls, x, (t1, t2) -> ((Long) t1).compareTo((Long) t2) > 0 ? 1 : -1);
		} else if (ls.get(0) instanceof Double) {
			return ~Collections.binarySearch(ls, x, (t1, t2) -> ((Double) t1).compareTo((Double) t2) > 0 ? 1 : -1);
		} else {
			System.err.println(
					String.format("%s:数値でないリストを二分探索しています。", Thread.currentThread().getStackTrace()[1].getMethodName()));
			throw new RuntimeException();
		}
	}

	static <T> int rupperBound(List<T> ls, T x) throws RuntimeException {
		if (ls.size() == 0)
			return -1;
		if (ls.get(0) instanceof Integer) {
			return ~Collections.binarySearch(ls, x, (t1, t2) -> ((Integer) t1).compareTo((Integer) t2) < 0 ? 1 : -1);
		} else if (ls.get(0) instanceof Long) {
			return ~Collections.binarySearch(ls, x, (t1, t2) -> ((Long) t1).compareTo((Long) t2) < 0 ? 1 : -1);
		} else if (ls.get(0) instanceof Double) {
			return ~Collections.binarySearch(ls, x, (t1, t2) -> ((Double) t1).compareTo((Double) t2) < 0 ? 1 : -1);
		} else {
			System.err.println(
					String.format("%s:数値でないリストを二分探索しています。", Thread.currentThread().getStackTrace()[1].getMethodName()));
			throw new RuntimeException();
		}
	}

	static <T> int rlowerBound(List<T> ls, T x) {
		if (ls.size() == 0)
			return -1;
		if (ls.get(0) instanceof Integer) {
			return ~Collections.binarySearch(ls, x, (t1, t2) -> ((Integer) t1).compareTo((Integer) t2) <= 0 ? 1 : -1);
		} else if (ls.get(0) instanceof Long) {
			return ~Collections.binarySearch(ls, x, (t1, t2) -> ((Long) t1).compareTo((Long) t2) <= 0 ? 1 : -1);
		} else if (ls.get(0) instanceof Double) {
			return ~Collections.binarySearch(ls, x, (t1, t2) -> ((Double) t1).compareTo((Double) t2) <= 0 ? 1 : -1);
		} else {
			System.err.println(
					String.format("%s:数値でないリストを二分探索しています。", Thread.currentThread().getStackTrace()[1].getMethodName()));
			throw new RuntimeException();
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

	static void fill(int arr[], int x) {
		Arrays.fill(arr, x);
	}

	static void fill(long arr[], long x) {
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

	@SuppressWarnings("unused")
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
