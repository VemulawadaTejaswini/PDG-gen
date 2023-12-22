import java.util.*;

public class Main{
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int h = input.nextInt();
		int w = input.nextInt();
		char arr[][] = new char[h][w];
		long dp[][] = new long[h][w];
		for(int i=0;i<h;i++) {
			String s = input.next();
			for(int j=0;j<w;j++) {
				arr[i][j] = s.charAt(j);
			}
		}
		dp[0][0] = 1;
		for(int i=1;i<h;i++) {
			dp[i][0] = arr[i][0]=='.'?dp[i-1][0]:0;
		}
		for(int i=1;i<w;i++) {
			dp[0][i] = arr[0][i]=='.'?dp[0][i-1]:0;
		}
		for(int i=1;i<h;i++) {
			for(int j=1;j<w;j++) {
				if(arr[i][j]=='#') {
					dp[i][j] = 0;
 				}
				else {
					dp[i][j] = dp[i-1][j]+dp[i][j-1];
				}
			}
		}
		System.out.println(dp[h-1][w-1]%(1000000007));
	}
}