import java.util.Scanner;
import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m=sc.nextInt();
		long mod=1000000007;
		int[] s=new int[n];
		int[] t=new int[n];
		long[][] dp=new long[n+1][m+1];
		for(int i=0; i<n; i++){
			s[i]=sc.nextInt();
		}
		for(int i=0; i<m; i++){
			t[i]=sc.nextInt();
		}
		for(int i=1; i<=n; i++){
			for(int j=1; j<=m; j++){
				if(s[i-1]==t[j-1]){
					dp[i][j]=dp[i-1][j-1]+1+dp[i-1][j-1];
					dp[i][j]%=mod;
				}
				dp[i][j]=Math.max(dp[i][j],Math.max(dp[i-1][j],dp[i][j-1]));
			}
		}
		System.out.println(dp[n][m]+1);
	}
}
