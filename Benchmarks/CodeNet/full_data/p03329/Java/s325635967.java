import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		int N=sc.nextInt();

		int[] dp=new int[N+1];
		int INF=100001;

		for(int i=0;i<N+1;i++) dp[i]=INF;

		dp[0]=0;

		int n6=6;
		int n9=9;

		double cnt6=2.0;
		double cnt9=2.0;

		for(int i=1;i<N+1;i++) {

			dp[i]=Math.min(dp[i], dp[i-1]+1);

			if(i==Math.pow(6, cnt6)) {
				n6=(int)Math.pow(6, cnt6);
				cnt6++;
			}

			if(i==Math.pow(9, cnt9)) {
				n9=(int)Math.pow(9, cnt9);
				cnt9++;
			}

			if(i>6)	dp[i]=Math.min(dp[i], dp[i-n6]+1);
			if(i>9) dp[i]=Math.min(dp[i], dp[i-n9]+1);


			//System.out.println(i+" "+dp[i]);
		}

		System.out.println(dp[N]);

		sc.close();
	}
}
