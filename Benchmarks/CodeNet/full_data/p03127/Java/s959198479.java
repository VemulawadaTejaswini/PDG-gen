import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long g = 0;
    for (int i = 0; i < N; i++) {
      long A = sc.nextLong();
      g = GCD(g, A);
    }
    sc.close();
    System.out.println(g);
  }

  public static long GCD(long a, long b) {
    if (b == 0) {
      return a;
    }
    return GCD(b, a % b);
  }
}
