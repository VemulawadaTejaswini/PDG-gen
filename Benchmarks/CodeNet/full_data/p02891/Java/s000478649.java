import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Solver solver = new Solver();
		solver.init();
		solver.readHead(in.readLine());
		solver.readK(in.readLine());
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
		S = str;
	}

	String S;

	public void readK(String str) {
		int K = Integer.parseInt(str);
		if (S.length() == 1) {
			System.out.println(K / 2);
			return;
		}

		long ans = 0;
		int[] trans = new int[S.length()];
		for (int i = 1; i < S.length(); i++) {
			if (S.charAt(i - 1) == S.charAt(i) && trans[i - 1] == 0) {
				ans += K;
				trans[i] = 1;
			}
		}
		if (S.charAt(0) == S.charAt(S.length() - 1) && trans[S.length() - 1] == 0) {
			ans += (K - 1);
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
