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
		int A = Integer.parseInt(strArr[0]);
		int B = Integer.parseInt(strArr[1]);
		int ans = 0;
		for (int i = A; i <= B; i++) {
			String s = Integer.toString(i);
			ans++;
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j) != s.charAt(s.length() - j - 1)) {
					ans--;
					break;
				}
			}
		}
		System.out.println(ans);
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
