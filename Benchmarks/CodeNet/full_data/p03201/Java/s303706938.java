
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		long[] a = new long[n];

		for (int i = 0; i < n; i++) {
			a[i] = Long.parseLong(sc.next());
		}

		Arrays.sort(a);
		int ans = 0;
		boolean[] used = new boolean[n];

		for (int i = n - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				if (used[i] || used[j])
					continue;

				if (judge(a[i] + a[j])) {
					ans++;
					used[j] = true;
					used[i] = true;
				}
			}
		}

		System.out.println(ans);

	}

	static boolean judge(long sum) {
		long right = sum - 1;
		if ((sum & right) == 0)
			return true;
		else
			return false;

	}

}
