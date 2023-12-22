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
	int cnt;

	public void init() {
		N = 0;
		cnt = 0;
	}

	int M;

	public void readHead(String str) {
		String[] strArr = str.split(" ");
		N = Integer.parseInt(strArr[0]);
		// System.out.println(N);
		M = Integer.parseInt(strArr[1]);
		A = new int[N][M];
	}

	public boolean hasNext() {
		return cnt < N;
	}

	int A[][];

	public void readBody(String str) {
		// System.out.println(str);
		String[] strArr = str.split(" ");
		int k = Integer.parseInt(strArr[0]);
		for (int i = 1; i <= k; i++) {
			A[cnt][Integer.parseInt(strArr[i]) - 1] = 1;
		}
		cnt++;
	}

	public void solve() {
		int ans = 0;
		for (int m = 0; m < M; m++) {
			int c = 0;
			for (int n = 0; n < N; n++) {
				if (A[n][m] == 1)
					c++;
			}
			if (c == N)
				ans++;
		}
		System.out.println(ans);
	}
}
