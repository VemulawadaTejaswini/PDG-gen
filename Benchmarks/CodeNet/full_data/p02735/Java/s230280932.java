import java.lang.Math;
import java.io.*;
import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int[][] grid = new int[h][w];
		for(int i=0;i<h;++i){
			String s = sc.next();
			for(int j=0;j<w;++j){
				if (s.charAt(j) == '.')
					grid[i][j] = 0;
				else
					grid[i][j] = 1;
			}
		}

		int n = grid.length;
        int m = grid[0].length;
        int[][] dp = new int[n][m];
        dp[0][0] = grid[0][0];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if ((i==0)&&(j==0)) continue;
                else if (j==0)
                    dp[i][j] = dp[i-1][j] + grid[i][j];
                else if (i==0)
                    dp[i][j] = dp[i][j-1] + grid[i][j];
                else
                    dp[i][j] = Math.min(dp[i-1][j],dp[i][j-1])+grid[i][j];
            }
        }
        System.out.println(dp[n-1][m-1]);
	}
}