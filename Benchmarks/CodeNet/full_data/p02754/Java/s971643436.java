import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		long N = sc.nextLong();
		long A = sc.nextLong();
		long B = sc.nextLong();

		sc.close();

		long ans = 0;

		ans += N / (A + B) * A;

		long z = N % (A + B);
		ans += Math.min(z, A);

		out.println(ans);
	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
