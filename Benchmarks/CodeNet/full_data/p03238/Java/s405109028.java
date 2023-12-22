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
	}

	public boolean hasNext() {
		// return cnt < N;
		if (N == 1)
			return false;
		return cnt < 2;
	}

	public void readBody(String str) {
		// System.out.println(str);
		cnt++;
		if (cnt == 1)
			A = Integer.parseInt(str);
		if (cnt == 2)
			B = Integer.parseInt(str);
	}

	int A;
	int B;

	public void solve() {
		if (N == 1)
			System.out.println("Hello World");
		else
			System.out.println(A + B);

	}
}
