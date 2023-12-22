import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    final char WALL = '#';
    final int MOD = 1_000_000_000 + 7;
      
    while (input.hasNext()) {
      int H = input.nextInt();
      int W = input.nextInt();
      char[][] grid = new char[H][W];
      
      for (int i = 0; i < grid.length; ++i) {
        grid[i] = input.next().toCharArray();
      }
      
      long[][] ways = new long[H][W];
      ways[0][0] = grid[0][0] != WALL ? 1 : 0;
      for(int i = 1; i < grid[0].length; ++i) {
        if (grid[0][i] != WALL) {
          ways[0][i] += ways[0][i - 1];
        }
      }
      
      for (int i = 1; i < grid.length; ++i) {
        if (grid[i][0] != WALL) {
          ways[i][0] += ways[i - 1][0];
        }
      }
      
      for (int i = 1; i < grid.length; ++i) {
        for (int j = 1; j < grid[i].length; ++j) {
          if (grid[i - 1][j]  != WALL) {
            ways[i][j] += ways[i - 1][j];
            ways[i][j] %= MOD;
          }
          
          if (grid[i][j - 1]  != WALL) {
            ways[i][j] += ways[i][j - 1];
            ways[i][j] %= MOD;
          }
        }
      }
      
      System.out.println(ways[H - 1][W - 1]);
    }
  }
}