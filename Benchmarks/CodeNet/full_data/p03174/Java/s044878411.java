import java.util.*;
import java.io.PrintWriter;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long mod=1000000007;
		long[] dp=new long[1<<n];
		boolean[][] a=new boolean[n][n];
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				int tmp=sc.nextInt();
				if(tmp==1){
					a[i][j]=true;
				}
			}
		}
		dp[0]=1;
		for(int i=1; i<1<<n; i++){
			for(int j=0; j<n; j++){
				if(((i>>j & 1)==1) && a[Integer.bitCount(i)-1][n-1-j]){
					dp[i]=(dp[i]+dp[i^(1<<j)])%mod;
				}
			}
		}
		System.out.println(dp[(1<<n)-1]);
	}
}