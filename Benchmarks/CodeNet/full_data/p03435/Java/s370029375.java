import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int[][] grid = new int[3][3];
      for(int i = 0; i < 3; i++) {
        for(int j = 0; j < 3; j++)
          grid[i][j] = sc.nextInt();
      }
      for(int i = 0; i < 2; i++) {
        for(int j = 0; j < 2; j++) {
          if(grid[i][j] + grid[i+1][j+1] != grid[i][j+1] + grid[i+1][j]) {
            System.out.println("No");
            return;
          }
        }
      }
      System.out.println("Yes");
  }
}