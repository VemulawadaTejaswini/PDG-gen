import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] a = new int[200001];
		int ans = 0, cnt = 0;

		for (int i = 0; i < n; i++) {
			int m = sc.nextInt();
			if (a[m] == 0) {
				cnt++;
			}
			a[m]++;
		}

		Arrays.sort(a);
		
		if (k == cnt) {
			System.out.println(ans);
		} else if (k < cnt) {
			// 減らす場合
			for (int i = 0; i < (cnt - k); i++) {
				ans += a[(200000 - cnt + i)];
			}
			System.out.println(ans);
		} else {
			// 増やす場合
			System.out.println((k - cnt));
		}

		sc.close();
	}
}
