import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    int H = scan.nextInt();
    int W = scan.nextInt();

    int[][] matrix = new int[2][W + 1];
    int top = 1;
    int current = 0;
    matrix[current][1] = 1;
    //print(matrix);
    for (int i = 0; i < H; i++) {
      int tmp = top;
      top = current;
      current = tmp;
      String line = scan.next();
      for (int j = 1; j <= W; j++) {
        if ('#' == line.charAt(j-1)) {
          matrix[current][j] = 0;
        } else {
          int t = matrix[top][j];
          int l = matrix[current][j-1];
          matrix[current][j] = (t + l) % 1000_000_007;
        }
      }
    }

    scan.close();

    System.out.println(matrix[current][matrix[current].length - 1]);
  }
  
  static void print(int[][] arr) {
    for (int[] a : arr) System.out.println(Arrays.toString(a));
  }
}