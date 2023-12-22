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

		String[] s = new String[N];
		int[] t = new int[N];

		for (int i = 0; i < N; i++) {
			s[i] = sc.next();
			t[i] = sc.nextInt();
		}

		String X = sc.next();

		sc.close();

		int ans = 0;
		boolean b = false; // ねてる=true
		for (int i = 0; i < N; i++) {
			if (b) {
				ans += t[i];
			}
			if (s[i].equals(X)) {
				b = true;
			}
		}

		out.println(ans);

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
