import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] S = sc.next().toCharArray();
		int N = S.length;

		long[][] dp = new long[N+1][13];
		long MOD = 1000000007;
		
		int rem = 1;
		dp[0][0] = 1;
		for(int i=0; i<N; i++) {
			if(i>0)
				rem = (rem*10)%13;
			for(int j=0; j<13; j++) {
				if(S[N-i-1]=='?') {
					for(int k=0; k<10; k++) {
						int l = (j+rem*k)%13;
						dp[i+1][l] = (dp[i+1][l] + dp[i][j]) % MOD;
					}
				} else {
					int l = (j+rem*(S[N-i-1]-'0'))%13;
					dp[i+1][l] = (dp[i+1][l] + dp[i][j]) % MOD;
				}
			}
		}
		
		System.out.println(dp[N][5]);
		
		sc.close();
	}
}