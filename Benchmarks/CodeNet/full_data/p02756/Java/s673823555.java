import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    StringBuilder first = new StringBuilder(sc.next());
    int n = sc.nextInt();

    int f;
    int t;
    String c;
    for (int i = 0; i < n; i++) {
      f = sc.nextInt();
      if (f == 1) {
        first.reverse();
      } else if (f == 2) {
        t = sc.nextInt();
        c = sc.next();
        if (t == 1) {
          first.insert(0, c);
        } else if (t == 2) {
          first.append(c);
        }
      }
    }
    System.out.println(first.toString());
  }
}
