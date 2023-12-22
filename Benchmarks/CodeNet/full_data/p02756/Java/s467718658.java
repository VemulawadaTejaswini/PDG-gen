
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    StringBuilder s = new StringBuilder(scanner.next());
    int q = scanner.nextInt();
    int next = -1;

    for (int i = 0; i < q; i++) {
      if (next == 1) {
        next = -1;
        continue;
      }
      int query;
      if (next == -1) {
        query = scanner.nextInt();
      } else {
        query = next;
      }
      if (query == 1) {
        if (scanner.hasNextInt()) {
          next = scanner.nextInt();
        } else {
          next = -1;
        }

        if (next != 1) {
          s.reverse();
        }
      } else {
        next = -1;
        int f = scanner.nextInt();
        String c = scanner.next();
        if (f == 1) {
          s.insert(0, c);
        } else {
          s.append(c);
        }
      }
      System.out.println(i + " " + next + " " + s);
    }
    System.out.println(s);
  }
}
