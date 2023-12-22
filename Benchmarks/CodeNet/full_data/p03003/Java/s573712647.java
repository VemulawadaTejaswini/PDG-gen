import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[] s=new int[n];
		int[] t=new int[m];
		long[][] dp=new long[n+1][m+1];
		long[][] sum=new long[n+1][m+1];
		long mod=1000000007;
		for(int i=0; i<n; i++){
			s[i]=sc.nextInt();
		}
		for(int i=0; i<m; i++){
			t[i] =sc.nextInt();
		}
		for(int i=1; i<=n; i++){
			for(int j=1; j<=m; j++){
				if(s[i-1]==t[j-1]){
					dp[i][j]=1L+sum[i-1][j-1];
					dp[i][j]%=mod;
				}
				sum[i][j]=((sum[i-1][j]-sum[i-1][j-1]+sum[i][j-1])%mod)+dp[i][j];
				sum[i][j]%=mod;
			}
		}
		System.out.println((sum[n][m]+1L)%mod);
	}
}


