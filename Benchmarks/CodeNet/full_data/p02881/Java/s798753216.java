import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    long n = sc.nextLong();

    long a = (long)Math.sqrt(n);
    long ans = 0;
    for (long i = a + 1; i > 0; i--) {
      if (n % i == 0) {
        ans = i + (n / i) - 2;
        break;
      }
    }
    
    System.out.println(ans == 0 ? n - 1 : ans);
  }
}
