import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    
    int prevT = 0;
    int prevA = 0;
    long ans = 0;
    for (int i = 0; i < N; i++) {
      int T = sc.nextInt();
      int A = sc.nextInt();
      int f = 1;
      while (f*T < prevT || f*A < prevA) {
        f++;
      }
      ans += f*T - prevT + f*A - prevA;
      prevT = f*T;
      prevA = f*A;
    }
    System.out.println(ans);
  }
}