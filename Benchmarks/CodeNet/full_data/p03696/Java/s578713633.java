import java.util.Scanner;

class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Scanner sc) {
		int n = sc.nextInt();
		String S = sc.next();

		char[] chars = S.toCharArray();
		StringBuilder sb = new StringBuilder(S);
		int counter = 0;
		int insert = 0;
		for (int i = 0; i < chars.length; i++) {
			char c = chars[i];
			if (c == '(') {
				counter++;
				insert = i;
			} else if (counter <= 0) {
				sb.insert(insert, '(');
			} else counter--;
		}
		for (int i = 0; i < counter; i++) {
			sb.append(')');
		}

		System.out.println(sb);
	}
}

class Main {
	public static void main(String... args) {
		Scanner in = new Scanner(System.in);

		Solver.INSTANCE.solve(in);

		in.close();
	}
}