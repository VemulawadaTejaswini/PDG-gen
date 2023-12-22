import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


class Frog1 {
    public static void main(String[] args) {
    	FastReader f = new FastReader();
    	int n = ii(f);
    	int[] arr = inputArr(n, f);
		int[] dp = new int[n+1];
		dp[0] = 0;
		dp[1] = 0;
		dp[2] = Math.abs(arr[1] - arr[0]);
		for(int i=3; i<=n; i++){
			dp[i] = min(dp[i-1] + Math.abs(arr[i-1]-arr[i-2]), dp[i-2] + Math.abs(arr[i-1]-arr[i-3]));
		}
		printn(dp[n]);
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

