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
		// solverS.solve();
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
		int a = Integer.parseInt(strArr[0]);
		int b = Integer.parseInt(strArr[1]);
		int c = Integer.parseInt(strArr[2]);
		int d = Integer.parseInt(strArr[3]);
		if (Math.abs(c - a) <= d) {
			System.out.println("Yes");
		} else if ((Math.abs(a - b) <= d) && (Math.abs(c - b) <= d)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
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
