import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] a = new int[2][n];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		sc.close();

		int ans = 0;
		for (int i = 0; i < n; i++) {
			int val = 0;
			for (int j = 0; j <= i; j++) {
				val += a[0][j];
			}
			for (int j = i; j < n; j++) {
				val += a[1][j];
			}
			ans = Math.max(ans, val);
		}
		System.out.println(ans);
	}
}
