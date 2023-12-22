import java.util.*;
public class Main{
	static char[][]hw;
	static long[][]memo;
	static int h,w;
	public static long dp(int i,int j) {
		if(i==h-1&&j==w-1)
			return 1;
		if(i==h||j==w)
			return 0;
		if(memo[i][j]!=-1)
			return memo[i][j];
		if(i+1<h&&j+1<w&&hw[i+1][j]=='.'&&hw[i][j+1]=='.')
			return memo[i][j] =dp(i+1,j)+dp(i,j+1);
		if(i+1<h&&hw[i+1][j]=='.')
			return memo[i][j] = dp(i+1,j);
		if(j+1<w&&hw[i][j+1]=='.')
			return memo[i][j] =dp(i,j+1);
		return memo[i][j] =0;
		
		
	}
	public static void main (String[]args) {
		Scanner sc=new Scanner(System.in);
		h=sc.nextInt();
		w=sc.nextInt();
		hw=new char [h][w];
		for(int i=0;i<hw.length;i++) {
			String s=sc.next();
			for(int j=0;j<hw[i].length;j++) {
				hw[i][j]=s.charAt(j);
			
			}
			memo=new long[h][w];
			for(long[]x:memo)
				Arrays.fill(x,-1);
			
		}
		for(int i=hw.length-1;i>=0;i-=5) {
			for(int j=0;j>=0;j-=5)
				dp(i,j);
		}
		System.out.println(dp(0,0)%1000000007);
		
		
		
		
	}
}