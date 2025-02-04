import java.io.*;
import java.util.*;

public class Main {

	void submit() {
		int n = nextInt() - 1;
		int a = nextInt();
		int b = nextInt();
		long c = nextInt();
		long d = nextInt();
		
		long diff = b - a;
		
		for (int pos = 0; pos <= n; pos++) {
			int neg = n - pos;
			
			
			long low = c * pos - d * neg;
			long high = d * pos - c * neg;
			
			if (low <= diff && diff <= high) {
				out.println("YES");
				return;
			}
		}
		
		out.println("NO");
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
