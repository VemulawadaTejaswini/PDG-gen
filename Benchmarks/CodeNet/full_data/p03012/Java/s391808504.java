import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] w = new int[n];
    for(int i = 0; i < n; i++) {
      w[i] = sc.nextInt();
    }
    int[] s = new int[n];
    s[0] = w[0];
    for(int i = 1; i < n; i++) {
      s[i] = s[i - 1] + w[i];
    }
    int ans = 1000000;
    for(int i = 0; i < n - 1; i++) {
      int a = s[i];
      int b = s[n - 1] - a;
      ans = Math.min(ans, (int)Math.abs(a - b));
    }
    System.out.println(ans);
  }
}
