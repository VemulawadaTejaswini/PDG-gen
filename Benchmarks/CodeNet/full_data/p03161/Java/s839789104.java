import java.util.*;
public class Main{

	public static void main(String[]args){
		Scanner scan  = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int[] h = new int[n+1];
		for(int i=1;i<=n;i++){
			h[i] = scan.nextInt();
		}
		int[] dp = new int[n+1];
		Arrays.fill(dp,-1);
		int min = (int)1e5+5; 
		jump(1,n,h,dp,min,k);
		System.out.println(dp[1]);
	}
	public static int jump(int i,int n,int []h,int[] dp,int min,int k){
//		System.out.println("start "+i);
		if(i==n) return 0;
		if(i>n) return (int)1e5;
		if(dp[i]!=-1)return dp[i];
		int kk = 100005;
		for(int j=i+1;j<=i+k;j++){
			if(j<=n)
			kk = Math.abs(h[j]-h[i])+jump(j,n,h,dp,min,k);				//System.out.println("k= "+k+" "+i+"->"+(i+1));
			min = Math.min(kk,min);
		}
	
		dp[i]=min;
		return dp[i];

	}
}
