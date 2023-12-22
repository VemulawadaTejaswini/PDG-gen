import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a=sc.nextInt();
		int[] x=new int[n];
		for(int i=0; i<n; i++){
			x[i]=sc.nextInt();
		}
		long[][][] dp=new long[n][2501][n+1];
		dp[0][x[0]][1]=1;
		long ans=0;
		for(int i=1; i<n; i++){
			dp[i][x[i]][1]=1;
			for(int j=0; j<=50*i; j++){
				for(int k=1; k<=n; k++){
					dp[i][j+x[i]][k]+=dp[i-1][j][k-1];
					dp[i][j][k]+=dp[i-1][j][k];
				}
			}
		}
		for(int i=1; i<=n; i++){
			ans+=dp[n-1][a*i][i];
		}
		System.out.println(ans);
	}
}
