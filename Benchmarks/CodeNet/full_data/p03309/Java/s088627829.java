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
		A = new long[N];
	}

	public boolean hasNext() {
		// return cnt < N;
		return cnt < 1;
	}

	public void readBody(String str) {
		// System.out.println(str);
		String[] strArr = str.split(" ");
		for (int i = 0; i < N; i++) {
			A[i] = Long.parseLong(strArr[i]);
		}
		cnt++;
	}

	long[] A;

	public void solve() {
		long[] C = new long[N];
		long min = Long.MAX_VALUE;
		long max = Long.MIN_VALUE;
		for (int i = 0; i < N; i++) {
			C[i] = A[i] - i - 1;
			if (C[i] < min)
				min = C[i];
			if (C[i] > max)
				max = C[i];
		}
		long diffMax = Long.MAX_VALUE;
		for (long b = min; b <= max; b++) {
			long diff = 0;
			for (int i = 0; i < N; i++) {
				diff += Math.abs(C[i] - b);
			}
			if (diff < diffMax)
				diffMax = diff;
		}
		System.out.println(diffMax);
	}
}
