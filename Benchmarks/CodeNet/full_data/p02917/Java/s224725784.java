import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] b = new int[n+1];

    for (int i = 1; i < n; i++) {
      b[i] = sc.nextInt();
    }

    b[n] = b[n-1];
    
    int ans = b[1];
    for (int i = 2; i <= n; i++) {
      ans += Math.min(b[i-1], b[i]);
    }
    
    System.out.println(ans);
  }
}
