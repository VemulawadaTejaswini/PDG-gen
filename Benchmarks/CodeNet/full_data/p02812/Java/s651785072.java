import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Scanner sc) {
		int N = sc.nextInt();
		String S = sc.next();
		Matcher matcher = Pattern.compile("ABC").matcher(S);
		int count = 0;
		while (matcher.find()){
			count++;
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