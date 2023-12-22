
import java.util.*;

public class Main {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int N = sc.nextInt();
      int[] p = new int[N];
      int sum = 0;
      for (int i = 0; i < N; i++) {
        int tmp = sc.nextInt();
        p[i] = tmp;
        sum +=tmp;
      }
      Arrays.sort(p);
      sum -= p[N-1]/2;

      System.out.println(sum);
    }
  }
}
