import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    try {
      String s = scanner.next();

      System.out.println(solve(s));
    } finally {
      scanner.close();
    }
  }

  private static int solve(String s) {
    int opt = s.replace("x", "").length();
    return 700 + opt * 100;
  }
}
