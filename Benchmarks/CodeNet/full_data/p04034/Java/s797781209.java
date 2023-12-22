import java.util.Arrays;
import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] col = new int[n];
		int[] num = new int[n];
		col[0] = 1;
		Arrays.fill(num, 1);
		for (int i = 0; i < m; i++) {
			int x = sc.nextInt() - 1;
			int y = sc.nextInt() - 1;

			if (col[x] == 1) {
				if (num[x] == 1) {
					col[x] = 0;
				}
				col[y] = 1;
			}
			num[x]--;
			num[y]++;
		}
		for (int i = 1; i < n; i++) {
			col[i] += col[i - 1];
		}
		System.out.println(col[n - 1]);
	}

	public static void main(String[] args) {
		new Main().run();
	}
}
