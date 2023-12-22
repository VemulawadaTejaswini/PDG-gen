import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Solver solver = new Solver();
		solver.init();
		solver.readHead(in.readLine());
		// for (; solver.hasNext();) {
		// solver.readBody(in.readLine());
		// }
		// solver.solve();
	}
}

class Solver {
	int N;
	int cnt;

	public void init() {
		N = 0;
		cnt = 0;
	}

	public void readHead(String str) {
		String[] strArr = str.split(" ");
		// N = Integer.parseInt(strArr[0]);
		// System.out.println(N);
		int n = Integer.parseInt(strArr[0]);
		int m = Integer.parseInt(strArr[1]);

		int a = n;
		int b = m;
		if (n < m) {
			a = m;
			b = n;
		}
		if (a - b > 1) {
			System.out.println(0);
			return;
		}
		long ans = 1;
		if (a == b)
			ans = 2;
		final long MOD = 1000000007;
		for (long i = 1; i <= a; i++)
			ans = (ans * i) % MOD;
		for (long i = 1; i <= b; i++)
			ans = (ans * i) % MOD;
		System.out.println(ans);
	}

	public boolean hasNext() {
		return cnt < N;
	}

	public void readBody(String str) {
		// System.out.println(str);
		cnt++;
	}

	public void solve() {
	}
}
