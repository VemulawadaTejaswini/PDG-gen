import java.util.Arrays;
import java.util.Scanner;

public class Main {

	private static final long x = (long) Math.pow(10, 18);

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int x[][] = new int[n][n];

		for (int i = 0; i < n; i++) {
			Arrays.fill(x[i], 0);
		}

		for (int i = 0; i < m; i++) {
			int y = sc.nextInt();
			int z = sc.nextInt();
			x[y - 1][z - 1] += 1;
			x[z - 1][y - 1] += 1;
		}

		for (int i = 0; i < n; i++) {
			int sum = 0;
			for (int j = 0; j < n; j++) {
				sum += x[i][j];
			}
			System.out.println(sum);
		}


		sc.close();
	}

}
