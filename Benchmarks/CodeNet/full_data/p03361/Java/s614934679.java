import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int W = sc.nextInt();
    char[][] s = new char[H + 2][W + 2];
    for (int i = 1; i <= H; i++) {
      char[] row = sc.next().toCharArray();
      for (int j = 1; j <= W; j++) {
        s[i][j] = row[j - 1];
      }
    }
    for (int i = 1; i <= H; i++) {
      for (int j = 1; j <= W; j++) {
        if (s[i][j] == '#' && !check(s, i, j)) {
          System.out.println("No");
          return;
        }
      }
    }
    System.out.println("Yes");
  }

  public static boolean check(char[][] s, int i, int j) {
    if (s[i - 1][j] == '#') {
      return true;
    }
    if (s[i][j - 1] == '#') {
      return true;
    }
    if (s[i][j + 1] == '#') {
      return true;
    }
    if (s[i + 1][j] == '#') {
      return true;
    }
    return false;
  }
}