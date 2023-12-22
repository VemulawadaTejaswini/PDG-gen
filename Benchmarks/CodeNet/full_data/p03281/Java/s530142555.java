import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    try {
      int n = sc.nextInt();
      int ans = 0;
      for (int i = 1; i <= n; i++) {
        if (i % 2 == 0) continue;
        int cnt = 0;
        for (int j = 1; j <= i; j++) if (i % j == 0) cnt++;
        if (cnt == 8) ans++;
      }
      System.out.println(ans); 
    } finally {
      sc.close();
    }
  }
}
