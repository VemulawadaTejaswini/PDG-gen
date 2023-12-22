import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int[][] card = new int[3][3];
    boolean[][] marked = new boolean[3][3];
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        card[i][j] = Integer.parseInt(sc.next());
        marked[i][j] = false;
      }
    }
    int n = Integer.parseInt(sc.next());
    for (int k = 0; k < n; k++) {
      int b = Integer.parseInt(sc.next());
      for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
          if (card[i][j] == b) {
            marked[i][j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 3; i++) {
      boolean bingo = true;
      for (int j = 0; j < 3; j++) {
        bingo = bingo && marked[i][j];
      }
      if (bingo) {
        pw.println("Yes");
        return;
      }
    }
    for (int j = 0; j < 3; j++) {
      boolean bingo = true;
      for (int i = 0; i < 3; i++) {
        bingo = bingo && marked[i][j];
      }
      if (bingo) {
        pw.println("Yes");
        return;
      }
    }
    if (marked[0][0] && marked[1][1] && marked[2][2]) {
      pw.println("Yes");
      return;
    }
    if (marked[0][2] && marked[1][1] && marked[2][0]) {
      pw.println("Yes");
      return;
    }
    pw.println("No");
  }
}
