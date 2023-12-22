import java.util.*;
import java.io.*;
import java.lang.*;
class Main{
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int K=sc.nextInt();
		int h[]=new int[N];
		for(int i=0;i<N;i++) {
			h[i]=sc.nextInt();
		}
		int dp[]=new int[N];
		dp[0]=0;
		for(int j=1;j<N;j++) {
			dp[j]=Integer.MAX_VALUE;
		}
		for(int k=0;k<N;k++) {
			for(int l=k+1;l<k+K+1;l++) {
				if(l<N) {
					dp[l]=Math.min(dp[l],dp[k]+Math.abs(h[l]-h[k]));
				}
			}
		}
		System.out.println(dp[N-1]);
	}
}