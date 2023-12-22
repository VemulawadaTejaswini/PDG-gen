import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String tmpS = "";

    while (!s.equals(tmpS)) {
      if (s.endsWith("dreamer" + tmpS)) {
        tmpS = "dreamer" + tmpS;
      } else if (s.endsWith("dream" + tmpS)) {
        tmpS = "dream" + tmpS;
      } else if (s.endsWith("eraser" + tmpS)) {
        tmpS = "eraser" + tmpS;
      } else if (s.endsWith("erase" + tmpS)) {
        tmpS = "erase" + tmpS;
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