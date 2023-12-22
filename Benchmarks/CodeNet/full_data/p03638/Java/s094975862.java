import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    int n = sc.nextInt();
    int[] a = new int[n + 1];
    for (int i = 1; i <= n; i++) {
      a[i] = sc.nextInt();
    }
    int[][] matrix = new int[h][w];
    int row = 0;
    int col = 0;
    for (int i = 1; i <= n; i++) {
      int num = a[i];
      while(row < h && num != 0) {
        while(row % 2 == 0 && row < h && col < w && num != 0) {
          matrix[row][col] = i;
          col++;
          num--;
        }
        if (col == w) {
          row++;
          col--;
        }
        while(row % 2 == 1 && row < h && col >= 0 && num != 0) {
          matrix[row][col] = i;
          col--;
          num--;
        }
        if (col == -1) {
          row++;
          col++;
        }
      }
    }
    for (int r = 0; r < h; r++) {
      for (int c = 0; c < w; c++) {
        System.out.print(matrix[r][c] + " ");
      }
      System.out.println();
    }
  }
}
