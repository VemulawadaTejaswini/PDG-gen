import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	boolean f(String s, int st, int ed) {
		for (; st < ed; st++, ed--) {
			if (s.charAt(st - 1) != s.charAt(ed - 1)) {
				return false;
			}
		}
		return true;
	}

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		String S = sc.next();

		sc.close();

		int N = S.length();
		if (f(S, 1, N) && f(S, 1, (N - 1) / 2) && f(S, (N + 3) / 2, N)) {
			out.println("Yes");
		} else {
			out.println("No");
		}

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
