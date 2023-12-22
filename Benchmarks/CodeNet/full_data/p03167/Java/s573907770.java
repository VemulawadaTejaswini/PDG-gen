import java.util.*;

public class Main{
	
	private static Scanner sc=new Scanner(System.in);
	private static final int MOD=1000000007;
	
	public static int findPaths(String[] grid,int H,int W){
		int dp[][]=new int[H+1][W+1];
		for(int i=0;i<H;i++)
			dp[i][0]=0;
		for(int i=0;i<W;i++)
			dp[0][i]=0;
		dp[0][1]=1;
		for(int i=1;i<=H;i++){
			for(int j=1;j<=W;j++){
				if(grid[i-1].charAt(j-1)=='.'){
					dp[i][j]=(dp[i-1][j]+dp[i][j-1])%MOD;
				}
			}
		}
		
		// for(int i=0;i<=H;i++){
			// for(int j=0;j<=W;j++)
				// System.out.print(dp[i][j]+" ");
			// System.out.println("");
		// }
		
		return dp[H][W];
	}
	
	public static void main(String []args){
		int H=sc.nextInt();
		int W=sc.nextInt();
		String grid[]=new String[H];
		for(int i=0;i<H;i++){
			grid[i]=sc.next();
		}
		System.out.println(findPaths(grid,H,W));
				
	}
	
}