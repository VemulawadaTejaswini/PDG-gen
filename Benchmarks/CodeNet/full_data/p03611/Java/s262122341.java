import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();

		int[] z = new int[100000];
		for (int i = 0; i < N; i++) {
			z[sc.nextInt()]++;
		}

		sc.close();

		int ans = 0;

		for (int X = 0; X < z.length; X++) {
			int b = z[X];
			if (X > 0)
				b += z[X - 1];
			if (X < z.length - 1)
				b += z[X + 1];

			ans = Math.max(ans, b);
		}

		out.println(ans);

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
