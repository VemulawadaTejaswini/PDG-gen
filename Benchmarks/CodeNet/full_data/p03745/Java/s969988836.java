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

	public void readBody(String str) {
		String[] strArr = str.split(" ");
		int c = 1;
		int b = Integer.parseInt(strArr[0]);
		int d = 0;
		for (int i = 0; i < N; i++) {
			int a = Integer.parseInt(strArr[i]);
			if (d == 1 && b > a) {
				c++;
			} else if (d == -1 && b < a) {
				c++;
			} else {
				if (a > b)
					d = 1;
				else if (a < b)
					d = -1;
				else
					d = 0;
			}
			b = a;
		}
		System.out.println(c);
		cnt++;
	}
}
