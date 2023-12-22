import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int n = s.nextInt();
    int[] p = new int[n];
    for (int i = 0; i < n; i++) {
      p[i] = s.nextInt();
    }

    int[] count = new int[n+1];
    Arrays.fill(count, 0);
    for (int i = 0; i < n; i++) {
      count[p[i]] = count[p[i]-1]+1;
    }

    int maxCount = 0;
    for (int i = 0; i < n; i++) {
      maxCount = Math.max(maxCount, count[i]);
    }
    System.out.println(n - maxCount);
  }
}
