import java.util.*;

public class Main {
  private static boolean verify(int[][] c) {
    return (
      c[1][1] - c[1][0] == c[0][1] - c[0][0] &&
      c[2][1] - c[2][0] == c[0][1] - c[0][0] &&
      c[1][2] - c[1][1] == c[0][2] - c[0][1] &&
      c[2][2] - c[2][1] == c[0][2] - c[0][1] &&
      c[1][1] - c[0][1] == c[1][0] - c[0][0] &&
      c[1][2] - c[0][2] == c[1][0] - c[0][0] &&
      c[2][1] - c[1][1] == c[2][0] - c[1][0] &&
      c[2][2] - c[1][2] == c[2][0] - c[1][0]);
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int[][] c = new int[3][3];
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        c[i][j] = in.nextInt();
      }
    }
    System.out.println(verify(c) ? "Yes" : "No");
  }
}
