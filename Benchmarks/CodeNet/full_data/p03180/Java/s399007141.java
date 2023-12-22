import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[][] a=new int[n][n];
		for (int i=0;i<n;++i)
			for (int j=0;j<n;++j)
				a[i][j]=in.nextInt();
		long[] dp=new long[1<<n];
		long[] val=new long[1<<n];
		for (int i=0;i<1<<n;++i)
			for (int j=0;j<n;++j) if ((i>>j&1)>0)
				for (int k=j+1;k<n;++k) if ((i>>k&1)>0)
					val[i]+=a[j][k];
		for (int i=0;i<1<<n;++i) {
			int s=i;
			do {
				dp[i]=Math.max(dp[i],dp[i^s]+val[s]);
				s=i&(s-1);
			} while (s>0);
		}
		System.out.println(dp[(1<<n)-1]);
	}
}