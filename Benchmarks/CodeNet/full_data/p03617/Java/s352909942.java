import java.io.*;
import java.util.*;
import java.math.*;

public class Main implements Runnable {
	private static BufferedReader in;
	private static PrintWriter out;
	private static StringTokenizer st;
	private static Random rnd;

	private void solve() throws IOException {
		final int maxBottle = 8;
		long[] costs = new long[maxBottle + 1];
		Arrays.fill(costs, Long.MAX_VALUE / 2);
		costs[0] = 0;
		costs[1] = nextLong();
		costs[2] = nextLong();
		costs[4] = nextLong();
		costs[8] = nextLong();
		boolean updated = true;
		while (updated) {
			updated = false;
			for (int a = 1; a <= maxBottle; a++) {
				for (int b = 1; a + b <= maxBottle; b++) {
					long candidate = costs[a] + costs[b];
					if (candidate < costs[a + b]) {
						updated = true;
						costs[a + b] = candidate;
					}
				}
			}
		}
		//out.println(Arrays.toString(costs));
		long weight = nextLong() * 4;
		long result = (weight / maxBottle) * costs[maxBottle] + costs[(int) (weight % maxBottle)];
		out.println(result);
	}

	public static void main(String[] args) {
		new Main().run();
	}

	public void run() {
		try {
			in = new BufferedReader(new InputStreamReader(System.in));
			out = new PrintWriter(System.out);

			rnd = new Random();

			solve();

			out.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);
		}
	}

	private String nextToken() throws IOException {
		while (st == null || !st.hasMoreTokens()) {
			String line = in.readLine();

			if (line == null)
				return null;

			st = new StringTokenizer(line);
		}

		return st.nextToken();
	}

	private int nextInt() throws IOException {
		return Integer.parseInt(nextToken());
	}

	private long nextLong() throws IOException {
		return Long.parseLong(nextToken());
	}

	private double nextDouble() throws IOException {
		return Double.parseDouble(nextToken());
	}
}