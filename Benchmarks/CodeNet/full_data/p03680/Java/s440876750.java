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

	public void readHead(String str) {
		String[] strArr = str.split(" ");
		N = Integer.parseInt(strArr[0]);
		// System.out.println(N);
		Btn = new int[N + 1];
	}

	int[] Btn;

	public boolean hasNext() {
		return cnt < N;
	}

	public void readBody(String str) {
		// System.out.println(str);
		cnt++;
		Btn[cnt] = Integer.parseInt(str);
	}

	public void solve() {
		// for (int i = 1; i <= N; i++)
		// System.out.println(Btn[i]);
		int ans = 0;
		for (int b = 1; b != 2 && ans < N; b = Btn[b]) {
			ans++;
		}
		if (ans < N)
			System.out.println(ans);
		else
			System.out.println(-1);
	}
}
