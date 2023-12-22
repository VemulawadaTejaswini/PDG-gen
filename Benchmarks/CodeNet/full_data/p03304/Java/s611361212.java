import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double n = sc.nextDouble();
    double m = sc.nextDouble();
    double d = sc.nextDouble();
    double ans = (2 * (n - d) * (m - 1)) / (n * n);
    System.out.println(ans);
  }
}