import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    
    long prevT = 0;
    long prevA = 0;
    long ans = 0;
    for (int i = 0; i < N; i++) {
      int T = sc.nextInt();
      int A = sc.nextInt();
      long f = 1;
      if (T < prevT) {
        f = prevT/T + (prevT%T == 0 ? 0 : 1);
      }
      if (A < prevA) {
        long fa = prevA/A + (prevA%A == 0 ? 0 : 1);
        f = Math.max(f,fa);
      }
      
      ans += f*T - prevT + f*A - prevA;
      prevT = f*T;
      prevA = f*A;
    }
    System.out.println(ans);
  }
}