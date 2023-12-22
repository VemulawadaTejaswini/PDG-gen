import java.util.*;
import java.io.PrintWriter;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long[][] dp=new long[n+1][10002];
		Arrays.fill(dp[0],-1);
		dp[0][0]=0;
		int[][] wsv=new int[n][3];
		for(int i=1; i<=n; i++){
			wsv[i-1][0]=sc.nextInt();
			wsv[i-1][1]=sc.nextInt();
			wsv[i-1][2]=sc.nextInt();
		}
		Arrays.sort(wsv,(x,y)->(x[1]-y[1]));
		for(int i=1; i<=n; i++){
			for(int j=10001; j>=0; j--){
				dp[i][j]=dp[i-1][j];
				if(j<=wsv[i-1][1] && dp[i-1][j]!=-1){
					dp[i][Math.min(10001,j+wsv[i-1][0])]=Math.max(dp[i][Math.min(10001,j+wsv[i-1][0])],wsv[i-1][2]+dp[i-1][j]);
				}
			}
		}
		long ans=0;
		for(int i=0; i<10002; i++){
			ans=Math.max(ans,dp[n][i]);
		}
		System.out.println(ans);
	}
}
