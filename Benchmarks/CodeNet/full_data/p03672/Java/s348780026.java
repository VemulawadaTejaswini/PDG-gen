import java.util.Scanner;

public class Main {
  private static boolean is_even(String s) {
    if (0 == s.length() % 2) {
      return true;
    }
    else {
      return false;
    }
  }

  private static boolean is_even_string(String s) {
    int length = s.length();
    if (s.substring(0, length / 2).equals(s.substring(length / 2, length))) {
      return true;
    }
    else {
      return false;
    }
  }

  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    String s = stdIn.next();
    s = s.substring(0, s.length()-1);

    for (int i = s.length(); i > 1; i--) {
      if (!is_even(s)) {
        s = s.substring(0, s.length()-1);
        continue;
      }
      if (is_even_string(s)) {
        System.out.println(s.length());
      }
      s = s.substring(0, s.length()-1);

    }
  }
}
