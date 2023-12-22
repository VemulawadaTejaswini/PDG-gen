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

		Arrays.sort(x);
		Arrays.sort(y);

		int x_max = x[N-1];
		int y_min = y[0];

		boolean ans = false;

		for (int i = x_max + 1; i <= y_min; i++) {
			if (X < i && i <= Y) {
				ans = true;
				break;
			}
		}
		if (ans) {
			System.out.println("No War");
		} else {
			System.out.println("War");
		}
	}
}
