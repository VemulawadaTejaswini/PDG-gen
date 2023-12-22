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
	int K;
	int cnt;

	public void init() {
		N = 0;
		cnt = 0;
	}

	public void readHead(String str) {
		String[] strArr = str.split(" ");
		N = Integer.parseInt(strArr[0]);
		K = Integer.parseInt(strArr[1]);
		// System.out.println(N);
	}

	public boolean hasNext() {
		// return cnt < N;
		return cnt < 1;
	}

	public void readBody(String str) {
		// System.out.println(str);
		A = new int[N];
		String[] strArr = str.split(" ");
		for (int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(strArr[i]);
		}
		cnt++;
	}

	int[] A;

	public void solve() {
		// for (int i = 0; i < N; i++) {
		// System.out.println(A[i]);
		// }
		int ans = 0;
		for (int n = N; n > 0;) {
			ans++;
			if (n > K)
				n -= (K - 1);
			else
				n -= K;
		}
		System.out.println(ans);
	}
}
