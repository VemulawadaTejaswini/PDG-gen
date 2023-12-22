import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int t[] = new int[N + 1];
		int x[] = new int[N + 1];
		int y[] = new int[N + 1];

		t[0] = 0;
		x[0] = 0;
		y[0] = 0;

		for (int i = 0; i < N; i++) {
			t[i + 1] = sc.nextInt();
			x[i + 1] = sc.nextInt();
			y[i + 1] = sc.nextInt();
		}

		for (int i = 0; i < N; i++) {
			int t2 = t[i + 1] - t[i];
			int dist = Math.abs(x[i + 1] - x[i]) + Math.abs(y[i + 1] - y[i]);

			if(t2 < dist || (t2 - dist) % 2 != 0) {
				System.out.println("No");
				return;
			}
		}

		System.out.println("Yes");
	}

}
