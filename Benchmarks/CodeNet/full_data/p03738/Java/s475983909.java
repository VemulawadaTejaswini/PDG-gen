import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Solver solver = new Solver();
		solver.init();
		// solver.readHead(in.readLine());
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
		// String[] strArr = str.split(" ");
		// N = Integer.parseInt(strArr[0]);
		// System.out.println(N);
	}

	public boolean hasNext() {
		return cnt < 2;
	}

	BigInteger A;
	BigInteger B;

	public void readBody(String str) {
		// System.out.println(str);]
		if (cnt == 0) {
			A = new BigInteger(str);
		} else {
			B = new BigInteger(str);
			int c = A.compareTo(B);
			if (c == -1)
				System.out.println("LESS");
			else if (c == 1)
				System.out.println("GREATER");
			else
				System.out.println("EQUAL");
		}
		cnt++;
	}
}
