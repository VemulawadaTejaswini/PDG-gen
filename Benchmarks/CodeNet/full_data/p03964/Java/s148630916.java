import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] T = new long[n];
    long[] A = new long[n];
    T[0] = sc.nextLong();
    A[0] = sc.nextLong();
    for(int i = 1; i < n; i++) {
      long t = sc.nextLong();
      long a = sc.nextLong();
      long k = Math.max(T[i - 1] / t, A[i - 1] / a);
      T[i] = t * k;
      A[i] = a * k;
    }
    System.out.println(T[n - 1] + A[n - 1]);
  }
}
