

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sc.next());
		}
		int ans = 1;
		boolean flg = true;
		boolean h = false;

		for (int i = 0; i < n; i++) {
			if (i == n - 1)
				continue;

			if (flg) {
				if (a[i] < a[i + 1])
					h = true;
				else if (a[i] > a[i + 1])
					h = false;
				else {
					continue;
				}
				flg = false;
				continue;
			}

			if (h) {
				if (a[i] > a[i + 1]) {
					ans++;
					flg = true;
				}
			} else {
				if (a[i] < a[i + 1]) {
					ans++;
					flg = true;
				}
			}

		}

		System.out.println(ans);
	}

}
