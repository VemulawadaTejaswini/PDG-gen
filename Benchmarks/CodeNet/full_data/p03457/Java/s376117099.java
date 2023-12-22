import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int t[] = new int[n];
			int x[] = new int[n];
			int y[] = new int[n];
			for (int i = 0; i < n; i++) {
				t[i] = sc.nextInt();
				x[i] = sc.nextInt();
				y[i] = sc.nextInt();
			}

			boolean result = true;
			for (int i = 0; i < n - 1; i++) {
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