
import java.util.Arrays;
import java.util.Scanner;

class Main {

	Scanner sc = new Scanner(System.in);
	final static long LNF = 1L << 60;
	final static double EPS = 1e-9;

	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		int n = ni();
		long w = ni();
		long[] weight = new long[110];
		long[] value = new long[110];

		for (int i = 0; i < n; i++) {
			weight[i] = nl();
			value[i] = nl();
		}

		long[][] dp = new long[110][100100];
		for (int i = 0; i < n; i++) {
			for (int sum_w = 0; sum_w <= w; sum_w++) {
				if(sum_w - weight[i] >= 0) {
					dp[i+1][sum_w] = Util.max(dp[i+1][sum_w], dp[i][(int) (sum_w - weight[i])] + value[i]);
				}
				dp[i+1][sum_w] = Util.max(dp[i+1][sum_w], dp[i][sum_w]);
			}

		}
		System.out.println(dp[n][(int) w]);
	}

	int ni() {
		return Integer.parseInt(sc.next());
	}

	long nl() {
		return sc.nextLong();
	}

	double nd() {
		return Double.parseDouble(sc.next());
	}

	void debug(Object... os) {
		System.out.println(Arrays.deepToString(os));
	}

	static class Util {
		static <T extends Comparable<T>> T max(T a, T b) {
			if (a.compareTo(b) > 0) {
				return a;
			} else {
				return b;
			}
		}

		static <T extends Comparable<T>> T min(T a, T b) {
			if (a.compareTo(b) < 0) {
				return a;
			} else {
				return b;
			}
		}
	}

}
