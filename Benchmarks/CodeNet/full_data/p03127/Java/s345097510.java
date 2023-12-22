import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int ans = sc.nextInt();
    for(int i = 1; i < n; i++) {
      int a = sc.nextInt();
      ans = gcd(ans, a);
    }
    System.out.println(ans);
  }

  public static int gcd(int a, int b) {
    if(b == 0) return a;
    return gcd(b, (a % b));
  }
}