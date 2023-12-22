import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();
		int T = sc.nextInt();
		int A = sc.nextInt();

		double min = Double.MAX_VALUE;
		int ans = 0;

		for (int i = 1; i <= N; i++) {
			int h = sc.nextInt();

			double t = T - (h * 0.006);
			double d = Math.abs(A - t);

			if (min > d) {
				min = d;
				ans = i;
			}
		}

		out.println(ans);

		sc.close();

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
