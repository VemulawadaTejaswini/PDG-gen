import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();
		String S = sc.next();
		String T = sc.next();

		sc.close();

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			sb.append(S.charAt(i));
			sb.append(T.charAt(i));
		}

		out.println(sb.toString());

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
