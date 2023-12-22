import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] fields = input.nextLine().split(" ");
		int H = Integer.parseInt(fields[0]);
		int W = Integer.parseInt(fields[1]);
		String[][] grid = new String[H][W];
		for (int i = 0; i < grid.length; i++) {
			String x = input.nextLine();
			for (int j = 0; j < x.length(); j++) {
				grid[i][j] = x.substring(j,j+1);
			}
		}
		System.out.println(uniquePathsWithObstacles(grid));
	}
	public static int uniquePathsWithObstacles(String[][] obstacleGrid) {
        int[][] dp = new int[obstacleGrid.length][obstacleGrid[0].length];
        int mod = 1000000007;
        if (obstacleGrid[0][0].equals("#")) return 0;
        dp[0][0] = 1;
        for (int i = 1; i < obstacleGrid.length; i++) {
        	if (!obstacleGrid[i][0].equals("#")) dp[i][0] = 1;
        	else break;
        }
        for (int i = 1; i < obstacleGrid[0].length; i++) {
        	if (!obstacleGrid[0][i].equals("#")) dp[0][i] = 1;
        	else break;
        }
        for (int i = 1; i < obstacleGrid.length; i++) {
        	for (int j = 1; j < obstacleGrid[0].length; j++) {
        		if (!obstacleGrid[i][j].equals("#")) dp[i][j] = dp[i-1][j]+dp[i][j-1];
        		else dp[i][j] = 0;
        		if (dp[i][j]>mod) dp[i][j]-=mod;
        	}
        }
		return dp[obstacleGrid.length-1][obstacleGrid[0].length-1];
    }
}