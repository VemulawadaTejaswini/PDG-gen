import java.util.Arrays;
import java.util.Scanner;

public class Main{
	final static int INF=(int)1e9;
	static int[][]memo;
	static char[][]grid;
	 static int x;
	 static int y;
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		 x=sc.nextInt();
		 y=sc.nextInt();
		memo=new int[x+1][y+1];
		grid =new char[x+1][y+1];
		
		for(int i=0;i<x;i++) {
			Arrays.fill(memo[i], -1);
			grid[i]=sc.next().toCharArray();
		}
		System.out.println(dp(0,0));
		
	}
	public static int dp(int i, int j) {
		
		if(x-1==i && j==y-1)
			return 1;
		
		if(i>=x||i==-1||j==-1||j>=y||grid[i][j]=='#')
			return 0;
		
		if(memo[i][j]!=-1) 
			return memo[i][j];
		
		int right=dp(i+1,j)%1000000007;
		
		int down=dp(i,j+1)%1000000007;

		return memo[i][j]=(right+down)%1000000007;
		
	}
	
	
	
}
