import java.util.*;
import java.io.PrintWriter;
public class Main{
	static long[] a_cum;
	static long[][] dp;
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		dp=new long[n+1][n+1];
		a_cum=new long[n+1];
		for(int i=1; i<=n; i++){
			a_cum[i]=sc.nextLong()+a_cum[i-1];
		}
		System.out.println(f(1,n));
	}
	static long f(int l,int r){
		if(l==r) return 0;
		if(dp[l][r]!=0) return dp[l][r];
		long min=Long.MAX_VALUE;
		for(int i=l; i<r; i++){
			min=Math.min(min,f(l,i)+f(i+1,r));
		}
		return dp[l][r]=min+a_cum[r]-a_cum[l-1];
	}
}