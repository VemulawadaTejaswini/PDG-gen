import java.util.*;

public class Main {
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		long[][] cakes = new long[3][n];
		for (int i = 0 ; i < n ; i++) {
			cakes[0][i] = sc.nextLong();
			cakes[1][i] = sc.nextLong();
			cakes[2][i] = sc.nextLong();
		}
		int[][] rule = {{1,1,1},{1,1,-1},{1,-1,1},{-1,1,1},{1,-1,-1},{-1,1,-1},{-1,-1,1},{-1,-1,-1}};

		long max = 0;
		for (int i = 0 ; i < 8 ; i++) {
			int[] rule1 = rule[i];
			long tmp = 0;
			Long[] tmps = new Long[n];
			for (int j = 0 ; j < n ; j++) {
				tmps[j] = cakes[0][j] * rule1[0] + cakes[1][j] * rule1[1] + cakes[2][j] * rule1[2];
			}
			Arrays.sort(tmps, Comparator.reverseOrder());
			for (int j = 0 ; j < m ; j++) tmp += tmps[j];
			max = Math.max(tmp, max);
		}
		System.out.println(max);
	}
}
