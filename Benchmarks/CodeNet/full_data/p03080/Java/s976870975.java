import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    while (in.hasNext()) {
      int N = in.nextInt();
      String s = in.next();

      int countR = 0;
      for (int i = 0; i < s.length(); ++i) {
        if (s.charAt(i) == 'R') {
          ++countR;
        }
      }

      if (countR > N - countR) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
    }
  }
}