import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    char[][] c = new char[h + 2][w + 2];

    for (int i = 0; i < (h + 2); i++) {
      if ((i == 0) || (i == (h + 1))) {
        for (int j = 0; j < (w + 2); j++) {
          c[i][j] = '#';
        }
      } else {
        String s = sc.next();
        for (int j = 0; j < (w + 2); j++) {
          if ((j == 0) || (j == (w + 1))) {
            c[i][j] = '#';
          } else {
            c[i][j] = s.charAt(j - 1);
          }
        }
      }
    }

    for (int i = 0; i < (h + 2); i++) {
      for (int j = 0; j < (w + 2); j++) {
        System.out.print(c[i][j]);
      }
      System.out.println();
    }

  }
}