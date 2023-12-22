import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    while (in.hasNext()) {
      int N = in.nextInt();
      boolean is9x9multiplication = false;

      for (int i = 1; i <= 9; ++i) {
        for (int j = 1; j <= 9; ++j) {
          if (i * j == N) {
            is9x9multiplication = true;
          }
        }
      }

      if (is9x9multiplication) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
    }
  }
}