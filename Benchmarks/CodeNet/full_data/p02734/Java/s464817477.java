import java.util.*;
import java.io.PrintWriter;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int s=sc.nextInt();
		long mod=998244353;
		long[][][] dp=new long[3][n+1][s+1];
		//0は開始、１は継続、２は終了
		for(int i=1; i<=n; i++){
			int a=sc.nextInt();
			dp[0][i][0]=1;
			if(a<=s){
				dp[0][i][a]=1;
			}
			for(int t=s; t>=0; t--){
				dp[1][i][t]+=dp[0][i-1][t]+dp[1][i-1][t];
				if(t>=a){
					dp[1][i][t]+=dp[0][i-1][t-a]+dp[1][i-1][t-a];
				}
				dp[1][i][t]%=mod;
			}
			dp[2][i][s]=(dp[2][i-1][s]+dp[1][i][s]+((a==s)?1:0))%mod;
		}
		System.out.println(dp[2][n][s]);
	}
}
