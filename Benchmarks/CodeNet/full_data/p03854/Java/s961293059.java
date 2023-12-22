import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String tmpS = "";

    while (!s.equals(tmpS)) {
      if (s.startsWith(tmpS + "dreamer")) {
        tmpS += "dreamer";
      }

      else if (s.startsWith(tmpS + "eraser")) {
        tmpS += "eraser";
      }

      else if (s.startsWith(tmpS + "dream")) {
        tmpS += "dream";
      }

      else if (s.startsWith(tmpS + "erase")) {
        tmpS += "erase";
      }

      else {
        System.out.println("NO");
        sc.close();
        return;
      }
    }

    System.out.println("YES");
    sc.close();
    return;
  }
}