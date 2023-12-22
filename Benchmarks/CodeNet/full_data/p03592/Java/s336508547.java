import java.util.*;
import java.io.*;

public class Main{

	public static void main(String[] args){
		solve();
	}

	public static void solve(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		int[][] dp = new int[m+1][n*m+1];
		for(int i=0;i<m+1;i++){
			Arrays.fill(dp[i],-1);
		}
		dp[0][0] = 0;
		for(int i=1;i<=n;i++){
			dp[0][i*m] = i;
		}
		for(int i=1;i<=m;i++){
			//System.out.println(i);
			for(int j=n*m;j>=0;j--){
				if(dp[i-1][j]!=-1 && j+n-2*dp[i-1][j]<=n*m){
					dp[i][j+n-2*dp[i-1][j]] = dp[i-1][j];
				}
			}
		}
		/*for(int i=0;i<m+1;i++){
			for(int j=0;j<=n*m;j++){
				System.out.print(dp[i][j]+" ");
			}
			System.out.println();
		}*/
		boolean flag = false;
		for(int i=0;i<m+1;i++){
			if(dp[i][k]!=-1){
				flag = true;
			}
		}
		if(flag){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}
}

