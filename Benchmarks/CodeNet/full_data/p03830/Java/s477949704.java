import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int N = sc.nextInt();
		long ans = 1;
		int y = 0;
		int[] s = new int[N+1];

		for (int i = 2; i <= N; i++) {
			// 素因数分解
			y = i;
			for (int j = 2; j <= i; j++) {
				while (y % j == 0) {
					y = y / j;
					s[j] = s[j] + 1;
				}
			}
		}

		for (int i = 0; i <= N; i++) {
			if (s[i] != 0) {
				ans = ans * (s[i] + 1);
				ans = ans % 1000000007;
			}
		}
		System.out.println(ans);

		sc.close();
	}
}
