import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int N = sc.nextInt();
		double ans = 0;
		int[] x = new int[N];
		for (int i = 0; i < N; i++) {
			x[i] = sc.nextInt();
		}
		Arrays.sort(x);
		if (x[0] != 0 && (N % 2) == 1) {
			System.out.println("0");
		} else if ((x[0] != 1 || x[1] != 1) && (N % 2) == 0) {
			System.out.println("0");
		} else if ((N % 2) == 1) {
			// 奇数のとき
			for (int i = 1; i < N / 2; i++) {
				if (x[i*2 - 1] != (2 * i) || x[i*2] != (2 * i)) {
					ans++;
				}
			}
			if (ans == 0) {
				ans = Math.pow(2, N/2);
				System.out.println(String.format("%.0f", ans));
			} else {
				System.out.println("0");
			}
		} else if ((N % 2) == 0) {
			// 偶数のとき
			for (int i = 0; i < N/2 - 1; i++) {
				if (x[i*2] != ((2 * i) + 1) || x[i*2 + 1] != ((2 * i) + 1)) {
					ans++;
				}
			}
			if (ans == 0) {
				ans = Math.pow(2, N/2);
				System.out.println(String.format("%.0f", ans));
			} else {
				System.out.println("0");
			}
		}
		sc.close();
	}
}
