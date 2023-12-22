
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int x[] = new int[N];
		int y[] = new int[M];

		for (int i = 0; i < N; i++) {
			x[i] = sc.nextInt();
		}

		for (int i = 0; i < M; i++) {
			y[i] = sc.nextInt();
		}

		sc.close();
		Arrays.sort(x);
		Arrays.sort(y);
		boolean bool = false;

		if (X < x[N - 1] && y[0] < Y) {
			if (x[N - 1] < y[0]) {
				bool = true;
			}

		} else if (X < x[N - 1] && Y < y[0]) {
			if (x[N-1] < Y) {
				bool = true;
			}

		} else if (x[N - 1] < X && y[0] < Y) {
			if (X < y[0]) {
				bool = true;
			}

		} else if (x[N - 1] < X && Y < y[0]) {
			bool = true;
		}

		System.out.print(bool == true ? "No War" : "War");

	}
}
