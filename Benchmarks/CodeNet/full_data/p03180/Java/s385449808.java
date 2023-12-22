import java.util.*;
import java.io.PrintWriter;
public class Main{
	static long[] dp;
	static int[][] a;
	static int n;
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		dp=new long[1<<n];
		Arrays.fill(dp,-1);
		a=new int[n][n];
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println(dfs((1<<n)-1));
	}
	static long dfs(int bit){
		if(dp[bit]!=-1){
			return dp[bit];
		}
		long re=0;
		for(int i=0; i<n; i++){
			for(int j=i+1; j<n; j++){
				if((1&bit>>i)==1 && (1&bit>>j)==1){
					re+=a[i][j];
				}
			}
		}
		for(int i=(bit-1)&bit; i>0; i=(i-1)&bit){
			re=Math.max(re,dfs(i)+dfs(bit^i));
		}
		return dp[bit]=re;
	}
}
