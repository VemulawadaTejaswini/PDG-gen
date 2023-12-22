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
		return cnt < 1;
	}

	private int[] a;

	public void readBody(String str) {
		String[] strArr = str.split(" ");
		int[] a = new int[N];
		for (int i = 0; i < N; i++)
			a[i] = Integer.parseInt(strArr[i]);

		int c = 1;
		int d = 0;
		for (int i = 1; i < N; i++) {
			if (a[i - 1] > a[i]) {
				if (d == 1) {
					c++;
					d = 0;
				} else
					d = -1;
			} else if (a[i - 1] < a[i]) {
				if (d == -1) {
					c++;
					d = 0;
				} else
					d = 1;
			}
		}
		System.out.println(c);
		cnt++;
	}

}
