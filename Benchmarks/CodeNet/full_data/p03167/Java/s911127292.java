import java.util.*;

public class Main {
    public static void main(String args[]) {
 		Scanner scan = new Scanner(System.in);      	
      	int rows = scan.nextInt();
      	int cols = scan.nextInt();
        scan.nextLine();
      	boolean[][] grid = new boolean[rows][cols];
      	for(int r = 0; r < rows; r++){
          	char[] line = scan.nextLine().toCharArray();
        	for(int c = 0; c < cols; c++){
            	char cell = line[c];
              	grid[r][c] = cell == '.';
            }
        }
      	scan.close();
      	Solver solver = new Solver(grid);      	      	
      	System.out.println(solver.solve());
	}
  
  public static class Solver{
    private int mod = 1_000_000_007;
 	private boolean[][] grid;
    
    public Solver(boolean[][] grid){
    	this.grid = grid;
    }
    
    public int solve() 
    { 
      int rows = grid.length;
      int cols = grid[0].length;
      
      int[][] dp = new int[rows][cols];
	  fillFirstRow(dp, cols);     
      fillFirstCol(dp, rows);
      
      for(int r = 1; r < rows; r++){
      	for(int c = 1; c < cols; c++){
          if(!grid[r][c]) dp[r][c] = 0;
          else{
            dp[r][c] = (dp[r-1][c] + dp[r][c-1])%mod;
          }
        }
      }
      return dp[rows-1][cols-1];
    } 
    private void fillFirstRow(int[][] dp, int cols){
      int c = 0;
      for(; c < cols; c++){
        if(grid[0][c]){
          dp[0][c] = 1;
        }else break;
      }
      for(; c < cols; c++) dp[0][c] = 0;
    }
    private void fillFirstCol(int[][] dp, int rows){
      int r = 0;
      for(; r < rows; r++){
        if(grid[r][0]){
          dp[r][0] = 1;
        }else break;
      }
      for(; r < rows; r++) dp[r][0] = 0;
    }
  }
}