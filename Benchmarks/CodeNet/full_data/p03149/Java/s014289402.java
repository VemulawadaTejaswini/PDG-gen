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
		String[] strArr = str.split(" ");
		// N = Integer.parseInt(strArr[0]);
		// System.out.println(N);
		int N1 = Integer.parseInt(strArr[0]);
		int N2 = Integer.parseInt(strArr[1]);
		int N3 = Integer.parseInt(strArr[2]);
		int N4 = Integer.parseInt(strArr[3]);
		boolean ans = true;
		if (N1 != 1 && N2 != 1 && N3 != 1 && N4 != 1)
			ans = false;
		if (N1 != 9 && N2 != 9 && N3 != 9 && N4 != 9)
			ans = false;
		if (N1 != 7 && N2 != 7 && N3 != 7 && N4 != 7)
			ans = false;
		if (N1 != 4 && N2 != 4 && N3 != 4 && N4 != 4)
			ans = false;
		if (ans)
			System.out.println("YES");
		else
			System.out.println("NO");
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
