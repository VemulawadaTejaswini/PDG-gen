import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int x = sc.nextInt();

    int[] l = new int[n + 1];
    for (int i = 1; i <= n; i++) {
      l[i] = sc.nextInt();
    }

    int d1 = 0;
    int d2 = 0;
    int ans = 0;
    if (l[1] <= x) {
      for (int i = 2; i <= n + 1; i++) {
        ans++;
        d2 = d1 + l[i - 1];
        if (d2 > x) {
          break;
        } else {
          d1 = d2;
        }
      }
    }
    
    System.out.println(ans);
  }
}
