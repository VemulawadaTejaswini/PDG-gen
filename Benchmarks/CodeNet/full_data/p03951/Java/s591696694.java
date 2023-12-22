import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    String t = sc.next();
    int ans = 2 * n;

    if (s.equals(t)) {
      System.out.println(n);
      return;
    }

    for (int i = 0; i < n / 2; i++) {
      if (s.charAt(n - i - 1) == t.charAt(i)) {
        ans--;
      } else {
        break;
      }
    }

    System.out.println(ans);

  }
}