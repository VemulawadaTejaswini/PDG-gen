import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), M = sc.nextInt();
		int S[] = new int[N];
		int T[] = new int[M];
		for(int i=0;i<N;i++)S[i]=sc.nextInt();
		for(int i=0;i<M;i++)T[i]=sc.nextInt();
		sc.close();
		
		int mod = (int)1e9+7;
		long dp[][] = new long[N+1][M+1];
		long sum[][] = new long[N+2][M+2];
		dp[0][0]=1;sum[1][1]=1;
		for(int i=0;i<=N;i++) {
			for(int j=0;j<=M;j++) {
				if(i==0&&j==0)continue;
				if(i>0&&j>0&&S[i-1]==T[j-1]) dp[i][j] = sum[i][j];					
				sum[i+1][j+1] = (sum[i][j+1]+sum[i+1][j]-sum[i][j]+dp[i][j] )%mod;
			}
		}
		long ans = sum[N+1][M+1];
		System.out.println(ans);
	}
}