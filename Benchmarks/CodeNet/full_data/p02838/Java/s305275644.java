import java.util.*;
import java.util.function.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long[] A = new long[N];
    for (int i = 0; i < N; i++) {
      A[i] = sc.nextLong();
    }
    sc.close();
    
    long m = 1000000007;
    long ans = 0;
    for (int i = 0; i < 60; i++) {
      long c = 0;
      for (int j = 0; j < N; j++)
        if (((A[j] >>> i) & 1) == 1) c++;
      long a = (c * (N - c)) % m;
      for (int j = 0; j < i; j++) 
        a = (a * 2) % m;
      ans += a;
      ans %= m;
    }
    System.out.println(ans);
  }
}
