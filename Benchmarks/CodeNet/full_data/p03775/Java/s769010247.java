import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Solver solver = new Solver();
		solver.init();
		solver.readHead(in.readLine());
		// for (; solver.hasNextN();) {
		// solver.readN(in.readLine());
		// }
		// for (; solver.hasNextM();) {
		// solver.readM(in.readLine());
		// }
		// solver.solve();
	}
}

class Solver {
	public void init() {
	}

	public void readHead(String str) {
		String[] strArr = str.split(" ");
		long N = Long.parseLong(strArr[0]);
		int ans = 0;
		for (long i = N; i > 0; i /= 10) {
			ans++;
		}
		for (long d = 1; d * d <= N; d++) {
			if (N % d == 0) {
				// System.out.println(d);
				if (N / d < d)
					break;
				int dig = 0;
				for (long i = N / d; i > 0; i /= 10) {
					dig++;
				}
				if (ans > dig)
					ans = dig;
			}
		}
		System.out.println(ans);
	}

}
