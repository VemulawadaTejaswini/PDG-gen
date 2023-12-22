import java.util.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] stick = {0, 2, 5, 5, 4, 5, 6, 3, 7, 6};
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[m];
		for (int i = 0; i < m; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		int[] dp = new int[n + 1];
		for (int i = 1; i < n + 1; i++) {
			dp[i] = -10000000;
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < m; j++) {
				if (i - stick[a[j]] >= 0) {
					dp[i] = Math.max(dp[i], dp[i - stick[a[j]]] + 1);
				}
			}
		}
		StringBuilder sb = new StringBuilder();
		int index = n;
		while (index > 0) {
			for (int i = m - 1; i >= 0; i--) {
				if (index - stick[a[i]] >= 0 && dp[index - stick[a[i]]] == dp[index] - 1) {
					sb.append(a[i]);
					index -= stick[a[i]];
					break;
				}
			}
		}
		System.out.println(sb);
	}
}