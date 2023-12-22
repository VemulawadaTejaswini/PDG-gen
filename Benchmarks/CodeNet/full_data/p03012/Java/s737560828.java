import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] w = new int[n + 1];

    int sum = 0;
    for (int i = 1; i <= n; i++) {
      w[i] = sc.nextInt();
      sum += w[i];
    }

    int s1 = 0;
    int s2 = 0;
    int ans = sum;
    for (int i = 1; i <= n; i++) {
      s1 += w[i];
      s2 = sum - s1;
      ans = Math.min(ans, Math.abs(s2 - s1));
    }
    
    System.out.println(ans);
  }
}
