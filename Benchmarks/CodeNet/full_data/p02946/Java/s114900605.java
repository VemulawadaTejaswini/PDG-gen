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
		String[] strArr = str.split("\\s+");
		// N = Integer.parseInt(strArr[0]);
		// System.out.println(N);
		int k = Integer.parseInt(strArr[0]);
		int x = Integer.parseInt(strArr[1]);
		String sep = "";
		for (int i = (x - (k - 1)); i <= (x + (k - 1)); i++) {
			System.out.print(sep + i);
			if ("".equals(sep))
				sep = " ";
		}
		System.out.println();
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
