import java.util.Scanner;

class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt(),i, h[] = new int[N],K=sc.nextInt();
		for(i=0;i<N;i++)h[i]=sc.nextInt();
		int dp[]=new int[N+1];
		dp[0]=0;
		for(i=1;i<N;i++) {
			dp[i]=dp[i-1]+Math.abs(h[i]-h[i-1]);
			for(int k=1;k<=Math.min(K, i);k++) {
				dp[i]=Math.min(dp[i-k]+Math.abs(h[i]-h[i-k]), dp[i]);
			}
		}
		System.out.println(dp[N-1]);
	}
}