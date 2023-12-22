import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[][] dp = new int[2][n];

		for(int i=0;i<n;i++) {
			if(i==0) {
				dp[0][0]=sc.nextInt();
			} else {
				dp[0][i]=sc.nextInt()+dp[0][i-1];
			}
		}

		for(int i=0;i<n;i++) {
			if(i==0) {
				dp[1][0]=sc.nextInt()+dp[0][0];
			} else {
				dp[1][i]=sc.nextInt()+Math.max(dp[0][i],dp[1][i-1]);
			}
		}
		System.out.println(dp[1][n-1]);
	}

}
