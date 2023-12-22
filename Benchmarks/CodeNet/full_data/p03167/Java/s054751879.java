import java.io.*;
import java.util.*;  
public class Main {
	static int div=(1000000000+7);
	static int H, W;
	static char[][] grid;
	static long[][] memo;
	public static long dp(int x, int y)
	{
		if(memo[x][y]!=-1)return memo[x][y];
		return memo[x][y]=((x + 1==H || grid[x+1][y]=='#'?0:dp(x+1,y)) + (y + 1==W || grid[x][y+1]=='#'?0:dp(x, y+1)))%div;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		StringTokenizer st = new StringTokenizer(br.readLine());
		H = Integer.parseInt(st.nextToken()); W = Integer.parseInt(st.nextToken());
		grid = new char[H][W]; memo = new long[H][W]; 
		for (int i = 0; i < H; i++) {
			String temp = br.readLine();
			for (int j = 0; j < W; j++) {
				grid[i][j]= temp.charAt(j);
				memo[i][j]=-1;
			}
		}
		memo[H-1][W-1]=1;pw.println(dp(0,0));
		pw.close();
	}
}