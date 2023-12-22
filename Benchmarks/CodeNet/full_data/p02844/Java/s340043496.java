import java.util.*;

class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Scanner sc) {
		int N = sc.nextInt();
		String S = sc.next();

		Set<String > set = new HashSet<>();
		int[] ints = new int[10];
		char[] chars = S.toCharArray();
		for (int i = chars.length - 3; i >= 0; i--) {
			for (int j = chars.length - 1; j > i + 1; j--) {
				set.add(String.valueOf(new char[]{chars[i + 1], chars[j]}));
			}
			ints[chars[i] - '0'] = set.size();
		}
		System.out.println(Arrays.stream(ints).sum());
	}
}

class Main {
	public static void main(String... args) {
		Scanner in = new Scanner(System.in);

		Solver.INSTANCE.solve(in);

		in.close();
	}
}