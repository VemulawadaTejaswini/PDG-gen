import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int N = in.nextInt();

    int ans = 0;
    for (int i = 1; i <= N; i += 2) {
      int count = 0;
      for (int j = 1; j <= Math.sqrt(i); j++) {
        if (i % j == 0) {
          count += 2;
        }
      }
      if (count == 8) {
        ans++;
      }
    }
    System.out.println(ans);
  }
}