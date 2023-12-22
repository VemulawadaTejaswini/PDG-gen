import java.util.*;

public class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		int h=s.nextInt();

		int[]dp=new int[h+1];
		Arrays.fill(dp,1,h+1,Integer.MAX_VALUE/2);

		for(int n=s.nextInt();n>0;--n) {
			int d=s.nextInt();
			int m=s.nextInt();
			for(int i=0;i<h;++i) {
				int t=Math.min(h,i+d);
				dp[t]=Math.min(dp[t],dp[i]+m);
			}
		}

		System.out.println(dp[h]);
	}
}
