import java.util.*;
import java.io.*;

class Main {
	private static Integer MOD = (int)1e9+7;

	private static Integer findTotalPaths(String []grid, int H, int W) {
		int [][]dp = new int[H+1][W+1];

		for(int i=0; i <= H; ++i)
			Arrays.fill(dp[i], 0);

		for(int i=1; i <= H; ++i)
			for(int j=1; j <= W; ++j) {
				if (i == 1 && j == 1)
					dp[i][j] = 1;

				else if (grid[i-1].charAt(j-1) == '.') {
					dp[i][j] = (dp[i-1][j]%MOD + dp[i][j-1]%MOD)%MOD;
				}
			}
		return dp[H][W]%MOD;
	}

	public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String []s = br.readLine().split(" ");


        int H = Integer.parseInt(s[0]);
        int W = Integer.parseInt(s[1]);

		String []grid = new String[H];

		for(int i=0; i < H; ++i)
			grid[i] = br.readLine();

		System.out.println(findTotalPaths(grid, H, W));
    }
}