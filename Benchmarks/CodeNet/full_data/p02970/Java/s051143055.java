import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int d = sc.nextInt();

    int ans = 0;
    int cnt = 0;
    for (int i = 0; i < n; i++) {
      cnt++;
      if (cnt == d + 1) {
        ans++;
        cnt = -d;
      }
    }

    if (cnt > 0) ans++;
    
    System.out.println(ans);
  }
}
