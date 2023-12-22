import java.util.Scanner;

public class Main {
	
	private static void solve(String s, String t) {
		
		int sl = s.length();
		int tl = t.length();
		
		int[][] dp = new int[sl+1][tl+1];
		int[][][] track = new int[sl+1][tl+1][3];
		
		for (int i=1; i<=sl; i++) {
			for (int j=1; j<=tl; j++) {
				
				if (s.charAt(i-1) == t.charAt(j-1)) {
					dp[i][j] = 1 + dp[i-1][j-1];
					track[i][j][0] = i-1;
					track[i][j][1] = j-1;
					track[i][j][2] = 1;
				}
				else if (dp[i-1][j] > dp[i][j-1]) {
					dp[i][j] = dp[i-1][j];
					track[i][j][0] = i-1;
					track[i][j][1] = j;
					track[i][j][2] = 0;
				}
				else {
					dp[i][j] = dp[i][j-1];
					track[i][j][0] = i;
					track[i][j][1] = j-1;
					track[i][j][2] = 0;
				}
			}
		}

		StringBuilder sb = new StringBuilder(Math.min(sl, tl));
		
		int i = sl, j = tl;
		while (!(i == 0 && j == 0 && track[i][j][2] == 0)) {
			
			if (track[i][j][2] == 1) {
				sb.append(s.charAt(i-1));
			}
			int i2 = track[i][j][0];
			int j2 = track[i][j][1];
			
			i = i2;
			j = j2;
		}
		
		System.out.println(sb.reverse());
	}
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		String s = scanner.next();
		String t = scanner.next();
	
		solve( s, t);
		
		scanner.close();
	}

}
 