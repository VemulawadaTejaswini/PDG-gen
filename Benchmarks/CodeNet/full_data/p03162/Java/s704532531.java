import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	static Scanner sc =new Scanner(System.in);
	public static void main(String[] args) {
		
		int N=sc.nextInt();
		//int k=sc.nextInt();
		int a[][]=new int[N][3];
		for(int i=0;i<N;i++)
			for(int j=0;j<3;j++)a[i][j]=sc.nextInt();

		
		int dp[]=new int[N+1];
		dp[0]=0;
		dp[1]=Math.max(a[0][0],a[0][1]);
		dp[1]=Math.max(dp[1],a[0][2]);
		int key=0;
		for(int i=0;i<3;i++) {if(dp[1]==a[0][i]) {key=i; break;}}
		
		
		int f=0;
		if(N==1)System.out.println(dp[1]);
		else {
		
		for(int i=2;i<N+1;i++) {
			if(key==2) {
				f=Math.max(a[i-1][0],a[i-1][1]);
				dp[i]=dp[i-1]+f;
				}
			else if(key==1) {
				f=Math.max(a[i-1][0],a[i-1][2]);
				dp[i]=dp[i-1]+f;}
			else if(key==0) {
				f=Math.max(a[i-1][2],a[i-1][1]);
				dp[i]=dp[i-1]+f;

			}
			for(int j=0;j<3;j++) {if(f==a[i-1][j]) {key=j;break;}}

		}
		System.out.println(dp[N]);
	}
		
}
	}
