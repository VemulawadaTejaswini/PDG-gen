import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.lang.Integer;
import java.lang.StringBuilder;
import java.lang.Math;

public class Main {

  public static boolean isDayDreamInternal(String s) {
    if (s.length() == 0) return true;
    if (s.length() <= 4) return false;

    if (s.startsWith("dreamer")) {
      String next = s.substring(7);
      if (isDayDreamInternal(next)) {
        return true;
      }
    }

    if (s.startsWith("eraser")) {
      String next = s.substring(6);
      if (isDayDreamInternal(next)) {
        return true;
      }
    }

    if (s.startsWith("erase") || s.startsWith("dream")) {
      String next = s.substring(5);
      if (isDayDreamInternal(next)) {
        return true;
      }
    }

    return false;
  }

  public static boolean isDayDream(String s) {
    return isDayDreamInternal(s);
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String s = in.next();

    boolean result = isDayDream(s);

    if (result) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
    //System.out.println(s.substring(s.length()));
  }
}