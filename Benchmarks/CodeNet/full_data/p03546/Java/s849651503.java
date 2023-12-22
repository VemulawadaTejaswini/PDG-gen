import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int h = sc.nextInt();
      int w = sc.nextInt();
      int[][] cost = new int[10][10];
      for(int i = 0; i <= 9; i++)
        for(int j = 0; j<= 9; j++)
          cost[i][j] = sc.nextInt();

      int[][] grid = new int[h][w];
      for(int i = 0; i < h; i++)
        for(int j = 0; j < w; j++)
          grid[i][j] = sc.nextInt();

      for(int k = 0; k <= 9; k++)
        for(int i = 0; i <= 9; i++)
          for(int j = 0; j <= 9; j++)
            cost[i][j] = Math.min(cost[i][j], cost[i][k] + cost[k][j]);

      long res = 0L;
      for(int i = 0; i < h; i++)
        for(int j = 0; j < w; j++)
          if(grid[i][j] == -1)
            continue;
          else
            res += cost[grid[i][j]][1];
      System.out.println(res);
  }
}