import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();

		String[][] dp = new String[s.length()][t.length()];
		dp[0][0] = (s.charAt(0) == t.charAt(0)) ? String.valueOf(s.charAt(0)) : "";
		for (int i = 1; i < s.length(); i++) {
			dp[i][0] = (s.charAt(i) == t.charAt(0)) ? String.valueOf(s.charAt(i)) : dp[i - 1][0];
		}
		for (int j = 1; j < t.length(); j++) {
			dp[0][j] = (s.charAt(0) == t.charAt(j)) ? String.valueOf(t.charAt(j)) : dp[0][j - 1];
		}

		for (int i = 1; i < s.length(); i++) {
			for (int j = 1; j < t.length(); j++) {
				dp[i][j] = (dp[i - 1][j].length() > dp[i][j - 1].length()) ? dp[i - 1][j] : dp[i][j - 1];
				if (s.charAt(i) == t.charAt(j)) {
					dp[i][j] = (dp[i][j].length() > dp[i - 1][j - 1].length() + 1) ? dp[i][j]
							: dp[i - 1][j - 1] + String.valueOf(s.charAt(i));
				}
			}
		}

		System.out.println(dp[s.length() - 1][t.length() - 1]);

		sc.close();
	}

}
