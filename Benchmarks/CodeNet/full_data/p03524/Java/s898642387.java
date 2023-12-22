import java.util.Scanner;

class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Scanner sc) {
		String S = sc.next();
		int a = 0;
		int b = 0;
		int c = 0;
		char[] chars = S.toCharArray();
		for (char ch : chars) {
			switch (ch) {
				case 'a':
					a++;
					break;
				case 'b':
					b++;
					break;
				case 'c':
					c++;
					break;
			}
		}
		System.out.println(a >= chars.length / 3 && b >= chars.length / 3 && c >= chars.length / 3 ? "YES" : "NO");
	}
}

class Main {
	public static void main(String... args) {
		Scanner in = new Scanner(System.in);

		Solver.INSTANCE.solve(in);

		in.close();
	}
}