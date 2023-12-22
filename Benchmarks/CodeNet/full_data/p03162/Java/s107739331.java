import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int[][] data = new int[N][3]; 
		for (int i = 0; i < N; i++) {
			data[i][0]=input.nextInt();
			data[i][1]=input.nextInt();
			data[i][2]=input.nextInt();
		}
		System.out.println(MAX(data));
	}
	public static long MAX(int[][] test) {
		if (test.length==1) return Math.max(Math.max(test[0][0],test[0][1]), test[0][2]);
		long[] dp = new long[test.length];
		int curIndex=0;
		dp[0]=Math.max(Math.max(test[0][0], test[0][1]), test[0][2]);
		if (dp[0]==test[0][1]) curIndex=1;
		if (dp[0]==test[0][2]) curIndex=2;
		for (int i = 1; i < dp.length-1; i++) {
			int a = 0;
			int b = 1;
			if (curIndex==0) {
				a=1; b=2;
			}
			else if (curIndex==1) {
				a=0; b=2;
			}
			dp[i]=Math.max(test[i][a], test[i][b]);
			if (test[i][a]==test[i][b]) {
				if (test[i+1][a]>test[i+1][b]) curIndex=b;
				else curIndex=a;
			}else {
				if (dp[i]==test[i][0]) curIndex=0;
				else if (dp[i]==test[i][1]) curIndex=1;
				else if (dp[i]==test[i][2]) curIndex=2;
			}
			dp[i]+=dp[i-1];
			//System.out.println(dp[i]);
		}
		dp[test.length-1]+=dp[test.length-2];
		if (curIndex==0) dp[test.length-1]+=Math.max(test[test.length-1][1], test[test.length-1][2]);
		if (curIndex==1) dp[test.length-1]+=Math.max(test[test.length-1][0], test[test.length-1][2]);
		if (curIndex==2) dp[test.length-1]+=Math.max(test[test.length-1][0], test[test.length-1][1]);
		return dp[test.length-1];
	}
}