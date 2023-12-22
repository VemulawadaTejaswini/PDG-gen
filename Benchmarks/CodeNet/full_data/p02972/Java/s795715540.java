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
		solver.readA(in.readLine());
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

	public void readA(String str) {
		String[] strArr = str.split("\\s+");
		int[] A = new int[N + 1];
		for (int i = 1; i <= N; i++)
			A[i] = Integer.parseInt(strArr[i - 1]);
		HashSet<Integer> B = new HashSet<Integer>();
		for (int i = N; i >= 1; i--) {
			int b = A[i];
			for (int j = i * 2; j <= N; j = j + i) {
				if (B.contains(j)) {
					if (b == 0)
						b = 1;
					else
						b = 0;
				}
			}
			if (b == 1)
				B.add(i);
		}
		System.out.println(B.size());
		String sep = "";
		for (int n : B) {
			System.out.print(sep);
			if ("".equals(sep))
				sep = " ";
			System.out.print(n);
		}
		System.out.println();
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
