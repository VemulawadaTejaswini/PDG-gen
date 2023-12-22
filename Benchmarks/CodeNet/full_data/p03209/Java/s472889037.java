import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	long numOfSou(int level) {
		if (level == 0) {
			return 1;
		} else {
			return 2 * numOfSou(level - 1) + 3;
		}

	}

	long f(int n, long x) {

		if (n == 0 && x == 1) {
			return 1;
		}
		else if (x == 1) {
			return 0;
		}

		long nos = numOfSou(n - 1);

		if (x <= nos + 1) {
			return f(n - 1, x - 1);
		} else if (x == nos + 2) {
			return f(n - 1, nos) + 1;
		} else if (x <= 2 * nos + 2) {
			return f(n - 1, nos) + 1 + f(n - 1, (x - (nos + 2)));
		} else {
			return 2 * f(n - 1, nos) + 1;
		}

	}

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();
		long X = sc.nextLong();

		sc.close();

		out.println(f(N, X));

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
