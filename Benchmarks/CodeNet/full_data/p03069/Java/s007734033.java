import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		char[] str = s.toCharArray();
		sc.close();

		int[] cnt = new int[n + 2];
		boolean flg = false;
		int idx = 0;
		for (int i = 0; i < n; i++) {
			if (flg) {
				if (str[i] == '.') {
					idx++;
					flg = !flg;
				}
			} else {
				if (str[i] == '#') {
					idx++;
					flg = !flg;
				}
			}
			cnt[idx]++;
		}
		if (idx % 2 == 0) {
			idx++;
		}

		int[] sum = new int[idx + 1];
		sum[0] = cnt[0];
		sum[1] = cnt[1];
		for (int i = 2; i <= idx; i++) {
			sum[i] = sum[i - 2] + cnt[i];
		}

		int ans = Integer.MAX_VALUE;
		for (int i = 0; i <= idx; i++) {
			if (i % 2 == 0) {
				int w = sum[idx - 1] - sum[i];
				int b = 0;
				if (i > 0) {
					b = sum[i - 1];
				}
				ans = Math.min(ans, w + b);
			} else {
				int w = sum[idx - 1] - sum[i - 1];
				int b = sum[i];
				ans = Math.min(ans, w + b);
			}
		}
		System.out.println(ans);
	}
}
