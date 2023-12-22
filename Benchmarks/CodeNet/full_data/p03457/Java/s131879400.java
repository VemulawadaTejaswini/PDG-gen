import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] t = new int[n + 1];
		int[] x = new int[n + 1];
		int[] y = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			t[i] = sc.nextInt();
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		sc.close();

		for (int i = 1; i <= n; i++) {
			int d = Math.abs(x[i] - x[i - 1]) + Math.abs(y[i] - y[i - 1]);
			int dt = t[i] - t[i - 1];
			if (d > dt || (d - dt) % 2 != 0) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}
}
