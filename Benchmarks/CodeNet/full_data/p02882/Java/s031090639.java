import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    double x = sc.nextDouble();
    double S = x / a;
    double ans = 0;
    if(((a * b) / (double)2) >= S) {
      double a1 = (2 * S) / b;
      ans = Math.atan(b / a1);
    } else {
      double y = (2 * S) / a - b;
      double t = b - y;
      ans = Math.atan(t / a);
    }
    System.out.println(Math.toDegrees(ans));
  }
}