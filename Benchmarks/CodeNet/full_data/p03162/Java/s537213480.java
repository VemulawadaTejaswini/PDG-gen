import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){

			int N = scan.nextInt();

			long[]a = new long[N];
			long[]b = new long[N];
			long[]c = new long[N];

			long[][]dp = new long[N][3];

			for(int i = 0;i<N;i++) {
				a[i] = scan.nextLong();
				b[i] = scan.nextLong();
				c[i] = scan.nextLong();
			}

			dp[0][0] = a[0];
			dp[0][1] = b[0];
			dp[0][2] = c[0];

			for(int i = 1;i<N;i++) {
				for(int j = 0;j<3;j++) {
					if(j==0) {
						dp[i][0] = Math.max(dp[i-1][1]+a[i],dp[i-1][2]+a[i]);
					}else if(j==1) {
						dp[i][1] = Math.max(dp[i-1][2]+b[i],dp[i-1][0]+b[i]);
					}else {
						dp[i][2] = Math.max(dp[i-1][0]+c[i],dp[i-1][1]+c[i]);
					}

				}

			}


			System.out.println(Math.max(dp[N-1][0], Math.max(dp[N-1][1], dp[N-1][2])));





		}


	}


}
