import java.util.*;
import java.lang.*;
import java.io.*;
public class main{
	static int[][]dp=new int[10001][10001];
	static int solve(int[][]arr,int n){
		dp[1][0]=arr[1][0];
		dp[1][1]=arr[1][1];
		dp[1][2]=arr[1][2];

		for(int i=2;i<=n;i++){
			dp[i][0]=arr[i][0]+Math.max(dp[i-1][1],dp[i-1][2]);
			dp[i][1]=arr[i][1]+Math.max(dp[i-1][0],dp[i-1][2]);
			dp[i][2]=arr[i][2]+Math.max(dp[i-1][0],dp[i-1][1]);
		}
		return Math.max(dp[n][0],Math.max(dp[n][1],dp[n][2]));
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[][]arr=new int[n+1][3];
		for(int i=1;i<=n;i++){
			for(int j=0;j<=2;j++){
				arr[i][j]=in.nextInt();
			}
		}	
		System.out.println(solve(arr,n));
	}
}
