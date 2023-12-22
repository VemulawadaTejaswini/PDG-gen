import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int t[] = new int[n + 1];
		int x[] = new int[n + 1];
		int y[] = new int[n + 1];

		for (int i = 1; i <= n; i++) {
			t[i] = scanner.nextInt();
			x[i] = scanner.nextInt();
			y[i] = scanner.nextInt();
		}

		for (int i = 0; i < n; i++) {
			int time = t[i + 1] - t[i];
			int dis = Math.abs(x[i + 1] - x[i]) + Math.abs(y[i + 1] - y[i]);
			if (dis <= time && dis % 2 == time % 2)
				continue;
			else {
				System.out.println("No");
				return;
			}
		}

		System.out.println("Yes");
	}
}
