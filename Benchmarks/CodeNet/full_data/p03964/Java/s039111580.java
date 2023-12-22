import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    
    long A = 1;
    long B = 1;
    for (int i = 0; i < n; i++) {
      long t = sc.nextInt();
      long a = sc.nextInt();
      long x = Math.max((A + t - 1) / t, (B + a - 1) / a);
      A = x * t;
      B = x * a;
    }

    System.out.println(A + B);
    
  }
}