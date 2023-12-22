import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int h=in.nextInt();
		int w=in.nextInt();
		String[] G=new String[h];
		int[][] dp=new int[h][w];
		int mod=1000000007;
		for (int i=0;i<h;++i)
			G[i]=in.next();
		if (G[0].charAt(0)=='.') dp[0][0]=1;
		for (int i=0;i<h;++i)
			for (int j=0;j<w;++j) if (i>0||j>0) {
				if (G[i].charAt(j)=='#') continue;
				if (i>0) dp[i][j]+=dp[i-1][j];
				if (dp[i][j]>=mod) dp[i][j]-=mod;
				if (j>0) dp[i][j]+=dp[i][j-1];
				if (dp[i][j]>=mod) dp[i][j]-=mod;
			}
		System.out.println(dp[h-1][w-1]);
	}
}