import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long T = sc.nextLong();
    long ans = T;
    long last = T;
    for(int i = 0; i < N; i++) {
      long t = sc.nextLong();
      if(i > 0) {
        if(last > t) {
          ans += t;
          last += t;
        } else {
          ans += T;
          last = t + T;
        }
      }
    }
    System.out.println(ans);
  }
}
