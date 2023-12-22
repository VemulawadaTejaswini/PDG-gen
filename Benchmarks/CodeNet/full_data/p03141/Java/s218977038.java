import java.util.*;

public class Main {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[]$) {
		int n = scanner.nextInt();
		int[][] a = new int[n][2];
		for (int i = 0; i < n; i++) {
			a[i][0] = scanner.nextInt();
			a[i][1] = scanner.nextInt();
		}
		Arrays.sort(a, Comparator.comparing(ar -> -(ar[0] + ar[1])));
		
		long takahashi = 0;
		long aoki = 0;
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				takahashi += a[i][0];
			} else {
				aoki += a[i][1];
			}
		}
		System.out.println(takahashi - aoki);
	}
}