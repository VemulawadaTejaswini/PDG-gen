import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] b = new int[n];

    for (int i = 1; i < n; i++) {
      b[i] = sc.nextInt();
    }

    int ans = 0;
    for (int i = 1; i <= n; i++) {
      int x = 0;
      int y = 0;
      if (i == 1) {
        x = b[i];
        y = b[i+1];
      } else if (i == n - 1) {
        x = b[i-1];
        y = b[i];
      } else if (i == n) {
        x = b[i-1];
        y = b[i-1];
      } else {
        x = Math.min(b[i-1], b[i]);
        y = b[i+1];
      }
      ans += Math.min(x, y);
    }
    
    System.out.println(ans);
  }
}
