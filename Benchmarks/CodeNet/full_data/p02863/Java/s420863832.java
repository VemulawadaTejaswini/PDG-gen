import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int T = sc.nextInt();
		Integer[][] item = new Integer[N][2];
		for (int i = 0; i < N; i++) {
			item[i][0] = sc.nextInt();
			item[i][1] = sc.nextInt();
		}
		Arrays.sort(item, new ArrayComparator(1, true));
		int[][] dp = new int[N + 1][T + 1];
		for (int i = 0; i < N + 1; i++) {
			for (int j = 0; j < T + 1; j++) {
				dp[i][j] = 0;
			}
		}
		for (int i = 0; i < N; i++) {
			int wi = item[i][0];
			int vi = item[i][1];
			for (int j = 0; j <= T - 1; j++) {
				if (i > 0) {
					dp[i][j] = dp[i - 1][j];
				}
				if (j >= wi) {
					dp[i][j] = Math.max(dp[i][j], (i > 0 ? dp[i - 1][j - wi] : 0) + vi);
				}
			}
		}
		int ans = 0;
		for (int i = 1; i < N; i++) {
			for (int j = 0; j < T; j++) {
				ans = Math.max(ans, dp[i - 1][j] + item[i][1]);
			}
		}
		System.out.println(ans);
	}

	@SuppressWarnings("rawtypes")
	public static class ArrayComparator implements Comparator<Comparable[]> {
		private final int columnToSort;
		private final boolean ascending;

		public ArrayComparator(int columnToSort, boolean ascending) {
			this.columnToSort = columnToSort;
			this.ascending = ascending;
		}

		public int compare(Comparable[] c1, Comparable[] c2) {
			@SuppressWarnings("unchecked")
			int cmp = c1[columnToSort].compareTo(c2[columnToSort]);
			return ascending ? cmp : -cmp;
		}
	}
}