import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
		}
		sc.close();

		int n2 = n * n;
		long ans = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] > n2) {
				long x = a[i] - n2;
				x = x - x % (n + 1);
				ans += x;
				a[i] -= x;
			}
		}

		long max = 0;
		int idx = 0;
		for (int i = 0; i < n; i++) {
			if (max < a[i]) {
				max = a[i];
				idx = i;
			}
		}
		while (max >= n) {
			ans++;
			max = 0;
			int nidx = 0;
			for (int i = 0; i < n; i++) {
				if (i == idx) {
					a[i] -= n;
				} else {
					a[i] ++;
				}
				if (max < a[i]) {
					max = a[i];
					nidx = i;
				}
			}
			idx = nidx;
		}
		System.out.println(ans);
	}
}
