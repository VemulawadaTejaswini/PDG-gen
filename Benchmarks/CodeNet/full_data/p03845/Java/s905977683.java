import java.util.Scanner;

public class Main {

	private static final long x = (long) Math.pow(10, 18);

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t[] = new int[n];
		int px[][] = new int[m][2];

		int sum = 0;
		for (int i = 0; i < n; i++) {
			t[i] = sc.nextInt();
			sum += t[i];
		}

		int m = sc.nextInt();

		for (int i = 0; i < m; i++) {
			px[i][0] = sc.nextInt();
			px[i][1] = sc.nextInt();
		}

		for (int i = 0; i < m; i++) {
			System.out.println(sum - t[px[i][0] - 1] + px[i][1]);
		}

		sc.close();
	}

}
