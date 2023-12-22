import java.util.Arrays;
import java.util.Scanner;

public class Main {
	final static long MOD = 1000000007;
	static long solveSmallDP(int N , int K){
		long dp[] = new long[N + 1];
		for(int i = 1 ; i <= N ; ++i){
			dp[i] = 1;			
		}
		for(int k = 0 ; k < K - 1; ++k){
//			System.out.println(k);
			long next[] = new long[N + 1];
			for(int i = 1 ; i <= N ; ++i){
				long S = 0;
				for(int j = 1  ; i * j <= N ; ++j){
					S = (S + dp[j]) % MOD;
				}
				next[i] = S;
			}
			dp = next;
		}
//		System.out.println(Arrays.toString(dp));		
		long S = 0;
		for(long d : dp){
			S = (S + d) % MOD;
		}
		return S;
	}
	public static void main(String[] args) {
		//
		// dp[k][i] = dp[k - 1][
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		if(N <= 100000){
			System.out.println(solveSmallDP(N, K));
			return ;
		}
		// dp[10] = dp[1]
		// dp[5]  = dp[1] + dp[2]
		// dp[4]  = dp[1] + dp[2]
		// dp[3]  = dp[1] + dp[2] + dp[3]
		// dp[2]  = dp[1] + ... + dp[3] + dp[4] * 2
		// dp[1]  = dp[1] + dp[2] + dp[3] + dp[4] * 2 + dp[5] * 5
		// (50001 .. 100000 ) dp2[1] = dp1[1]
		// (33334 .. 50000) dp2[2] = dp1[1] + dp1[2]
		// (25001 .. 33333) dp2[3] = dp1[1] + dp1[2] + dp1[3]
		// (20001 .. 25000) dp2[4] = dp1[1] + dp1[2] + dp1[3] + dp1[4]
		// ..
		// (991 .. 1000) dp2[100] = dp1[1] + ... + dp1[100]
		// dp1[990] = S + dp1[101]
		// dp1[989] = S + dp1[101] 		
		// dp1[988] = 
		int M = 1000;		
		int L = N / (M + 1);
		long dp1[] = new long[L + 1];
		long dp2[] = new long[M + 1];
		Arrays.fill(dp1, 1);
		Arrays.fill(dp2, 1);
		for(int k = 0 ; k < K - 1; ++k){
			long next1[] = new long[dp1.length];
			long next2[] = new long[dp2.length];
			long S = 0;
			for(int t = 1 ; t < dp2.length ; ++t){
				S = (S + dp1[t] ) % MOD;
				next2[t] = S;
			}
			int T = M + 1;
//			System.out.println(T +" "+ M + " "+L +" "+N+" "+(L * T));
			for(int i = dp1.length - 1; i >= 1 ; --i){
				while(i * T <= N){
					if(T < dp1.length){
						S = (S + dp1[T]) % MOD;
						T++;						
					}else{
						int len = N / i - (N / (i + 1));
						S = (S + dp2[i] * len) % MOD;
						break;
					}
				}
				next1[i] = S;
			}
			dp1 = next1;
			dp2 = next2;
		}
//		System.out.println(Arrays.toString(dp1));	
//		System.out.println(Arrays.toString(dp2));	

		long S = 0;
		for(long d : dp1){
			S = (S + d) % MOD;
		}
		// 10000 - 5000 [5001..10000]
		// 10001 - 5000 [5000..10001]
		for(int i = 1 ; i < dp2.length ; ++i){
			int len = N / i - (N / (i + 1));
			S = (S + dp2[i] * len) % MOD;
		}
		System.out.println(S);
	}
}
