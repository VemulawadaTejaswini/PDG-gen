import java.util.Scanner;

class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Scanner sc) {
		int N = sc.nextInt();
		int M = sc.nextInt();
		char[] chars = new char[N];
		for (int i = 0; i < M; i++) {
			int d = sc.nextInt() - 1;
			int raw = sc.nextInt();
			if (N != 1 && d == 0 && raw == 0) {
				System.out.println(-1);
				return;
			}
			char digit = (char) ('0' + raw);
			if (chars[d] != 0 && chars[d] != digit) {
				System.out.println(-1);
				return;
			}
			chars[d] = digit;
		}
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] == 0) {
				chars[i] = '0';
			}
		}
		int min = Integer.parseInt(String.copyValueOf(chars), 10);
		int n = Integer.toString(min, 10).length();
		if (N > n) {
			if (N == 3) min += 100;
			else if (N == 2) min += 10;
		}
		System.out.println(min);
	}
}

class Main {
	public static void main(String... args) {
		Scanner in = new Scanner(System.in);

		Solver.INSTANCE.solve(in);

		in.close();
	}
}