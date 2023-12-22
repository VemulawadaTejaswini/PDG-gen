import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    if (n == 1 && m == 1) {
      System.out.println(1);
      return;
    }
    if (n == 1) {
      System.out.println(m - 2);
      return;
    }
    if (m == 1) {
      System.out.println(n - 2);
      return;
    }
    System.out.println((n - 2) * (m - 2));
  }
}