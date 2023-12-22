import java.io.InputStream;
import java.io.PrintStream;
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

		if ((B - A) % 2 == 0) {
			out.println((B - A) / 2);
		} else {
			long a = A + (B - A) / 2;
			long b = (N - A + (N - B + 1)) / 2;
			out.println(Math.min(a, b));
		}

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
