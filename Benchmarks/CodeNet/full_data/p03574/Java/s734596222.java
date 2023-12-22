import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int W = sc.nextInt();
    char[][] matrix = new char[H+2][W+2];
    for (int i=1; i<H+1; i++) {
      String s = " " + sc.next() + " ";
      matrix[i] =s.toCharArray();
    }
    for (int i=1; i<H+1; i++) {
      for (int j=1; j<W+1; j++) {
        int count =0;
        if (matrix[i][j] == '#') {
          System.out.print('#');
          continue;
        }
        if (matrix[i-1][j+1] == '#') count++;
        if (matrix[i-1][j] == '#') count++;
        if (matrix[i-1][j-1] == '#') count++;
        if (matrix[i][j+1] == '#') count++;
        if (matrix[i][j-1] == '#') count++;
        if (matrix[i+1][j+1] == '#') count++;
        if (matrix[i+1][j] == '#') count++;
        if (matrix[i+1][j-1] == '#') count++;
        System.out.print(count);
      }
      System.out.println();
    }
  }
}