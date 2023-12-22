import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long C = sc.nextLong();
		long[] x = new long[N];
		long[] v = new long[N];
		for (int i = 0; i < N; i++) {
			x[i] = sc.nextLong();
			v[i] = sc.nextLong();
		}

		long prevX = C;
		long current = 0;
		long peek = 0;
		long max = Integer.MIN_VALUE;
		long[] cal = new long[N];
		long[] dist = new long[N];
		for (int i = 0; i < N; i++) {
			long cx = x[N - i - 1];
			long cv = v[N - i - 1];

			current -= prevX - cx;
			current += cv;
			if (max < current) {
				max = current;
				peek = C - cx;
			}

			cal[i] = max;
			dist[i] = peek;
			prevX = cx;
		}
		debug(cal);
		debug(dist);

		prevX = 0;
		current = 0;
		max = cal[N - 1];
		for (int i = 0; i < N; i++) {
			long cx = x[i];
			long cv = v[i];

			current -= cx - prevX;
			current += cv;
			if (max < current) {
				max = current;
			}
			// debug("X", i, max, current);

			if (i < N - 1) {
				long rightBack = current - cx + cal[N - i - 2];
				if (max < rightBack) {
					max = rightBack;
				}

				long leftBack = cal[N - i - 2] - dist[N - i - 2] + current;
				if (max < leftBack) {
					max = leftBack;
				}

				// debug("X", i, max, temp0, temp1);
			}

			prevX = cx;
		}

		System.out.println(Math.max(0, max));
	}

	public static class Pair implements Comparable<Pair> {
		private double key;
		private int value;

		public Pair(double key, int value) {
			super();
			this.key = key;
			this.value = value;
		}

		public double getKey() {
			return key;
		}

		public int getValue() {
			return value;
		}

		@Override
		public String toString() {
			return "{" + key + ", " + value + "}";
		}

		@Override
		public int compareTo(Pair other) {
			double t = this.value / this.key;
			double o = other.value / other.key;
			if (t < o) {
				return -1;
			} else if (t > o) {
				return 1;
			} else {
				return 0;
			}
		}
	}

	private static boolean isDebug = System.getProperty("sun.desktop") != null;

	private static void debug(Object... o) {
		if (isDebug) {
			System.err.println(Arrays.deepToString(o));
		}
	}
}