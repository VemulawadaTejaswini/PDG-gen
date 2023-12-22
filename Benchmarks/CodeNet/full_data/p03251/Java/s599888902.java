import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N, n, M, m, X, Y;
		int xmax = -100, ymin = 100;
		N = scanner.nextInt();
		M = scanner.nextInt();
		X = scanner.nextInt();
		Y = scanner.nextInt();

		int x[] = new int[N];
		int y[] = new int[M];

		for (n = 1; n <= N; n++) {
			x[n - 1] = scanner.nextInt();
			xmax = Math.max(xmax, x[n - 1]);
		}
		for (m = 1; m <= M; m++) {
			y[m - 1] = scanner.nextInt();
			ymin = Math.min(ymin, y[m - 1]);
		}
		if (xmax <= ymin && X < xmax && ymin <= Y) {
			System.out.println("No War");
		} else {
			System.out.println("War");
		}

	}
}
