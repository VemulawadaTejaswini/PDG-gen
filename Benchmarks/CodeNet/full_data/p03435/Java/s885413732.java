import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    try {
      int[][] c = new int[3][3];
      for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
          c[i][j] = scanner.nextInt();
        }
      }
      
      for (int i = 0; i < 2; i++) {
        if (!check_h(c,i)) {
          System.out.println("No");
          return;
        }
      }
      
      for (int j = 0; j < 2; j++) {
        if (!check_v(c,j)) {
          System.out.println("No");
          return;
        }
      }
      
      System.out.println("Yes");
    }
    finally {
      scanner.close();
    }
  }

  private static boolean check_v(int[][] c, int j) {
    for (int i = 0; i < 2; i++) {
      if (c[i][j+1] - c[i][j] != c[i+1][j+1] - c[i+1][j]) return false;
    }
    return true;
  }

  private static boolean check_h(int[][] c, int i) {
    for (int j = 0; j < 2; j++) {
      if (c[i+1][j] - c[i][j] != c[i+1][j+1] - c[i][j+1]) return false;
    }
    return true;
  }
}