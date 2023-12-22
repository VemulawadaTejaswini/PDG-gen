import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		char[][] maze = new char[H][W];
		int[][] dp = new int[H][W];
			
		for(int i=0; i<H; i++) 
			maze[i] = sc.next().toCharArray();			
		
		if(maze[0][0] == '#') dp[0][0] =1;

		for(int i=1; i<W; i++) {
			dp[0][i] = dp[0][i-1];
			if (maze[0][i-1] == '.' && maze[0][i] == '#') {
				dp[0][i]++;
			}
		}
		for(int i=1; i<H; i++) {
			dp[i][0] = dp[i-1][0];
			if(maze[i-1][0] == '.' && maze[i][i-1]  == '#') {
				dp[i][0]++;
			}
		}
		for(int i=1; i<H; i++) {
			for(int j=1; j<W; j++) {
		          if(maze[i][j] == '.') {
		              dp[i][j] = min(dp[i-1][j], dp[i][j-1]);
		            } else {
		              int up = dp[i-1][j];
		              if(maze[i-1][j] == '.')
		                up++;
		              int left = dp[i][j-1];
		              if(maze[i][j-1] == '.')
		                left++;
		              dp[i][j] = Math.min(up, left);
		            }
			}
		}	
out.println(dp[H-1][W-1]);	
	}
}