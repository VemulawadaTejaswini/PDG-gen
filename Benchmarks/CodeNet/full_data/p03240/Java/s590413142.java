import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] x = new int[n];
		int[] y = new int[n];
		int[] h = new int[n];

		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			h[i] = sc.nextInt();
		}

		int ax = 0;
		int ay = 0;
		int ah = 0;
		boolean flag = false;

		for (int i = 0; i <= 100; i++) {
			for (int j = 0; j <= 100; j++) {
				flag = true;

				int valid = -1;

				for (int k = 0; k < n; k++) {
					if (h[k] == 0)
						continue;
					valid = k;
				}
				int H = h[valid] + Math.abs(i - x[valid]) + Math.abs(j - y[valid]);

				for (int k = 0; k < n; k++) {
					if (h[k] != Math.max(0, H - Math.abs(x[k] - i) - Math.abs(y[k] - j))) {
						flag = false;
					}
				}
				if (flag) {
					ax = i;
					ay = j;
					ah = H;
					break;
				}

			}
		}

		System.out.println(ax + " " + ay + " " + ah);

		sc.close();

	}
}