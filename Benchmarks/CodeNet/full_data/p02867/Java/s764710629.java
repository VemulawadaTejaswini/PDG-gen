import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    int count = 0;
    boolean ans = true;

    int n = stdIn.nextInt();
    int[][] a = new int[3][n];

    for (int i = 0; i < n; i++) {
      a[0][i] = stdIn.nextInt();
    }
    for (int i = 0; i < n; i++) {
      a[1][i] = stdIn.nextInt();
    }
    for (int i = 0; i < n; i++) {
      a[2][i] = a[0][i];
    }

    for (int i = 0; i < n-1; i++) {
      for (int j = n-1; j > i; j--) {
        if (a[1][j] <= a[1][j-1]) {
          int c = a[1][j-1];
          int d = a[0][j-1];
          a[1][j-1] = a[1][j];
          a[1][j] = c;
          a[0][j-1] = a[0][j];
          a[0][j] = d;
        }
      }
      for (int j = n-1; j > i; j--) {
        if (a[2][j] <= a[2][j-1]) {
          int c = a[2][j-1];
          a[2][j-1] = a[2][j];
          a[2][j] = c;
        }
      }
    }

    for (int i = 0; i < n; i++) {
      if (a[1][i] < a[2][i]) {
        ans = false;
      }
    }

    if (ans) {
      for (int i = 0; i < n; i++) {
        if (a[0][i] != a[2][i]) {
          for (int j = i+1; j < n; j++) {
            if (a[0][j] == a[2][i]) {
              int c = a[0][i];
              a[0][i] = a[0][j];
              a[0][j] = c;
              count++;
              break;
            }
          }
        }
      }
      if (count > n-2) {
        ans = false;
      }
    }

    if (ans) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
