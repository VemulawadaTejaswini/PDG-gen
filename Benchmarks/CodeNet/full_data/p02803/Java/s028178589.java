import java.util.*;
public class Main {

  private static int ROW_NUMBER = 20, COL_NUMBER = 20;

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int h = sc.nextInt();
      int w = sc.nextInt();
      char[][] grid = new char[h][w];
      for(int i = 0; i < h; i++)
        grid[i] = sc.next().toCharArray();
      int max = 0;

      for(int i = 0; i < h; i++) {
        for(int j = 0; j < w; j++) {
          if(grid[i][j] == '#') continue;
          max = Math.max(max, bfs(grid, i, j));
        }
      }

      System.out.println(max);
  }

  private static int bfs(char[][] grid, int start_row, int start_col) {
    int step = 0;
    int[] rows = new int[]{-1, 1, 0, 0};
    int[] cols = new int[]{0, 0, -1, 1};

    Set<Integer> visited = new HashSet<>();
    visited.add(start_row * COL_NUMBER + start_col);
    Queue<int[]> queue = new LinkedList<>();
    queue.offer(new int[]{start_row, start_col});
    while(!queue.isEmpty()) {
      int size = queue.size();
      for(int i = 0; i < size; i++) {
        int[] cood = queue.poll();
        int row = cood[0];
        int col = cood[1];
        for(int d = 0; d < rows.length; d++) {
          int next_row = rows[d] + row;
          int next_col = cols[d] + col;
          if(isValid(grid, visited, next_row, next_col)) {
            queue.offer(new int[]{next_row, next_col});
            visited.add(next_row * COL_NUMBER + next_col);
          }
        }
      }
      if(!queue.isEmpty())step++;
    }
    return step;
  }

  private static boolean isValid(char[][] grid, Set<Integer> visited, int row, int col) {
    if(row < 0 || row >= grid.length || col < 0 || col >= grid[row].length || grid[row][col] == '#' || visited.contains(row * COL_NUMBER + col))
      return false;
    return true;
  }
}