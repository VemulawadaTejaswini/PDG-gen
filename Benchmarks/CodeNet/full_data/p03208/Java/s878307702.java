import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int[] h = new int[n];
    for(int i = 0; i < n; i++) {
      h[i] = sc.nextInt();
    }
    Arrays.sort(h);
    int ans = (int)Math.pow(10, 9);
    for(int i = k - 1; i < n; i++) {
      ans = Math.min(ans, h[i] - h[i - k + 1]);
    }
    System.out.println(ans);
  }
}