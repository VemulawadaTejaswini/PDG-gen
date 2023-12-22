import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] t = new int[n];
		int[] a = new int[n];
		boolean[] tt = new boolean[n];
		boolean[] aa = new boolean[n];
		for (int i = 0; i < n; i++) {
			t[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		tt[0] = true;
		aa[n - 1] = true;
		for (int i = 1; i < n; i++) {
			if (t[i] > t[i - 1]) {
				tt[i] = true;
			}
		}
		for (int i = n - 2; i >= 0; i--) {
			if (a[i] > a[i + 1]) {
				aa[i] = true;
			}
		}
		long ans = 1;
		int div = 1000000007;
		for (int i = 0; i < n; i++) {
			if (aa[i] && !tt[i]) {
				if (a[i] <= t[i]) {
				} else {
					ans = 0;
					break;
				}
			} else if (!aa[i] && tt[i]) {
				if (a[i] >= t[i]) {
				} else {
					ans = 0;
					break;
				}
			} else if (aa[i] && tt[i]) {
				if (a[i] == t[i]) {
				} else {
					ans = 0;
					break;
				}
			} else if (!aa[i] && !tt[i]) {
				ans = (ans * Math.min(a[i], t[i])) % div;
			}
		}
		System.out.println(ans);
	}
}
