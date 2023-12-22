import java.io.*;
import java.util.*;

public class Main {

	long best = Long.MAX_VALUE;

	int[] cost;

	void go(int[] a, int idx, long sum) {

		long optSum = sum;
		for (int i = idx; i < a.length; i++) {
			optSum += a[i] == 0 ? Math.min(cost[i], 0) : cost[i];
		}

		if (optSum >= best) {
			return;
		}

		if (2 * idx >= a.length) {
			best = optSum;
			return;
		}

		go(a, idx + 1, sum + (a[idx] == 0 ? 0 : cost[idx]));
		if (a[idx] == 0) {
			for (int j = idx; j < a.length; j += idx) {
				a[j]++;
			}
			go(a, idx + 1, sum + cost[idx]);
			for (int j = idx; j < a.length; j += idx) {
				a[j]--;
			}
		}
	}

	long fast(int[] a) {
		return 0;
	}

	void submit() {
		int n = nextInt();
		cost = new int[n + 1];
		long sum = 0;
		for (int i = 1; i <= n; i++) {
			cost[i] = nextInt();
			sum += cost[i];
		}
		int[] a = new int[n + 1];
		go(a, 1, 0);
		out.println(sum - best);
	}

	void preCalc() {

	}

	void stress() {

	}

	void test() {
		int n = 100;
		cost = new int[n + 1];
		long sum = 0;
		for (int i = 1; i <= n; i++) {
			cost[i] = rand(-10000, 10000);
			sum += cost[i];
		}
		int[] a = new int[n + 1];
		go(a, 1, 0);
		out.println(sum - best);
	}

	Main() throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintWriter(System.out);
		preCalc();
		submit();
		// stress();
//		 test();
		out.close();
	}

	static final Random rng = new Random();

	static int rand(int l, int r) {
		return l + rng.nextInt(r - l + 1);
	}

	public static void main(String[] args) throws IOException {
		new Main();
	}

	BufferedReader br;
	PrintWriter out;
	StringTokenizer st;

	String nextToken() {
		while (st == null || !st.hasMoreTokens()) {
			try {
				st = new StringTokenizer(br.readLine());
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return st.nextToken();
	}

	String nextString() {
		try {
			return br.readLine();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	int nextInt() {
		return Integer.parseInt(nextToken());
	}

	long nextLong() {
		return Long.parseLong(nextToken());
	}

	double nextDouble() {
		return Double.parseDouble(nextToken());
	}
}
