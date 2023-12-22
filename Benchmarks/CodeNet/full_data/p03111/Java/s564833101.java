import java.util.Scanner;

public class Main {
	private static int n = 0;
	private static int[] take = new int[4];
	private static int[] sozai;
	private static int ans = Integer.MAX_VALUE;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		take[1] = sc.nextInt();
		take[2] = sc.nextInt();
		take[3] = sc.nextInt();
		sozai = new int[n];
		for (int i = 0; i < n; i++) {
			sozai[i] = sc.nextInt();
		}
		sc.close();

		search("");
		System.out.println(ans);
	}

	private static void search(String pattern) {
		if (pattern.length() == n) {
			ans = Math.min(ans, calc(pattern));
			return;
		}
		for (int p = 0; p <= 3; p++) {
			search(pattern + p);
		}
	}

	private static int calc(String pattern) {
		int[] cnt = new int[4];
		int[] len = new int[4];
		for (int i = 0; i < pattern.length(); i++) {
			int p = Character.getNumericValue(pattern.charAt(i));
			cnt[p]++;
			len[p] += sozai[i];
		}

		int cost = 0;
		for (int p = 1; p <= 3; p++) {
			if (cnt[p] == 0) {
				return Integer.MAX_VALUE;
			}
			cost += Math.abs(take[p] - len[p]);
		}
		cost += (n - cnt[0] - 3) * 10;
//		System.out.println(pattern + ": " + cost);
		return cost;
	}
}
