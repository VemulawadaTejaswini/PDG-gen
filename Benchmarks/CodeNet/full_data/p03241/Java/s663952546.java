import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

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
		N = Integer.parseInt(strArr[0]);
		// System.out.println(N);
		int M = Integer.parseInt(strArr[1]);
		if (N == 1) {
			System.out.println(M);
			return;
		}

		HashSet<Integer> primes = new HashSet<Integer>();
		for (int n = 2; n <= M && n < 100000; n++) {
			boolean isP = true;
			for (int p : primes) {
				if (n % p == 0) {
					isP = false;
					break;
				}
			}
			if (isP)
				primes.add(n);
		}

		boolean isP = true;
		for (int p : primes) {
			// System.out.println(p);
			if (M % p == 0) {
				isP = false;
				break;
			}
		}
		if (isP) {
			System.out.println(1);
			return;
		}
		for (; M % N != 0; N++) {
		}
		System.out.println(M / N);
	}

	public boolean hasNext() {
		return cnt < N;
	}

	public void readBody(String str) {
		// System.out.println(str);
	}

	public void solve() {

	}
}
