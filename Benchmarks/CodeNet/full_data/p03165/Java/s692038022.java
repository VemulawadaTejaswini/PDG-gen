import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        System.out.println(solve(s, t));

    }

	private static String solve(String s, String t) {
		int sLength = s.length();
		int tLength = t.length();

		int[][] dp = new int[sLength+1][tLength+1];

		for(int i = 1; i <= sLength; i++) {
			for(int j = 1; j <= tLength; j++) {
				if(s.charAt(i-1) == t.charAt(j-1))
					dp[i][j] = dp[i-1][j-1]+1;

				dp[i][j] = Math.max(dp[i-1][j], dp[i][j]);
				dp[i][j] = Math.max(dp[i][j-1], dp[i][j]);
			}
		}

		String re="";

		int i = sLength, j = tLength;
		while(dp[i][j] != 0) {
			if(dp[i][j]-1 == dp[i-1][j-1]) {
				re = s.charAt(i-1) + re;
				i--;
				j--;
			}else if(dp[i][j] == dp[i-1][j]) {
				i--;
			}else {
				j--;
			}
		}

		return re;

	}
}