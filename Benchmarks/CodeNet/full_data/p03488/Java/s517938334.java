import java.util.Scanner;

public class Main {

	static int px, py, pd;
	static int count[][];
	static int mx[] = { -1, 0, 1, 0 };
	static int my[] = { 0, -1, 0, 1 };
	static String s;
	static int x, y;
	static boolean dp[][] = new boolean[8001][16001];

	public static boolean solve(int t, int n) {
		int tx = y + 8000;
		dp[0][8000] = true;
		if (t == 0) {
			tx = x + 8000;
			dp[0][px + 8000] = true;
		}
		for (int i = 1; i <= n; ++i) {
			for (int j = 0; j <= 16000; ++j) {
				if (dp[i - 1][j]) {
					dp[i][j + count[t][i]] = true;
					dp[i][j - count[t][i]] = true;
				}
			}
		}
		if (dp[n][tx])
			return true;
		return false;
	}

	public static void ini() {
		for (int i = 0; i < 2; ++i) {
			int n = dp[i].length;
			for (int j = 0; j < n; ++j) {
				dp[i][j] = false;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		s = sc.next();
		x = sc.nextInt();
		y = sc.nextInt();
		String ans[] = { "Yes", "No" };
		sc.close();
		int a = 1;
		int n = s.length();
		count = new int[2][(n / 2) + 1];
		int j = 0;
		for (int i = 0; i < n; ++i) {
			int tmp = j % 2;
			if (s.charAt(i) == 'F')
				++count[tmp][(j / 2) + tmp];
			else {
				++j;
			}
		}
		px += count[0][0];
		if (solve(0, (j / 2))) {
			ini();
			if (solve(1, (j / 2) + 1))
				a = 0;
		}
		System.out.println(ans[a]);
	}

}
