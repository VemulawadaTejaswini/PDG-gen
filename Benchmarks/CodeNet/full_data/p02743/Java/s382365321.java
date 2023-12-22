import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    double c = sc.nextDouble();
    String ans = "No";
    if(c > (a + b)) {
      double d = c - (a + b);
      double e = a * b;
      e = (double)Math.sqrt(e);
      e = 2 * e;
      if(e < d) ans = "Yes";
    }
    System.out.println(ans);
  }
}
