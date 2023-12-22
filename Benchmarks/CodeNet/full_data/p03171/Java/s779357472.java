import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a[] = new int[N];
		for(int i=0;i<N;i++) a[i]=sc.nextInt();
		sc.close();
		
		long dp[][] = new long[N+1][N+1];
		for(int i=0;i<N;i++) dp[i][i]=0;
		
		for(int len = 1;len<=N;len++) {
			for(int i=0;i+len<=N;i++) {
				int j=i+len;
				
				//先手番 //N-lenは操作回数を表す。
				if((N-len)%2==0) {
					dp[i][j] = Math.max(dp[i+1][j]+a[i], dp[i][j-1]+a[j-1]);
				}
				else {
					dp[i][j] = Math.min(dp[i+1][j]-a[i], dp[i][j-1]-a[j-1]);
				}
			}
		}
		System.out.println(dp[0][N]);
	}
}
