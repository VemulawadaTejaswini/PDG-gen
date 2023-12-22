import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		long[] dp = new long[m + 1];

		for (int i = 0; i < n; i++) {
			long amount = sc.nextLong();
			long[] newDp = new long[m + 1];
			if (i == 0) {
				newDp[0] = amount;
			} else {
				newDp[0] = dp[0] + amount;
			}
			for (int j = 1; j < m + 1; j++) {
				if (i == 0) {
					newDp[j] = (long)(amount / Math.pow(2, j));
				} else {
					long value = Long.MAX_VALUE;
					for (int k = 0; k <= j; k++) {
						long tmp = (j == k) ? dp[k] + amount : dp[k] + (long)(amount / Math.pow(2, j - k));
						if (tmp < value) {
							value = tmp;
						}
					}
					newDp[j] = value;
				}
			}
			dp = newDp;
		}

		System.out.println(dp[m]);
	}

}

