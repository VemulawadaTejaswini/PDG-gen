import java.io.*;
import java.util.*;

public class Main {

	void submit() {
		int n = nextInt();
		long[] a = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] -= nextLong();
		}
		for (int i = 0; i < n; i++) {
			a[i] += nextLong();
		}
		
		long ops = 0;
		for (long x : a) {
			ops += x;
		}
		
		if (ops < 0) {
			out.println("No");
			return;
		}
		
		long sub2 = 0;
		long add1 = 0;
		
		for (long x : a) {
			if (x <= 0) {
				add1 += -x;
			} else {
				long tmp = (x + 1) / 2;
				sub2 += tmp;
				add1 += -(x - tmp * 2);
			}
		}
		
		if (sub2 > ops || add1 > ops) {
			out.println("No");
			return;
		}
		
		sub2 = ops - sub2;
		add1 = ops - add1;
		
		if (sub2 * 2 != add1) {
			out.println("No");
			return;
		}
		
		out.println("Yes");
		
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
