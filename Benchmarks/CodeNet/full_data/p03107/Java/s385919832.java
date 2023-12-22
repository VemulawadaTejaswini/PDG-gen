import java.util.Scanner;

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Scanner sc) {
		String S = sc.next();
		char[] chars = S.toCharArray();
		int red = 0;
		int blue = 0;
		for (char ch : chars) {
			if (ch == '0') {
				red += 1;
			} else {
				blue += 1;
			}
		}
		System.out.println(S.length() - Math.abs(red - blue));
	}
}

class Main {
	public static void main(String... args) {
		Scanner in = new Scanner(System.in);

		Solver.INSTANCE.solve(in);

		in.close();
	}
}