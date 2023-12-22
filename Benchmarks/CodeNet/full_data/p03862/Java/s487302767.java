import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int x = in.nextInt();

		int[] a = new int[n];
		int[] b = new int[n - 1];

		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		for (int i = 0; i < n - 1; i++) {
			b[i] = a[i] + a[i + 1];
		}
		long ans = 0;
		for (int i = 0; i < n - 1; i++) {
			if (b[i] > x) {
				while (a[i + 1] > 0 && b[i] > x) {
					ans++;
					b[i] = b[i] - 1;
					a[i + 1] = a[i + 1] - 1;
					if (i < n - 2) {
						b[i + 1] = b[i + 1] - 1;
					}
				}
				while (b[i] > x) {
					ans++;
					b[i] = b[i] - 1;
					a[i] = a[i] - 1;
				}
			}
		}

		// 出力
		System.out.println(ans);
	}
}