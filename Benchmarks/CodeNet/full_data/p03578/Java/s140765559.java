import java.io.*;
import java.util.*;

public class Main {

	void submit() {
		HashMap<Integer, Integer> set = new HashMap<>();
		int n = nextInt();
		for (int i = 0; i < n; i++) {
			int x = nextInt();
			set.merge(x, 1, Integer::sum);
		}
		
		int m = nextInt();
		for (int i = 0; i < m; i++) {
			int x = nextInt();
			int prev = set.getOrDefault(x, 0);
			if (prev == 0) {
				out.println("NO");
				return;
			}
			set.put(x, prev - 1);
		}
		out.println("YES");
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
