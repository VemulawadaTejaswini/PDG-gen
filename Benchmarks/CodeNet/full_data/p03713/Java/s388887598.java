import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		sc.close();

		if (h % 3 == 0 || w % 3 == 0) {
			System.out.println(0);
			return;
		}

		long[] ans = new long[4];

		// 横2本
		ans[0] = w;

		// 縦2本
		ans[1] = h;

		// 縦＋横半分
		ans[2] = Long.MAX_VALUE;
		int end = w / 2;
		for (int i = w / 4; i <= end; i++) {
			long a = (long) h * i;
			long b = (long) h / 2 * (w - i);
			long max = Math.abs(a - b);
			if (h % 2 == 1) {
				long c = b + w - i;
				max = Math.max(max, Math.abs(a - c));
				max = Math.max(max, Math.abs(b - c));
			}
			ans[2] = Math.min(ans[2], max);
		}

		// 横＋縦半分
		ans[3] = Long.MAX_VALUE;
		end = h / 2;
		for (int i = h / 4; i <= end; i++) {
			long a = (long) w * i;
			long b = (long) w / 2 * (h - i);
			long max = Math.abs(a - b);
			if (w % 2 == 1) {
				long c = b + h - i;
				max = Math.max(max, Math.abs(a - c));
				max = Math.max(max, Math.abs(b - c));
			}
			ans[3] = Math.min(ans[3], max);
		}

		long ansM = ans[0];
		for (int i = 1; i < ans.length; i++) {
			ansM = Math.min(ansM, ans[i]);
		}
		System.out.println(ansM);
	}
}
