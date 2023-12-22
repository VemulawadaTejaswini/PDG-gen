import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    new Main().c();

  }

  private void c() {
    try (Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)))) {

      String s = in.nextLine();

      System.out.println(solve(s));
    }
  }

  private String solve(String s) {

    while (!s.isEmpty()) {
      if (s.endsWith("dreamer")) {
        s = s.substring(0, s.length() - 7);
      } else if (s.endsWith("eraser")) {
        s = s.substring(0, s.length() - 6);
      } else if (s.endsWith("dream") || s.endsWith("erase")) {
        s = s.substring(0, s.length() - 5);
      } else {
        return "NO";
      }
    }

    return "YES";
  }
}
