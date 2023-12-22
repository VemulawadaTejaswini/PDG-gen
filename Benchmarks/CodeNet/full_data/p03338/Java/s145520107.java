import java.io.InputStream;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	private int kyotu(String a, String b) {
		Set<Character> ac = new HashSet<>();
		for (char c : a.toCharArray()) {
			ac.add(c);
		}
		Set<Character> bc = new HashSet<>();
		for (char c : b.toCharArray()) {
			bc.add(c);
		}

		ac.retainAll(bc);

		return ac.size();

	}

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();
		String S = sc.next();
		sc.close();

		int ans = 0;
		for (int i = 2; i < N; i++) {
			String a = S.substring(0, i);
			String b = S.substring(i);

			ans = Math.max(ans, kyotu(a, b));
		}
		out.println(ans);

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
