import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

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
		Board = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i <= N; i++) {
			Board.add(new ArrayList<Integer>());
		}
	}

	ArrayList<ArrayList<Integer>> Board;

	public boolean hasNext() {
		// return cnt < N;
		return cnt < N - 1;
	}

	public void readBody(String str) {
		// System.out.println(str);
		cnt++;
		String[] strArr = str.split(" ");
		int a = Integer.parseInt(strArr[0]);
		int b = Integer.parseInt(strArr[1]);
		Board.get(a).add(b);
		Board.get(b).add(a);
	}

	public void solve() {
		// for (int i = 0; i <= N; i++) {
		// System.out.println(i);
		// for (int n : Board.get(i))
		// System.out.println(" " + n);
		// }
		int f = step(1, 0);
		int s = step(N, 0);
		int step1N = step1N(1, 0) - 1;
		// System.out.println(f + " " + s + " " + step1N);
		f -= (step1N / 2);
		s -= (step1N / 2);
		if (step1N % 2 == 1)
			s--;
		// System.out.println(f + " " + s);

		if (f < 1 || f <= s)
			System.out.println("Snuke");
		else
			System.out.println("Fennec");
	}

	private int step(int n, int prev) {
		int ans = 0;
		for (int next : Board.get(n)) {
			if (next == 1 || next == N || next == prev)
				continue;
			ans++;
			ans += step(next, n);
		}
		return ans;
	}

	private int step1N(int n, int prev) {
		for (int next : Board.get(n)) {
			if (next == prev)
				continue;
			if (next == N)
				return 1;
			int s = step1N(next, n);
			if (s > 0)
				return s + 1;
		}
		return 0;
	}

}
