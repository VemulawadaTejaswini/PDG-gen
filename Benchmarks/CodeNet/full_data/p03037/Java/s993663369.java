import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 値を取得
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[n+2];
		int ans = 0;

		for (int i = 0; i < m; i++) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			a[l]++;
			a[r + 1]--;
		}

		for (int i = 1; i <= n; i++) {
			if (a[i] == m) {
				ans++;
			}
			a[i + 1] += a[i];
		}

		System.out.println(ans);

		sc.close();
	}
}
