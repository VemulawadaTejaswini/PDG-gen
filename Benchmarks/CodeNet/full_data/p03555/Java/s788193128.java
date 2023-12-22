import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    char[][] c = new char[2][3];

    for (int i = 0; i < 2; i++) {
      String s = sc.next();
      for (int j = 0; j < 3; j++) {
        c[i][j] = s.charAt(j);
      }
    }

    if ((c[0][0] == c[1][2]) && (c[0][1] == c[1][1]) && (c[0][2] == c[1][0])) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }

  }
}