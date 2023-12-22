import java.util.*;
import java.util.Collections;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    if (N == 1) {
      System.out.println(1);
    } else {
      long L0 = 2;
      long L1 = 1;
      long ans = 0;
      for (long i = 2; i <= N; i++) {
        ans = L0 + L1;
        L0 = L1;
        L1 = ans;
      }
      System.out.println(ans);
    }
  }
}
