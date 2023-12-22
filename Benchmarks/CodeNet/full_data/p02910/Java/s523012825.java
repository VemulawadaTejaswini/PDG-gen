import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    while (in.hasNext()) {
      String s = in.next();
      boolean isEasy = true;

      for (int i = 0; i < s.length(); ++i) {
        if ((i + 1) % 2 == 1 && s.charAt(i) == 'L') {
          isEasy = false;
          break;
        } else if ((i + 1) % 2 == 0 && s.charAt(i) == 'R') {
          isEasy = false;
          break;
        }
      }

      if (isEasy) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
    }
  }
}