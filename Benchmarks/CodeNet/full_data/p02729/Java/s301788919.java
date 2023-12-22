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
		int M = sc.nextInt();

		sc.close();

		long ans = 0;

		if (N >= 2) {
			ans += (N * (N - 1)) / 2;
		}

		if (M >= 2) {
			ans += (M * (M - 1)) / 2;
		}

		out.println(ans);

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
