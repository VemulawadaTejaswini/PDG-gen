import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int n = Integer.parseInt(sc.next());
    int m = Integer.parseInt(sc.next());
    Integer[] condition = new Integer[n + 1];
    for (int i = 0; i < m; i++) {
      int s = Integer.parseInt(sc.next());
      int c = Integer.parseInt(sc.next());
      if (condition[s] != null && condition[s] != c) {
        pw.println(-1);
        return;
      }
      condition[s] = c;
    }
    if (condition[1] != null && condition[1] == 0) {
      pw.println(-1);
      return;
    }
    StringBuilder answer = new StringBuilder();
    if (condition[1] != null) {
      answer.append(condition[1]);
    } else {
      answer.append(n == 1 ? "0" : "1");
    }
    for (int i = 2; i <= n; i++) {
      if (condition[i] != null) {
        answer.append(condition[i]);
      } else {
        answer.append(0);
      }
    }
    pw.println(answer.toString());
  }
}
