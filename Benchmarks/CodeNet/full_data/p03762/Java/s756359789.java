import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Solver solver = new Solver();
		solver.init();
		solver.readHead(in.readLine());
		for (; solver.hasNext();) {
			solver.readBody(in.readLine());
		}
		solver.solve();
	}
}

class Solver {
	int N;
	int M;
	int cnt;
	long[] X;
	long[] Y;

	public void init() {
		N = 0;
		M = 0;
		cnt = 0;
	}

	public void readHead(String str) {
		String[] strArr = str.split(" ");
		N = Integer.parseInt(strArr[0]);
		M = Integer.parseInt(strArr[1]);
		X = new long[N];
		Y = new long[M];
	}

	public boolean hasNext() {
		return cnt < 2;
	}

	public void readBody(String str) {
		String[] strArr = str.split(" ");
		if (cnt == 0) {
			for (int i = 0; i < N; i++) {
				X[i] = Long.parseLong(strArr[i]);
			}
		} else {
			for (int i = 0; i < M; i++) {
				Y[i] = Long.parseLong(strArr[i]);
			}
		}
		cnt++;
	}

	final long MOD = 1000000007;

	public void solve() {
		long ansX = 0;
		for (int x1 = 0; x1 < N - 1; x1++) {
			int x2 = x1 + 1;
			long s = (X[x2] - X[x1]) % MOD;
			s = (s * (N - 1 - x1)) % MOD;
			s = (s * (x1 + 1)) % MOD;
			ansX = (ansX + s) % MOD;
		}
		long ansY = 0;
		for (int y1 = 0; y1 < M - 1; y1++) {
			int y2 = y1 + 1;
			long s = (Y[y2] - Y[y1]) % MOD;
			s = (s * (M - 1 - y1)) % MOD;
			s = (s * (y1 + 1)) % MOD;
			ansY = (ansY + s) % MOD;
		}
		System.out.println((ansX * ansY) % MOD);
	}

}
