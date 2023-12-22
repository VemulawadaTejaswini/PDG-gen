import java.util.Scanner;

class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt(),i, a[] = new int[N],b[]=new int[N],c[]=new int[N];
		for(i=0;i<N;i++) {
			a[i]=sc.nextInt();
			b[i]=sc.nextInt();
			c[i]=sc.nextInt();
		}
		int dp[][]=new int[N+1][3];//dp[日にち][活動]0:a, 1:b, 2:c
		for(i=0;i<3;i++) dp[0][i]=0;
		for (int date = 0; date < N; date++) {
			dp[date + 1][2] = Math.max(dp[date][0] + a[date], dp[date][1] + b[date]);
			dp[date + 1][1] = Math.max(dp[date][0] + a[date], dp[date][2] + c[date]);
			dp[date + 1][0] = Math.max(dp[date][2] + c[date], dp[date][1] + b[date]);
		}
		System.out.println(Math.max(Math.max(dp[N][0], dp[N][1]),dp[N][2]));
	}
}