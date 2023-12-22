import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solver {
	static final Solver INSTANCE = new Solver();

	void solve(Scanner sc) {
		String S = sc.next();
		String T = sc.next();

		StringBuilder sb = new StringBuilder();
		char[] q = T.toCharArray();
		for (char c : q) {
			sb.append('[');
			sb.append(c);
			sb.append("\\\\");
			sb.append('?');
			sb.append(']');
		}
		Pattern pattern = Pattern.compile("(?s)(.*)" + sb);
		Matcher matcher = pattern.matcher(S);
		if (matcher.find()) {
			String result = matcher.replaceFirst("$1" + T);
			System.out.println(result.replaceAll("\\?", "a"));
		} else {
			System.out.println("UNRESTORABLE");
		}

	}
}

class Main {
	public static void main(String... args) {
		Scanner in = new Scanner(System.in);

		Solver.INSTANCE.solve(in);

		in.close();
	}
}