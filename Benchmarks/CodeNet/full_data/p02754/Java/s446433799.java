import java.util.*;
import java.math.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();

    int c = 0;
    int ans = 0;
    String s = "";

    if (a == 0) {
      System.out.println(0);
      return;
    }

    while (true) {

      for (int i = 0; i < a; i++) {
        if (c == n) {
          System.out.println(ans);
          return;
        }
        c++;
        ans++;
      }

      for (int i = 0; i < b; i++) {
        if (c == n) {
          System.out.println(ans);
          return;
        }
        c++;
      }
    }

  }
}
