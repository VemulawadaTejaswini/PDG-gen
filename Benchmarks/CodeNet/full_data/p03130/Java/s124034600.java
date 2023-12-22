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
		// N = 0;
		N = 3;
		cnt = 0;
	}

	public void readHead(String str) {
		String[] strArr = str.split(" ");
		// N = Integer.parseInt(strArr[0]);
		// System.out.println(N);
	}

	public boolean hasNext() {
		return cnt < N;
	}

	int[] a = new int[3];
	int[] b = new int[3];
	int[] p = new int[5];

	public void readBody(String str) {
		// System.out.println(str);
		String[] strArr = str.split(" ");
		a[cnt] = Integer.parseInt(strArr[0]);
		b[cnt] = Integer.parseInt(strArr[1]);
		p[a[cnt]]++;
		p[b[cnt]]++;
		cnt++;
	}

	public void solve() {
		// System.out.println(a[0] + " " + a[1] + " " + a[2]);
		// System.out.println(b[0] + " " + b[1] + " " + b[2]);
		for (int i = 1; i <= 4; i++) {
			if (p[i] > 2) {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
	}
}
