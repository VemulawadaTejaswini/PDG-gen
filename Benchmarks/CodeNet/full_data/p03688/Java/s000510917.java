import java.io.*;
import java.util.*;

public class Main {

	void submit() {
		int n = nextInt();
		int[] a = new int[n];
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			a[i] = nextInt();
			min = Math.min(min, a[i]);
			max = Math.max(max, a[i]);
		}

		boolean ret = false;

		if (max - min > 1) {
		} else if (min == max) {
			ret |= min == n - 1; // ones
			ret |= n >= 2 * min; // not ones
		} else {
			int cMin = 0;
			int cMax = 0;
			for (int x : a) {
				if (x == min) {
					cMin++;
				} else {
					cMax++;
				}
			}
			
			
			int onesCol = cMin;
			int notOnesCol = max - onesCol;
			
			ret |= onesCol > 0 && notOnesCol > 0 && notOnesCol * 2 <= cMax;
		}
		
		out.println(ret ? "Yes" : "No");
	}

	void preCalc() {

	}

	void stress() {

	}

	void test() {

	}

	Main() throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintWriter(System.out);
		preCalc();
		submit();
		// stress();
		// test();
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
