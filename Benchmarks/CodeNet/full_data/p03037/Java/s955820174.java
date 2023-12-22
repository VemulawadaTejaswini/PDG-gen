
import java.util.*;

public class Main {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int N = sc.nextInt();// card
      int M = sc.nextInt();// gate
      int l = 0, r = N;

      for (int i = 0; i < M; i++) {
        l = Math.max(l, sc.nextInt());
        r = Math.min(r, sc.nextInt());
      }

      int ans = r >= l ? (r - l + 1) : 0 ;
      System.out.println(ans);
    }
  }
}
