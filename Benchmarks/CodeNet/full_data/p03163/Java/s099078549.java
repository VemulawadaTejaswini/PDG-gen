import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


class Main{
	static class LongIntPair{
		int a;
		long b;
		public LongIntPair(int x, long y) {
			a = x;
			b = y;
		}

		@Override
		public boolean equals(Object o) {
			if (this == o) return true;
			if (o == null || getClass() != o.getClass()) return false;
			LongIntPair that = (LongIntPair) o;
			return a == that.a &&
					b == that.b;
		}

		@Override
		public int hashCode() {
			return 5 * a + (int)b;
		}
	}

	static class LongIntPairCompare implements Comparator<LongIntPair>{
		@Override
		public int compare(LongIntPair o1, LongIntPair o2) {
			if(o1.a > o2.a) //swap
				return 1;
			return -1; //dont swap
		}
	}

	public static void main(String[] args) {
		FastReader f = new FastReader();
		int n = ii(f), w = ii(f);
		int a;
		long b;
//		LongIntPair[] arr = new LongIntPair[n];
//		for(int i=0; i<n; i++){
//			a = ii(f);
//			b = il(f);
//			arr[i] = new LongIntPair(a, b);
//		}
//		Comparator<LongIntPair> comp = new LongIntPairCompare();
//		Arrays.sort(arr, comp);
		long[] values = new long[n+1];
		int[] weights = new int[n+1];
		for(int i=1; i<=n; i++){
			weights[i] = ii(f);
			values[i] = il(f);
		}
		long[][] dp = new long[n+1][w+1];

		for(int i=1; i<=n; i++){
			for(int j=1; j<=w; j++){
				if(weights[i]>j)
					dp[i][j] = dp[i-1][j];
				else{
					dp[i][j] = max(values[i] + dp[i-1][j-weights[i]], dp[i-1][j]);
				}
			}
		}
		printn(dp[n][w]);
	}


	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new
					InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}

	public static int ii(FastReader fr){
		return fr.nextInt();
	}

	static long il(FastReader fr){
		return fr.nextLong();
	}

	static double id(FastReader fr){
		return fr.nextDouble();
	}

	static void printArray(Object[] arr) {
		for (Object x : arr)
			print(x, " ");
		printn("");
	}

	static void print(Object s, String sep) {
		System.out.print(s + sep);
	}

	static void printn(Object s) {
		System.out.println(s);
	}

	static long[] inputArrL(int n, FastReader fr) {
		long[] arr = new long[n];
		for (int i = 0; i < n; i++)
			arr[i] = fr.nextLong();
		return arr;
	}

	static int[] inputArr(int n, FastReader fr) {
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = fr.nextInt();
		return arr;
	}

	static int max(int... args) {
		int max = Integer.MIN_VALUE;
		for (int x : args) {
			max = Math.max(x, max);
		}
		return max;
	}

	static int min(int... args) {
		int min = Integer.MAX_VALUE;
		for (int x : args) {
			min = Math.min(x, min);
		}
		return min;
	}

	static long max(long... args) {
		long max = Integer.MIN_VALUE;
		for (long x : args) {
			max = Math.max(x, max);
		}
		return max;
	}

	static long min(long... args) {
		long min = Integer.MAX_VALUE;
		for (long x : args) {
			min = Math.min(x, min);
		}
		return min;
	}

	static int lenDigit(int d) {
		if (d == 0)
			return 1;
		int l = 0;
		while (d != 0) {
			l++;
			d /= 10;
		}
		return l;
	}

}

