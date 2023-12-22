import java.util.Scanner;

class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Scanner sc) {
		int N = sc.nextInt();
		String S = sc.next();
		int count = 0;
		for (int i = 0; i < 10; i++) {
			int first = S.indexOf('0' + i);
			if (first < 0 || first > S.length() - 3) continue;
			for (int j = 0; j < 10; j++) {
				int second = S.indexOf('0' + j, first + 1);
				if (second < 0|| second > S.length() - 2) continue;
				for (int k = 0; k < 10; k++) {
					int third = S.indexOf('0' + k, second + 1);
					if (third < 0) continue;
					count++;
				}
			}
		}
		System.out.println(count);
	}
}

class Main {
	public static void main(String... args) {
		Scanner in = new Scanner(System.in);

		Solver.INSTANCE.solve(in);

		in.close();
	}
}