import java.util.*;
import java.util.function.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int H = s.nextInt();
		int W = s.nextInt();
		char[][] maze = new char[H + 1][W + 1];
		for(int i = 0; i < H; i++) {
			maze[i] = s.next().toCharArray();
		}
		
		long[][] dp = new long[H + 1][W + 1];
		
		dp[0][0] = maze[0][0] == '.' ? 0 : 1;
		
		for(int i = 1; i < W; i++) {
			dp[0][i] = dp[0][i - 1] + (maze[0][i] == '.' ? 0 : 1);
		}
		for(int j = 1; j < H; j++) {
			dp[j][0] = dp[j - 1][0] + (maze[j][0] == '.' ? 0 : 1);
		}
		
		for(int i = 1; i < H; i++) {
			for(int j = 1; j < W; j++) {
				dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + (maze[i][j] == '.' ? 0 : 1);
			}
		}
		
		System.out.println(dp[H-1][W-1]);
    }
}
