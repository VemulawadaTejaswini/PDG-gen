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
	int[] way;

	public void init() {
		N = 0;
		cnt = 0;
	}

	public void readHead(String str) {
		String[] strArr = str.split(" ");
		// N = Integer.parseInt(strArr[0]);
		// System.out.println(N);
		N = Integer.parseInt(strArr[0]);
		M = Integer.parseInt(strArr[1]);
		way = new int[N + 1];
	}

	public boolean hasNext() {
		return cnt < M;
	}

	public void readBody(String str) {
		String[] strArr = str.split(" ");
		int a = Integer.parseInt(strArr[0]);
		int b = Integer.parseInt(strArr[1]);
		way[a]++;
		way[b]++;
		// System.out.println(str);
		cnt++;
	}

	public void solve() {
		for (int i = 1; i <= N; i++)
			System.out.println(way[i]);
	}
}
