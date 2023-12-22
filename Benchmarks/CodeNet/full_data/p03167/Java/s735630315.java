import java.util.*;
import java.io.*;
import java.lang.*;

class Main{
	static int [][]dp;
	static int row, col;
	static String []grid;
	static int MOD = (int)1e9 + 7;
	static int back(int x, int y){
		if(x == row - 1 && y == col - 1)return 1;
		if(x >= row || y >= col || grid[x].charAt(y) == '#')return 0;
		if(dp[x][y] != -1)return dp[x][y];
		return dp[x][y] = ((back(x + 1, y) % MOD)  + (back(x, y + 1) % MOD)) % MOD;
	}
	static void add_self(int one, int two){
		one += two;
		if(one >= MOD){
			one -= MOD;
		}
	}
	public static void main(String[] args)throws IOException{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			 row = sc.nextInt();
			 col = sc.nextInt();
			 dp = new int[row + 1][col + 1];
			 grid = new String[row + 1];
			 grid[0] = sc.nextLine();
			 for(int i = 0; i < row; ++i){
			 	for(int j = 0; j < col; ++j){
			 		dp[i][j] = 0;
			 	}
			 }
			for(int i = 0; i < row; ++i){
				grid[i] = sc.nextLine();
			}
			dp[0][0] = 1;
			for(int i = 0; i < row; ++i){
				for(int j = 0; j < col; ++j){
					int r1 = i + 1, c1 = j;
					int r2 = i, c2 = j + 1;
					if(r1 < row && c1 < col && grid[r1].charAt(c1) == '.'){
						dp[r1][c1] += dp[i][j];
						dp[r1][c1] %= MOD;
					}
					if(r2 < row && c2 < col && grid[r2].charAt(c2) == '.'){
						dp[r2][c2] += dp[i][j];
						dp[r2][c2] %= MOD;
					}
				}
			}
			System.out.println(dp[row - 1][col - 1]);
		}		
	}
}
