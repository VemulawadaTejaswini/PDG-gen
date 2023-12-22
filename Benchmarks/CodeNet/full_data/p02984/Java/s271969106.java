import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		long[] ans = new long[n];
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				ans[0] += a[i];
			} else {
				ans[0] -= a[i];
			}
		}
		for (int i = 1; i < n; i++) {
			ans[i] = (a[i - 1] - ans[i - 1] / 2) * 2;
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			sb.append(ans[i]).append(' ');
		}
		sb.deleteCharAt(sb.length() - 1);
		System.out.println(sb.toString());
	}
}
