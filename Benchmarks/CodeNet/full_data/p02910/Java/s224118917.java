import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		final String S = sc.next();

		sc.close();

		String ans = "Yes";

		for (int i = 0; i < S.length(); i++) {
			final char c = S.charAt(i);
			if (i % 2 == 0) {
				if (!(c == 'R' || c == 'U' || c == 'D')) {
					ans = "No";
					break;
				}
			} else {
				if (!(c == 'L' || c == 'U' || c == 'D')) {
					ans = "No";
					break;
				}

			}
		}

		out.println(ans);

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
