import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[]=new int[n];
		int S=0;
		for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
		S+=a[i];
		}
		int s=S/2;
		boolean dp[][]=new boolean[n+1][s+1];
		dp[0][0]=true;
		for(int i=0;i<n;i++) {
			for(int j=0;j<=s;j++) {
				if(j>=a[i]) {
					dp[i+1][j]=dp[i][j-a[i]]||dp[i][j];
				}
				else {
					dp[i+1][j]=dp[i][j];
				}
			}
		}
		int w=0;
		for(int i=s;s>=0;s--) {
			if(dp[n][i]) {
				w=i;
			break;
			}
		}
		System.out.println(S-w);


	}
}
