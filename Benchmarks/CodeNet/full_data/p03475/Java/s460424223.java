import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] c = new int[n];
		int[] s = new int[n];
		int[] f = new int[n];
		for (int i = 0; i < n - 1; i++) {
			c[i] = sc.nextInt();
			s[i] = sc.nextInt();
			f[i] = sc.nextInt();
		}
		s[n - 1] = Integer.MAX_VALUE;
		int[] a = new int[n];
		a[n - 1] = 0;
		for (int i = 0; i < n; i++) {
			int t = 0;
			for (int j = i; j < n - 1; j++) {
				if (t <= s[j]) {
					t = s[j] + c[j];
				} else {
					if ((t - s[j]) % f[j] == 0) t += c[j];
					else t += f[j] - (t - s[j] % f[j]) + c[j];
				}
			}
			a[i] = t;
		}

		for (int i = 0; i < n; i++) {
			System.out.println(a[i]);
		}
	}
}