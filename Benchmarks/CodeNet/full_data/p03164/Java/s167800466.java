import java.util.Scanner;

class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt(),W=sc.nextInt(),i,w[] = new int[N],v[]=new int[N];
		for(i=0;i<N;i++) {
			w[i]=sc.nextInt();
			v[i]=sc.nextInt();
		}
		long[][] dp=new long[N+1][W+1];
		for(i=0;i<=W;i++) dp[0][i]=0;
		for(int wei=1;wei<=W;wei++) {
			for(i=0;i<N;i++) {
				if(wei>=w[i]) {
					dp[i+1][wei]=Math.max(dp[i][wei-w[i]]+v[i], dp[i][wei]);
				}else {
					dp[i+1][wei]=dp[i][wei];
				}
			}
		}
		System.out.println(dp[N][W]);
	}
}
