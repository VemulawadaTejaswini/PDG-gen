import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		final int X = sc.nextInt();

		sc.close();

		int ans;

		for (int i = 1;; i++) {
			if (((1 + i) * i) / 2 >= X) {
				ans = i;
				break;
			}
		}

		out.println(ans);

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
