import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    int l = sc.nextInt();
    int r = sc.nextInt();
    
    int ans = 2019;
    LABEL:for (int i = l; i < r; i++) {
      for (int j = l + 1; j <= r; j++) {
        ans = Math.min(ans, (i * j) % 2019);
        if (ans == 0) break LABEL;
      }
    }
    
    System.out.println(ans);
  }
}
