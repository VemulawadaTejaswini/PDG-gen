import java.util.*;

public class Main {
    static long[][][] dp;
    static int[][] holds;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		dp = new long[x + 1][y + 1][z + 1];
		holds = new int[3][x + y + z + 1];
		for (int i = 1; i <= x + y + z; i++) {
		    holds[0][i] = sc.nextInt();
		    holds[1][i] = sc.nextInt();
		    holds[2][i] = sc.nextInt();
		}
		System.out.println(dfw(x, y, z));
	}
	
	static long dfw(int x, int y, int z) {
	    if (dp[x][y][z] != 0) {
	        return dp[x][y][z];
	    }
	    long ans = 0;
	    if (x > 0) {
	        ans = Math.max(ans, dfw(x - 1, y, z) + holds[0][x + y + z]);
	    }
	    if (y > 0) {
	        ans = Math.max(ans, dfw(x, y - 1, z) + holds[1][x + y + z]);
	    }
	    if (z > 0) {
	        ans = Math.max(ans, dfw(x, y, z - 1) + holds[2][x + y + z]);
	    }
	    dp[x][y][z] = ans;
	    return ans;
	}
}
