import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);

		int n=s.nextInt();
		int[][] arr=new int[n][3];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<3;j++) {
				arr[i][j]=s.nextInt();
			}
		}
		
		int[][] dp=new int[n][3];
		dp[0][0]=arr[0][0];
		dp[0][1]=arr[0][1];
		dp[0][2]=arr[0][2];
		
		for(int i=1;i<n;i++) {
			for(int j=0;j<3;j++) {
				if(j==0) {
					dp[i][j]=Math.max(dp[i-1][1], dp[i-1][2])+arr[i][j];
				}else if(j==1) {
					dp[i][j]=Math.max(dp[i-1][0], dp[i-1][2])+arr[i][j];
				}else {
					dp[i][j]=Math.max(dp[i-1][0], dp[i-1][1])+arr[i][j];
				}
			}
		}
		
		
		int h=Math.max(dp[n-1][0], dp[n-1][1]);
		System.out.println(Math.max(h, dp[n-1][2]));
				
	}
}