import java.util.Scanner;

public class Main{
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){

			int N = scan.nextInt();
			int W = scan.nextInt();

			int[][]dp = new int[N+1][100010];

			//dp[0][0] = 0;

			int[]w = new int[N+1];
			int[]v = new int[N+1];
			int sum = 0;

			for(int i = 1;i<=N;i++) {
				w[i] = scan.nextInt();
				v[i] = scan.nextInt();
				sum+=v[i];
			}


				for(int j = 1;j<=sum;j++) {
					dp[0][j] = 1000000000;
				}





				for(int j = 1;j<=N;j++) {
					for(int i = 0;i<=sum;i++) {
					if(i-v[j]>=0) {
						dp[j][i] = Math.min(dp[j-1][i-v[j]]+w[j], dp[j-1][i]);
					}else {
						dp[j][i] = dp[j-1][i];
					}
				}
			}


			for(int i = sum;i>=0;i--) {
				//System.out.println(dp[N][i]);

				if(dp[N][i]<=W) {
					System.out.println(i);
					break;
				}
			}

		}


	}


}
