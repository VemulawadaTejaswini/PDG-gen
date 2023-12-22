import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] d = new int[n];
    int ans = 0;
    
    for (int i = 0; i < n; i++) {
      d[i] = sc.nextInt();
      for (int j = 0; j < i; j++) {
        ans += d[j] * d[i];
      }
    }
    
    System.out.println(ans);
  }
}
