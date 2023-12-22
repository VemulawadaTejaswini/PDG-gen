import java.util.Scanner;

final class Solver {
	static final Solver INSTANCE = new Solver();
	private char[] chars;

	void solve(Scanner sc) {
		int N = sc.nextInt();
		String A = sc.next();
		chars = A.toCharArray();
		int sum = chars[0] - '0' + chars[N - 1] -'0';
		boolean minus = true;
		for (int i = 1; i < N - 1; i++) {
			int x = chars[i] - '0';
			sum += (i + 1) * x * (minus ? -1 : 1);
			minus = !minus;
		}
		System.out.println(sum);
	}

	int x(int i, int j){
		if (i == 0) return chars[j] - '0';
		return Math.abs(x(i - 1, j) - x(i - 1, j + 1));
	}
}

class Main {
	public static void main(String... args) {
		Scanner in = new Scanner(System.in);

		Solver.INSTANCE.solve(in);

		in.close();
	}
}