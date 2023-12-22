import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] x = new int[m];
		for (int i = 0; i < m; i++) {
			x[i] = sc.nextInt();
		}
		sc.close();

		if (n >= m) {
			System.out.println(0);
			return;
		}

		Arrays.sort(x);
		int ans = x[m - 1] - x[0];

		int[] y = new int[m - 1];
		for (int i = 0; i < m - 1; i++) {
			y[i] = x[i + 1] - x[i];
		}
		Arrays.sort(y);

		for (int i = 1; i < n; i++) {
			ans -= y[y.length - i];
		}
		System.out.println(ans);
	}
}
