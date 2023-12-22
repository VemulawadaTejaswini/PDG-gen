import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    double a = in.nextFloat();
    double b = in.nextFloat();
    double x = in.nextFloat();
    if(a * a * b / 2 < x) {
      b -= (2 * x - a * a * b) / (a * a);
      x = a * a * b / 2;
    }
    double n = (2 * x) / (a * b);
    double t = b / n;
    System.out.printf("%.6f", Math.toDegrees(Math.atan(t)));
  }
}