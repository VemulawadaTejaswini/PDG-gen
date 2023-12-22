
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String atgs[]) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		String t = scan.next();

		int[][] dp = new int[s.length() + 1][t.length() + 1];
		for (int i = 1; i <= s.length(); i++) {
			for (int j = 1; j <= t.length(); j++) {
				//System.out.println(i + "  " + j);
				if (i == 0 || j == 0) {
					dp[i][j] = 0;
				} else if (s.charAt(i - 1) == t.charAt(j - 1)) {
					dp[i][j] = dp[i - 1][j - 1] + 1;
				} else {
					dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
				}
			}
		}
		//System.out.println(dp[s.length()][t.length()]);

		int i = s.length();
		int j = t.length();
		LinkedList<Character> lcs = new LinkedList<>();

		//System.out.println(Arrays.deepToString(dp));
		while (i != 0 && j != 0) {
			//.System.out.println(i + "  "+ j);
			if (s.charAt(i - 1) == t.charAt(j - 1)) {
				
				lcs.addFirst(s.charAt(i - 1));
				i -=1;
				j-=1;
			} else {
				if (dp[i - 1][j] >= dp[i][j-1]) {
					i -= 1;
				} else {
					j -= 1;
				}
			}
			
			
		}
		//lcs.addFirst(s.charAt(i - 1));
		StringBuilder sb = new StringBuilder();
		for(char c : lcs) {
			sb.append(c);
		}
		System.out.println(sb.toString());

	}
}
