
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int H=sc.nextInt();
		int W=sc.nextInt();
		int K=sc.nextInt();

		long dp[][] = new long[H+1][W];
		dp[0][0]=1;

		int MOD = 1000000007;
		for(int i=0; i<H; i++) {
			for(int j=0; j<W; j++) {
				for(int k=0; k<(1<<W-1); k++) {
					boolean ok = true;
					for(int l=0; l<(1<<W-2); l++) {
						if(((k>>l)&1)==1 && ((k>>(l+1))&1)==1){
							ok=false;
						}
					}
					if(ok) {
						if(j>0 && ((k>>(j-1))&1) == 1) {
							dp[i+1][j-1] += dp[i][j];
							dp[i+1][j-1] %= MOD;
						}
						else if(j<W-1 && ((k>>j)&1)==1){
							dp[i+1][j+1] += dp[i][j];
							dp[i+1][j+1] %= MOD;
						}else {
							dp[i+1][j] += dp[i][j];
							dp[i+1][j] %= MOD;
						}
					}

				}
			}
		}
		System.out.println(dp[H][K-1]);
		sc.close();
	}

}
