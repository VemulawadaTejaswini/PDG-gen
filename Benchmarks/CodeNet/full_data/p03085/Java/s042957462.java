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
		// String[] strArr = str.split(" ");
		// N = Integer.parseInt(strArr[0]);
		// System.out.println(N);
		for (int i = 0; i < str.length(); i++) {
			switch (str.charAt(i)) {
			case 'A':
				System.out.print("T");
				break;
			case 'T':
				System.out.print("A");
				break;
			case 'C':
				System.out.print("G");
				break;
			case 'G':
				System.out.print("C");
				break;
			}
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
