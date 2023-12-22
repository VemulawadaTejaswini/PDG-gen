
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    StringBuilder s = new StringBuilder(scanner.next());
    int q = scanner.nextInt();

    for (int i = 0; i < q; i++) {
      int query = scanner.nextInt();
      if(query == 1) {
        s.reverse();
      } else {
        int f = scanner.nextInt();
        String c = scanner.next();
        if(f == 1) {
          s.insert(0, c);
        } else {
          s.append(c);
        }
      }
    }
    System.out.println(s);
  }
}
