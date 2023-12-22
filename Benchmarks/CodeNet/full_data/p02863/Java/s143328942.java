import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int t=sc.nextInt();
		int[][] dp=new int[n+1][t+3001];
		int[] a=new int[n];
		int[] b=new int[n];
		for(int i=0; i<n; i++){
			a[i]=sc.nextInt();
			b[i]=sc.nextInt();
		}
		for(int i=1; i<=n; i++){
			for(int j=1; j<=t+3000; j++){
				if(j-a[i-1]>=t){
					break;
				}
				if(j<a[i-1]){
					dp[i][j]=dp[i-1][j];
					continue;
				}
				dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-a[i-1]]+b[i-1]);
			}
		}
		long ans=0;
		for(int i=0; i<=t+3000; i++){
			ans=Math.max(ans,dp[n][i]);
		}
		System.out.println(ans);
	}
}
