import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Solver solver = new Solver();
		solver.init();
		// solver.readHead(in.readLine());
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
		return cnt < 2;
	}

	int W;
	int H;

	public void readBody(String str) {
		// System.out.println(str);
		String[] strArr = str.split(" ");
		if (cnt < 1) {
			W = Integer.parseInt(strArr[0]);
			H = Integer.parseInt(strArr[1]);
		} else {
			int w = Integer.parseInt(strArr[0]);
			int h = Integer.parseInt(strArr[1]);
			int ans = (W - w) * (H - h);
			System.out.println(ans);
		}
		cnt++;
	}

	public void solve() {

	}
}
