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

    int h = sum / 2;

    int s = 0;
    int ans = 0;
    for (int i = 1; i <= n; i++) {
      s += w[i];
      if (s >= h) {
        break;
      }
    }
    
    System.out.println(Math.abs(s - (sum - s)));
  }
}
