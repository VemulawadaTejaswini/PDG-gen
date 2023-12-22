import java.util.Scanner;

public class Main {
	
	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);

		char[] s = in.next().toCharArray();
		char[] t = in.next().toCharArray();
		
		LCS(s,t);
/*
		int n = in.nextInt();
		double[] p = new double[n];	
		for(int l=0;l<n;l++) {
			p[l] = in.nextDouble();
		}
		getProb(p,n);
*/	}
		
	private static void LCS(char[] s, char[] t) {
		// TODO Auto-generated method stub
		int ns = s.length;
		int nt = t.length;
		
		int[][] dp = new int[ns+1][nt+1];
		
		for(int i=0;i<=ns;i++) {
			for(int j=0;j<=nt;j++) {
				if(i==0 || j==0) dp[i][j]=0;
				else if(s[i-1]==t[j-1]) dp[i][j] = 1+dp[i-1][j-1];
				else {
					dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
				}
			}
		}
		printSubArr(s,t,dp,ns,nt);
//		System.out.println(dp[ns][nt]);
	}

	private static void printSubArr(char[] s, char[] t, int[][] dp, int i, int j) {
		if(i<=0 || j<=0) return;
		else {
			if(s[i-1]==t[j-1]) {
				System.out.print(s[i-1]);
				 printSubArr(s, t, dp, i-1, j-1);
			}
			else {
				if(dp[i-1][j]>dp[i][j-1])  printSubArr(s, t, dp, i-1, j);
				else  printSubArr(s, t, dp, i, j-1);
			}
			return;
		}
	}

	private static void getProb(double[] p, int n) {
		double[][] dp = new double[n+1][n+1];
		dp[0][0]=1;
		
		for(int i=1;i<=n;i++) {
			for(int j=0;j<=i;j++) {
				if(j==0) dp[i][j] = dp[i-1][j]*(1-p[i-1]);
				else {
					dp[i][j] = dp[i-1][j-1]*p[i-1] + dp[i-1][j]*(1-p[i-1]);
				}
			}
				
		}
//		print2d(dp);
		double ans=0;
		for(int i=(n+1)/2 ; i<=n;i++) {
			ans+=dp[n][i];
		}
		System.out.println(ans);
		
	}

	public static void print2d(double[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
	}
}