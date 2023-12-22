import java.io.*;
import java.util.*;

public class Main {

	void submit() {
		char[] s = nextToken().toCharArray();
		int n = s.length;
		
		int[] mask = new int[n + 1];
		for (int i = 0; i < s.length; i++) {
			int ch = s[i] - 'a';
			mask[i + 1] = mask[i] ^ (1 << ch);
		}
		
		if (mask[n] == 0) {
			out.println(1);
			return;
		}
		
		int[] dp = new int[1 << 26];
		Arrays.fill(dp, Integer.MAX_VALUE);
		dp[0] = 0;
		
		for (int x : mask) {
			int dist = dp[x];
			for (int i = 0; i < 26; i++) {
				int y = x ^ (1 << i);
				dp[y] = Math.min(dp[y], dist + 1);
			}
		}
		
		out.println(dp[mask[n]]);
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
		//stress();
		//test();
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
