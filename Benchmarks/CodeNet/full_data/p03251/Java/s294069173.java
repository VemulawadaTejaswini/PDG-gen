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
		int X = sc.nextInt();
		int Y = sc.nextInt();

		int[] x = new int[N + 1];
		int[] y = new int[M + 1];

		for (int i = 0; i < N; i++) {
			x[i] = sc.nextInt();
		}
		x[N] = X;

		for (int i = 0; i < M; i++) {
			y[i] = sc.nextInt();
		}
		y[M] = Y;

		Arrays.sort(x);
		Arrays.sort(y);

		int maxX = x[N];
		int maxY = y[0];

		if (maxX < maxY) {
			out.println("No War");
		} else {
			out.println("War");
		}

		sc.close();

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
