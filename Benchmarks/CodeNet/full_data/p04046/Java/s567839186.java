import java.util.Scanner;

public class Main {
	static final int DIV = 1000000000+7;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int H = scanner.nextInt();
		int W = scanner.nextInt();
		int A = scanner.nextInt();
		int B = scanner.nextInt();

		int[][] dp = new int[H][W];

		dp[0][0]=1;
		for(int i=0;i<H;i++) {
			for(int j=0;j<W;j++) {
				if(i==0&&j==0) continue;
				if(H-A<=i&&B-1>=j) {
					dp[i][j]=0;
				}
				else if(i==0) {
					dp[i][j]= dp[i][j-1];
				}
				else if(j==0) {
					dp[i][j]= dp[i-1][j];
				}
				else {
					dp[i][j] = (dp[i-1][j]+dp[i][j-1])%DIV;
				}
			}
		}
		System.out.println(dp[H-1][W-1]);
		scanner.close();
	}

}
