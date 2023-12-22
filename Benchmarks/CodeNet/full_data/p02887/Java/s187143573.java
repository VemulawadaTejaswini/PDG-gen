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

		sc.close();

		char prev = 'X';

		int ans = 0;
		for (int i = 0; i < N; i++) {
			if (prev != S.charAt(i)) {
				ans++;
				prev = S.charAt(i);
			}
		}

		out.println(ans);

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
