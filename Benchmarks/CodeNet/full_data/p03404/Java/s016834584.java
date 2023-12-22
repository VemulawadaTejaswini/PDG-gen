import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println(100 + " " + 100);
    String[][] grid = new String[100][100];
    for(int i = 0; i < 100; i++) {
      for(int j = 0; j < 100; j++) {
        if(i < 50) {
          grid[i][j] = "*";
        } else {
          grid[i][j] = ".";
        }
      }
    }
    a--;
    b--;
    for(int i = 0; i < 50; i++) {
      for(int j = 0; j < 100; j++) {
        if(a == 0) break;
        if((i % 2 == 0) && (j % 2 == 0)) {
          grid[i][j] = ".";
          a--;
        }
      }
    }
    for(int i = 99; i > 50; i--) {
      for(int j = 0; j < 100; j++) {
        if(b == 0) break;
        if((i % 2 == 1) && (j % 2 == 0)) {
          grid[i][j] = "*";
          b--;
        }
      }
    }
    for(int i = 0; i < 100; i++) {
      for(int j = 0; j < 100; j++) {
        System.out.print(grid[i][j]);
      }
      System.out.println();
    }
  }
}