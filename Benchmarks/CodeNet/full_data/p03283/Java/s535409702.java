import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int Q = sc.nextInt();
		int[] l = new int[m];
		int[] r = new int[m];
		int[][] sum = new int[n][n];
		for (int i = 0; i < m; i++) {
			l[i] = sc.nextInt() - 1;
			r[i] = sc.nextInt() - 1;
			sum[l[i]][r[i]]++;
		}
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				sum[i][j] += sum[i][j - 1];
			}
		}

		for (int i = 0; i < Q; i++) {
			int p = sc.nextInt() - 1;
			int q = sc.nextInt() - 1;
			int ans = 0;
			for (int j = p; j <= q; j++) {
				ans += sum[j][q];
			}
			System.out.println(ans);
		}
		sc.close();
	}
}
