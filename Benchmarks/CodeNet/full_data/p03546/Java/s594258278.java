import java.util.*;
public class Main{

  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int h = sc.nextInt();
      int w  = sc.nextInt();

      int[][] costs = new int[10][10];
      for(int i = 0; i <= 9; i++) {
        for(int j = 0; j <= 9; j++)
          costs[i][j] = sc.nextInt();
      }

      int[][] matrix = new int[h][w];
      for(int i = 0; i < h; i++) {
          for(int j = 0; j < w; j++) {
            matrix[i][j] = sc.nextInt();
          }
      }
      
      Map<Integer, Long> memo = new HashMap<>();
      long cost = 0;
      for(int i = 0; i < h; i++) {
          for(int j = 0; j < w; j++) {
              int num = matrix[i][j]; // 8
              if(num == -1) continue; //       8            9
              long minCost = 0;
              if(memo.containsKey(num))
                minCost = memo.get(num);
              else{
                minCost = dfs(memo, costs, matrix, num, 0, costs[num][1]);
                memo.put(num, minCost);
              }
              cost += minCost;
          }
      }
      System.out.println(cost);
  }

  private static long dfs(Map<Integer, Long> memo, int[][] costs, int[][] matrix, int n, long curCost, long minCost) {
      
      if(curCost >= minCost) return minCost;
      if(n == 1) {
        return curCost;
      }

      for(int i = 0; i <= 9; i++) {
        if(i == n) continue;
        minCost = Math.min(minCost, dfs(memo, costs, matrix, i, curCost + costs[n][i], minCost));
      }
      //memo.put(n, minCost);
      return minCost;
  }
}

