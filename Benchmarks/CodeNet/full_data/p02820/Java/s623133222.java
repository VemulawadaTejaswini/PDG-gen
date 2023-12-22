import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int r = sc.nextInt();
		int s = sc.nextInt();
		int p = sc.nextInt();
		String t = sc.next();

		int ans = 0;
		char[] rivals = t.toCharArray(); // 敵の出す手
		boolean[] changed = new boolean[n]; // 変更フラグ

		for (int i = 0; i < n; i++) {
			if (i <= k - 1) {
				char winner = getWinner(rivals[i]);
				int score = getScore(winner, r, p, s);
				changed[i] = false;
				ans += score;
			} else {
				if (rivals[i] == rivals[i - k]) {
					if (!changed[i - k]) {
						ans += 0;
						changed[i] = true;
					} else {
						char winner = getWinner(rivals[i]);
						int score = getScore(winner, r, p, s);
						changed[i] = false;
						ans += score;
					}
				} else {
					char winner = getWinner(rivals[i]);
					int score = getScore(winner, r, p, s);
					changed[i] = false;
					ans += score;
				}
			}
		}

		System.out.println(ans);
		sc.close();
	}

	public static char getWinner(char hand) {
		if (hand == 'r') {
			return 'p';
		} else if (hand == 's') {
			return 'r';
		} else if (hand == 'p') {
			return 's';
		}
		return 0;
	}

	public static int getScore(char hand, int r, int p, int s) {
		if (hand == 'r') {
			return r;
		} else if (hand == 's') {
			return s;
		} else if (hand == 'p') {
			return p;
		}
		return 0;
	}

}
