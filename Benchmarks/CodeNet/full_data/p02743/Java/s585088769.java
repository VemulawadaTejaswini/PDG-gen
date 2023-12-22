import java.util.*;
import java.math.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
    long c = sc.nextLong();
    sc.close();

    long d = c - a - b;
    boolean ans = (0 < d && 4 * a * b < d * d);
    System.out.println(ans ? "Yes" : "No");    
  }
}
