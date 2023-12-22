import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			StringBuilder s = new StringBuilder(sc.next());
			StringBuilder t = new StringBuilder(sc.next());
			StringBuilder[][] dp = new StringBuilder[s.length()][t.length()];
			for(int i = 0; i < s.length(); i++) for(int j = 0; j < t.length(); j++) dp[i][j] = new StringBuilder();
			for(int i = 0; i < s.length(); i++) {
				if(s.charAt(i) == t.charAt(0)){
					dp[i][0].append(s.charAt(i));
				}
				if(i != 0 && dp[i][0].length() < dp[i - 1][0].length()) dp[i][0] = dp[i - 1][0];
			}
			for(int i = 0; i < t.length(); i++) {
				if(s.charAt(0) == t.charAt(i)) {
					dp[0][i].append(s.charAt(0));
				}
				if(i != 0 && dp[0][i].length() < dp[0][i - 1].length()) dp[0][i] = dp[0][i - 1];
			}

			for(int i = 1; i < s.length(); i++) {
				for(int j = 1; j < t.length(); j++) {
					int maxl = Math.max(Math.max(dp[i - 1][j].length(), dp[i][j - 1].length()), dp[i - 1][j - 1].length() + ((s.charAt(i) == t.charAt(j)) ? 1 : 0));
					if(maxl == (dp[i - 1][j - 1].length() + ((s.charAt(i) == t.charAt(j)) ? 1 : 0))) {
						String c = (s.charAt(i) == t.charAt(j)) ? String.valueOf(s.charAt(i)) : "";
						dp[i][j].append(dp[i - 1][j - 1]).append(c);
					}else if(maxl == dp[i][j - 1].length()) {
						dp[i][j] = dp[i][j - 1];
					}else {
						dp[i][j] = dp[i - 1][j];
					}

				}
			}
			System.out.println(dp[s.length() - 1][t.length() - 1]);
		}
	}
}