import java.util.*;

public class Main {
	final static long MOD = 1000000007;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.next().length();

		long[][] dp1 = new long[N+1][N+1];
		dp1[0][0] = 1;
		for(int i=0; i<N; i++) {
			for(int j=0; j<=i; j++) {
				dp1[i+1][j+1] = (dp1[i+1][j+1] + dp1[i][j]*2)%MOD;
				dp1[i+1][Math.max(0, j-1)] = (dp1[i+1][Math.max(0, j-1)] + dp1[i][j])%MOD;
			}
		}
		
		long[][] dp2 = new long[N+1][N+1];
		dp2[0][0] = 1;
		for(int i=0; i<N; i++) {
			for(int j=0; j<=i; j++) {
				dp2[i+1][j+1] = (dp2[i+1][j+1] + dp2[i][j])%MOD;
				if(j-1>0)
					dp2[i+1][j-1] = (dp2[i+1][j-1] + dp2[i][j])%MOD;
			}
		}
		long ans = 0;
		for(int i=0; i<N; i++) {
			long temp = dp1[i][0];
			temp = (temp * dp2[N-i][M])%MOD;
			for(int j=0; j<(N-i-M)/2; j++)
				temp = (temp*2)%MOD;
			ans = (ans + temp)%MOD;
		}

		System.out.println(ans);
		
		sc.close();
	}
	
}
