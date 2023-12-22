import java.util.*;

public class Main {
	final int MOD = 100000000;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;
	final int LEN = 100000;
	Scanner sc = new Scanner(System.in);


	void doIt() {
		char[] s = sc.next().toCharArray();
		char[] t = sc.next().toCharArray();
		int dp[][] = new int[s.length + 1][t.length + 1];
		for(int i = 1; i <= s.length; i++) {
			for(int j = 1; j <= t.length; j++) {
				dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
				if(s[i - 1] == t[j - 1]) {
					dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - 1] + 1);	
				}
			}
		}
		
		StringBuilder strb = new StringBuilder();
		int si = s.length, ti = t.length;
		while(si > 0 && ti > 0) {
			if(dp[si][ti] == dp[si - 1][ti]) {
				si--;
			}
			else if(dp[si][ti] == dp[si][ti - 1]) {
				ti--;
			}
			else {
				strb.append(s[si - 1]);
				si--;
				ti--;
			}
			//System.out.println(si + " " + ti);
		}
		System.out.println(strb.reverse().toString());
		/*
		for(int i = 0; i <= s.length; i++) {
			System.out.println(Arrays.toString(dp[i]));
		}
		*/
	}
	public static void main(String[] args) {
		new Main().doIt();
	}
}