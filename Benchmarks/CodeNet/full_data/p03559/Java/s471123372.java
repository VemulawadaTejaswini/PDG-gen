import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] a = new int [n];
		int[] b = new int [n];
		int[] c = new int [n];

		int[] cnt = new int [n];
		int[] cnt2 = new int [n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			cnt[i] = 0;
			cnt2[i] = 0;
		}
		for (int i = 0; i < n; i++) {
			b[i] = sc.nextInt();
			for (int j = 0; j < n; j++) {
				if (b[i] > a[j]) {
					cnt[i]++;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			c[i] = sc.nextInt();
			for (int j = 0; j < n; j++) {
				if (c[i] > b[j]) {
					cnt2[j]++;
				}
			}
		}

		int ans = 0;
		for (int i = 0; i < n; i++) {
			ans += cnt[i] * cnt2[i];
		}

		System.out.print(ans);
	}

}
