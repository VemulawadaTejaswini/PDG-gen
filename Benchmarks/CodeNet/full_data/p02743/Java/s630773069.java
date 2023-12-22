import java.util.*;
import java.math.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
    long c = sc.nextLong();
    sc.close();

    double ra = Math.sqrt(a);
    double rb = Math.sqrt(b);
    double rc = Math.sqrt(c);
    
    double ans = ra + rb - rc;
    System.out.println(ans < 0 ? "Yes" : "No");
  }
}
