import java.io.InputStream;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();

		Set<String> used = new HashSet<>();
		String prevW;

		String ans = "Yes";
		prevW = sc.next();
		used.add(prevW);
		for (int i = 1; i < N; i++) {
			String w = sc.next();
			if (used.contains(w) || w.charAt(0) != prevW.charAt(prevW.length() - 1)) {
				ans = "No";
				break;
			}

			prevW = w;
			used.add(w);
		}

		out.println(ans);

		sc.close();

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
