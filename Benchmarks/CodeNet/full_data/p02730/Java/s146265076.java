import java.util.Scanner;

final class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Scanner sc) {
		String S = sc.next();
		int N = S.length();
		String s2 = S.substring(0, ((N - 1) / 2));
		String s3 = S.substring(((N + 3) / 2) - 1, N);
		System.out.println(judge(S) && judge(s2) && judge(s3) ? "Yes" : "No");
	}

	boolean judge(String s){
		char[] chars = s.toCharArray();
		for (int i = 0; i < chars.length / 2; i++) {
			if (chars[i] != chars[chars.length - 1 - i]) {
				return false;
			}
		}
		return true;
	}
}

class Main {
	public static void main(String... args) {
		Scanner in = new Scanner(System.in);

		Solver.INSTANCE.solve(in);

		in.close();
	}
}