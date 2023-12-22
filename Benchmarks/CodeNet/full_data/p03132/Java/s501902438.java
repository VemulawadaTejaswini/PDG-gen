import java.util.*;
public class Main {
	public static long value(int x,int j) {
		if (j==0||j==4) return x;
		if (j==2) return (x+1)%2;
		if (x==0) return 2;
		return x%2;
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int L=in.nextInt();
		int[] A=new int[L+1];
		for (int i=1;i<=L;++i)
			A[i]=in.nextInt();
		long[][] dp=new long[L+1][5];
		for (int i=1;i<=L;++i)
			for (int j=0;j<5;++j)
				dp[i][j]=Long.MAX_VALUE;
		for (int i=0;i<L;++i)
			for (int j=0;j<5;++j) if (dp[i][j]!=Long.MAX_VALUE) {
				if (j+1<5) dp[i][j+1]=Math.min(dp[i][j+1],dp[i][j]);
				dp[i+1][j]=Math.min(dp[i+1][j],dp[i][j]+value(A[i+1],j));
			}
		long res=Long.MAX_VALUE;
		for (int i=0;i<5;++i) res=Math.min(res,dp[L][i]);
		System.out.println(res);
	}
}