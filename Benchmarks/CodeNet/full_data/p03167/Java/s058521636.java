
import java.util.*;

public class Main
{
    private final static int MOD = 1_000_000_007;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
	String[] temp = in.nextLine().split(" ");
	int R = Integer.parseInt(temp[0]);
	int C = Integer.parseInt(temp[1]);
	char[][] map = new char[R][C];
	for (int i = 0; i < R; i++) {
	    String tmp = in.nextLine();
	    for (int j = 0; j < C; j++) {
		map[i][j] = tmp.charAt(j);
	    }
	}
	int[][] dp = new int[R][C];
	dp[0][0] = 1;
	for (int i = 0; i < R; i++) {
	    for (int j = 0; j < C; j++) {
		if (i - 1 > -1 && map[i-1][j] != '#') {
		    dp[i][j] += dp[i-1][j];
		    dp[i][j] %= MOD;
		}
		if (j-1 > -1 && map[i][j-1] != '#') {
		    dp[i][j] += dp[i][j-1];
		    dp[i][j] %= MOD;
		}
	    }
	}
	System.out.println(dp[R-1][C-1]);
	in.close();
    }
}
