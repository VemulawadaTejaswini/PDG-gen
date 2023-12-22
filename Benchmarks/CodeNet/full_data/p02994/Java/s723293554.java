import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int l = sc.nextInt();

    int min = 300;
    int apl = 0;
    for (int i = 1; i <= n; i++) {
      int t = Math.abs(l + i - 1);
      if (t < min) apl = i;
      min = Math.min(t, min);
    }

    int ans = 0;
    for (int i = 1; i <= n; i++) {
      if (i != apl) ans += l + i - 1;
    }
    
    System.out.println(ans);
  }
}
