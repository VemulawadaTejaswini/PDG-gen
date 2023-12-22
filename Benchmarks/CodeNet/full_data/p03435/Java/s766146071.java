import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = 3;
    int[][] c = new int[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        c[i][j] = sc.nextInt();
      }
    }
    int a1, a2, a3, b1, b2, b3;
    String ans = "No";
    for (int i = 0; i < n; i++) {
      a1 = i;
      b1 = c[0][0] - a1;
      b2 = c[0][1] - a1;
      b3 = c[0][2] - a1;
      a2 = c[1][0] - b1;
      a3 = c[2][0] - b1;
      if (a2 + b2 == c[1][1] && a2 + b3 == c[1][2] && a3 + b2 == c[2][1] && a3 + b3 == c[2][2]) {
        ans = "Yes";
        break;
      }
    }
    System.out.println(ans);
  }
}