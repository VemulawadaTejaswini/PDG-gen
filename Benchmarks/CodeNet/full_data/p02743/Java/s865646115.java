import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double a = sc.nextInt();
    double b = sc.nextInt();
    double c = sc.nextInt();
    double as = Math.sqrt(a);
    double bs = Math.sqrt(b);
    double cs = Math.sqrt(c);
    if (as + bs < cs) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}