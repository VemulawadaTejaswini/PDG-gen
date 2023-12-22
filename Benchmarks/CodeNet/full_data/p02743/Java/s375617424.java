import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
    long c = sc.nextLong();
    long left = 2 * (a * b + b * c + c * a);
    long right = a * a + b * b + c * c;
    System.out.println(left < right ? "Yes" : "No");
  }
}
