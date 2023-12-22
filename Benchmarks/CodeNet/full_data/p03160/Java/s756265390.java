import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){


			int N = scan.nextInt();
			int[]h = new int[N];
			for(int i = 0;i<N;i++)h[i] =scan.nextInt();

			long[]dp = new long[N+2];

			for(int i = 1;i<N;i++) {
				if(i==1) {
					int a =  Math.abs(h[i]-h[i-1]);
					dp[i] = dp[i-1]+a;

				}else {
				int a =  Math.abs(h[i]-h[i-1]);
				int b =  Math.abs(h[i]-h[i-2]);

				if(dp[i-1]+a>dp[i-2]+b) {
					dp[i] = dp[i-2]+b;
				}else {
					dp[i] = dp[i-1]+a;
				}
				}
			}

			System.out.println(dp[N-1]);

		}


	}


}
