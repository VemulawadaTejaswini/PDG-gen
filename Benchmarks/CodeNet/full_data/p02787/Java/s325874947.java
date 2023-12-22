import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int h=sc.nextInt();
		int n=sc.nextInt();
		int[] a=new int[n];
		int[] b=new int[n];
		for(int i=0; i<n; i++){
			a[i]=sc.nextInt();
			b[i]=sc.nextInt();
		}
		long[][] dp=new long[n+1][h+10000];
		Arrays.fill(dp[0],100000001);
		dp[0][0]=0;
		for(int i=1; i<=n; i++){
			for(int j=0; j<h+10000; j++){
				if(j>=a[i-1] && dp[i][j-a[i-1]]!=100000001){
					dp[i][j]=Math.min(dp[i-1][j],dp[i][j-a[i-1]]+b[i-1]);
				}else{
					dp[i][j]=dp[i-1][j];
				}
			}
		}
		long ans=100000001;
		for(int i=h; i<h+10000; i++){
			ans=Math.min(ans,dp[n][i]);
		}
		System.out.println(ans);
	}
}
