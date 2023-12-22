import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int t[] = new int[n + 1];
			int x[] = new int[n + 1];
			int y[] = new int[n + 1];
			t[0] = 0;
			x[0] = 0;
			y[0] = 0;
			for (int i = 1; i < n + 1; i++) {
				t[i] = sc.nextInt();
				x[i] = sc.nextInt();
				y[i] = sc.nextInt();
			}

			boolean result = true;
			for (int i = 0; i < n; i++) {
				int check = (t[i + 1] - t[i]) - Math.abs(x[i + 1] - x[i]) - Math.abs(y[i + 1] - y[i]);
				if (check < 0) {
					result = false;
					break;
				}
			}

			if (result == true) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}

	}

}