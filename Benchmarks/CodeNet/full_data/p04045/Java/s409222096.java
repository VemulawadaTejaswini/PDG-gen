import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    final Scanner scanner = new Scanner(System.in);

    final int n = scanner.nextInt();
    scanner.nextLine();

    final boolean[] dislikes = new boolean[11];
    for (String s : scanner.nextLine().split(" ")) {
      dislikes[Integer.parseInt(s)] = true;
    }

    int modified = n;
    int divider = 1;
    while (modified >= divider) {
      int num = (modified / divider) % 10;

      if (dislikes[num]) {
        modified += divider;
      } else {
        divider *= 10;
      }
    }

    System.out.println(modified);
  }
}