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

		Arrays.parallelSort(x);

		int[] y = new int[m - 1];
		for (int i = 0; i < m - 1; i++) {
			y[i] = x[i + 1] - x[i];
		}
		Arrays.parallelSort(y);

		int ans = 0;
		int sub = m - n;
		for (int i = 0; i < sub; i++) {
			ans += y[i];
		}
		System.out.println(ans);
	}
}
