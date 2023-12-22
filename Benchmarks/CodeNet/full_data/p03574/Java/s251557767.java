import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    int[][] field = new int[h][w];

    for (int i = 0; i < h; i++) {
      String s = sc.next();
      for (int j = 0; j < w; j++) {
        if (s.charAt(j) == '#') {
          field[i][j] = Integer.MIN_VALUE;
          if ((i - 1) >= 0) {
            field[i - 1][j]++;
            if ((j - 1) >= 0) {
              field[i - 1][j - 1]++;
            }
            if ((j + 1) < w) {
              field[i - 1][j + 1]++;
            }
          }

          if ((j - 1) >= 0) {
            field[i][j - 1]++;
          }

          if ((j + 1) < w) {
            field[i][j + 1]++;
          }

          if ((i + 1) < h) {
            field[i + 1][j]++;
            if ((j - 1) >= 0) {
              field[i + 1][j - 1]++;
            }
            if ((j + 1) < w) {
              field[i + 1][j + 1]++;
            }
          }

        }
      }
    }

    for (int i = 0; i < h; i++) {
      for (int j = 0; j < w; j++) {
        if (field[i][j] < 0) {
          System.out.print('#');
        } else {
          System.out.print(field[i][j]);
        }
      }
      System.out.println();
    }

  }
}