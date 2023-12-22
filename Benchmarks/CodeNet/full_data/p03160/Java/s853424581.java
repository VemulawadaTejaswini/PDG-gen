
import java.util.*;
public class Main{
	static char[][]hw;
	static long[][]memo;
	static int h,w;
	
	public static long dp(int i,int j) {
		
		if(i==h-1&&j==w-1)
			return 1l;
		if(i==h||j==w)
			return 0l;
		 if(memo[i][j]!=-1)
			 return memo[i][j];
		 if(i+1<h&&j+1<w&&hw[i+1][j]=='.'&&hw[i][j+1]=='.')
			return memo[i][j] =(dp(i+1,j)+dp(i,j+1))%1000000007l;
		 if(i+1<h&&hw[i+1][j]=='.')
			return memo[i][j] = dp(i+1,j);
		 if(j+1<w&&hw[i][j+1]=='.')
		return memo[i][j] =dp(i,j+1);
		return  memo[i][j] =0;
		
		
		
	}
	public static void main (String[]args) {
		Scanner sc=new Scanner(System.in);
		h=sc.nextInt();
		w=sc.nextInt();
		hw=new char [h][w];
		for(int i=0;i<hw.length;i++) {
			
			
				hw[i]=sc.next().toCharArray();
			
			}
			memo=new long[h][w];
			for(long[]x:memo)
				Arrays.fill(x,-1);
			for(int i=h;i>0;i--) {
				for(int j=w;j>0;j--)
					dp(i,j);
			}
		
		
		
		System.out.println(dp(0,0));
		
		
		
		
	}
}