import java.util.Scanner;

class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Scanner sc) {
		int N = sc.nextInt();
		String[] S = new String[N];
		for (int i = 0; i < N; i++) {
			S[i] = sc.next();
		}

		int count = 0;
		int ba = 0;
		int startsWithB = 0;
		int endsWithA = 0;
		for (String s : S) {
			char[] chars = s.toCharArray();
			boolean sb = chars[0] == 'B';
			boolean ea = chars[chars.length - 1] == 'A';

			if (sb && ea){
				ba++;
			} else if (sb) {
				startsWithB++;
			} else if (ea) {
				endsWithA++;
			}

			for (int j = 1; j < chars.length; j++) {
				if (chars[j - 1] == 'A' && chars[j] == 'B') {
					count += 1;
				}
			}
		}
		count += ba / 2;
		count += endsWithA == startsWithB ? endsWithA : Math.min(endsWithA, startsWithB) + Math.min(ba, 1);
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