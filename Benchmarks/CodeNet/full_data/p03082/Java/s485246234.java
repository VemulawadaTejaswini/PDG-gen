import java.util.*;

public class Main {
	static final long MOD = 1000000007;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		
		Integer[] S = new Integer[N];
		for(int i=0; i<N; i++)
			S[i] = sc.nextInt();
		Arrays.sort(S, Comparator.reverseOrder());
		
		long[] rev = new long[N+1];
		for(int i=1; i<=N; i++)
			rev[i] = rev(i);
		
		int MAX=Math.max(X, S[0]);
		long[][] dp = new long[N+1][MAX+1];
		dp[0][X]=1;
		for(int i=0; i<N; i++) {
			for(int j=0; j<=MAX; j++) {
				if(dp[i][j]>0) {
					dp[i+1][j%S[i]] += dp[i][j]*rev[N-i];
					dp[i+1][j%S[i]] %= MOD;
					
					dp[i+1][j] += ((dp[i][j]*(N-i-1))%MOD)*rev[N-i];
					dp[i+1][j] %= MOD;
				}
			}
		}
		
		long sum = 0;
		for(int i=0; i<=MAX; i++) {
			sum = (sum + dp[N][i]*i)%MOD;
		}
		for(int i=1; i<=N; i++) {
			sum = (sum*i)%MOD;
		}
		System.out.println(sum);
		sc.close();
	}
	
	static long rev(long a) {
		return pow(a, MOD-2);
	}
	
	static long pow(long a, long b) {
		long ans = 1;
		while(b>0) {
			if((b&1)!=0)
				ans = (ans * a)%MOD;
			b>>=1;
			a = (a*a)%MOD;
		}
		return ans;
	}

}
