import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

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

	int M;

	class Shop {
		int A;
		int B;

		public Shop(int a, int b) {
			super();
			A = a;
			B = b;
		}
	}

	ArrayList<Shop> Shops = new ArrayList<Shop>();

	public void readHead(String str) {
		String[] strArr = str.split(" ");
		N = Integer.parseInt(strArr[0]);
		// System.out.println(N);
		M = Integer.parseInt(strArr[1]);
	}

	public boolean hasNext() {
		return cnt < N;
	}

	public void readBody(String str) {
		String[] strArr = str.split(" ");
		int a = Integer.parseInt(strArr[0]);
		int b = Integer.parseInt(strArr[1]);
		Shops.add(new Shop(a, b));
		cnt++;
	}

	public void solve() {
		Shops.sort((o1, o2) -> o1.A - o2.A);
		long m = M;
		long ans = 0;
		for (Shop s : Shops) {
			// System.out.println(s.A + " " + s.B);
			int d;
			if (m > s.B) {
				ans += s.A * s.B;
				m -= s.B;
			} else {
				ans += s.A * m;
				m = 0;
			}
			if (m <= 0)
				break;
		}
		System.out.println(ans);
	}
}
