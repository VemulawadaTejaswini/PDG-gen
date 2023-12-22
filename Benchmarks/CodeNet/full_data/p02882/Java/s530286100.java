import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = Integer.parseInt(sc.next());
    int b = Integer.parseInt(sc.next());
    double x = Double.parseDouble(sc.next());
    double ans = 0.0;
    if(x >= (a * a * b) / 2.0) {
      ans = 2.0 * (a * a * b - x) / (a * a * a);
    } else {
      ans = a * b * b / x;
    }
    ans = Math.toDegrees(Math.atan(ans));
    System.out.println(ans);
  }
}
