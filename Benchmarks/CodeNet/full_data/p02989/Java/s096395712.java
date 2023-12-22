import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Solver solver = new Solver();
		solver.init();
		solver.readHead(in.readLine());
		solver.readD(in.readLine());
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

	public void readD(String str) {
		String[] strArr = str.split("\\s+");
		HashMap<Integer, Integer> hist = new HashMap<Integer, Integer>();
		int dmax = 1;
		for (int i = 0; i < N; i++) {
			int d = Integer.parseInt(strArr[i]);
			if (hist.containsKey(d)) {
				hist.put(d, hist.get(d) + 1);
			} else {
				hist.put(d, 1);
			}
			if (d > dmax)
				dmax = d;
		}
		int cnt = 0;
		int h = 0;
		for (int i = 0; i < dmax && h <= N / 2; i++) {
			if (hist.containsKey(i)) {
				h += hist.get(i);
			}
			if (h == N / 2)
				cnt++;
		}
		System.out.println(cnt);
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
