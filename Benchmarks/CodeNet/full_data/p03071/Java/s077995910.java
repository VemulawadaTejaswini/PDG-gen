import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = 2 * a - 1;
    int d = 2 * b - 1;
    int e = a + b;
    int ans = Math.max(c, Math.max(d, e));
    System.out.println(ans);
  }
}
