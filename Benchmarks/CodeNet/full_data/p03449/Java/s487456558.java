import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();

		int[][] a = new int[2][n];
		// スペース区切りの整数の入力

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		int ans = 0;
		for (int i = 0; i < n; i++) {
			int max = 0;
			for (int j = 0; j < n; j++) {
				if (i == j) {
					max = max + a[1][j] + a[0][j];
				} else if (i < j) {
					max = max + a[1][j];
				} else {
					max = max + a[0][j];
				}
			}
			if (ans < max) {
				ans = max;
			}
		}

		System.out.println(ans);

	}
}
