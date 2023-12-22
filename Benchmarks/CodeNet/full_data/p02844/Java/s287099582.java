import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Solver solver = new Solver();
		solver.init();
		solver.readHead(in.readLine());
		solver.readS(in.readLine());
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
		N = Integer.parseInt(strArr[0]);
		// System.out.println(N);
	}

	public void readS(String str) {
		S = str;
		System.out.println(check(3, 0));
	}

	String S;

	private int check(int digi, int left) {
		if (digi < 1)
			return 0;
		if (left >= N)
			return 0;
		int ans = 0;
		for (char c = '0'; c <= '9'; c++) {
			for (int pos = left; pos < N; pos++) {
				if (S.charAt(pos) != c)
					continue;
				// System.out.println(digi + " " + c + " " + pos);
				if (digi == 1)
					ans += 1;
				else
					ans += check(digi - 1, pos + 1);
				break;
			}
		}
		return ans;
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
