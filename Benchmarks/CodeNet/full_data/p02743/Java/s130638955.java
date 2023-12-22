import java.util.*;
import java.math.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
    long c = sc.nextLong();
    if(2 * a * b - a * a - b * b + 2 * c * a + 2 * c * b < c * c) System.out.println("Yes");
    else System.out.println("No");
  }
}