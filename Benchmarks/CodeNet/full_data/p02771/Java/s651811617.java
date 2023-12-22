import java.util.*;

public class Main {
  public static void main(final String[] args) {
    final Scanner sc = new Scanner(System.in);
    int a = Integer.parseInt(sc.next());
    int b = Integer.parseInt(sc.next());
    int c = Integer.parseInt(sc.next());
    // int[] p = new int[n];
    // for (int i = 0; i < n; ++i) {
    //   p[i] = Integer.parseInt(sc.next());
    // }
    sc.close();
      if (a == b || b == c || c == a) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
  }
}