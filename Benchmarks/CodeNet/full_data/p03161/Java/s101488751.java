import java.util.*;

public class Main {
	static int n,k;
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		k=scan.nextInt();
		a=new int[n];
		for(int i=0;i<n;i++) a[i]=scan.nextInt();
		dp=new int[n];
		Arrays.fill(dp,-1);
		System.out.println(go(0));
	}
	static int[] dp;
	static int[] a;
	
	public static int go(int at) {
		if(at==a.length-1) return 0;
		if(dp[at]!=-1) return dp[at];
		int res=Integer.MAX_VALUE/2-5;
		for(int nxt=at+1;nxt<a.length&&nxt<=at+k;nxt++) {
			res=Math.min(res,Math.abs(a[at]-a[nxt])+go(nxt));
		}
		return dp[at]=res;
	}
}