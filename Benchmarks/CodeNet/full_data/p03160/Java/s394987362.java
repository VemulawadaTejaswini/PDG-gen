import java.util.*;
public class Main{

	public static void main(String[]args){
		Scanner scan  = new Scanner(System.in);
		int n = scan.nextInt();
		int[] h = new int[n+1];
		for(int i=1;i<=n;i++){
			h[i] = scan.nextInt();
		}
		int[] dp = new int[n+1];
		Arrays.fill(dp,-1);
		jump(1,n,h,dp);
		System.out.println(dp[1]);
	}
	public static int jump(int i,int n,int []h,int[] dp){
//		System.out.println("start "+i);
		if(i==n) return 0;
		if(i>n) return (int)1e5;
		if(dp[i]!=-1)return dp[i];
		int k = 100005;
		int g = 100005;
		if(i+1<=n){
			k = Math.abs(h[i+1]-h[i])+jump(i+1,n,h,dp);
			//System.out.println("k= "+k+" "+i+"->"+(i+1));
		}
		if(i+2<=n){
			g = Math.abs(h[i+2]-h[i])+jump(i+2,n,h,dp);
			//System.out.println("g= "+g+" "+i+"->"+(i+2));
		}
		dp[i]=Math.min(k,g);
		return dp[i];

	}
}
