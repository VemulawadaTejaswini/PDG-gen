import java.util.*;
import java.io.PrintWriter;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		long mod=1000000007;
		long[][] dp=new long[n+1][k+1];
		Arrays.fill(dp[0],1);
		for(int i=1; i<=n; i++){
			int a=sc.nextInt();
			dp[i][0]=dp[i-1][0];
			for(int j=1; j<=k; j++){
				dp[i][j]=dp[i-1][j]+dp[i][j-1];
				if(j-a-1>=0){
					dp[i][j]-=dp[i-1][j-a-1];
				}
				dp[i][j]=(dp[i][j]+mod)%mod;
			}
		}
		if(k==0){
			System.out.println(1);
		}else{
			System.out.println((dp[n][k]-dp[n][k-1]+mod)%mod);
		}
	}
}