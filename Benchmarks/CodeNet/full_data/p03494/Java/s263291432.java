import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    
    int ans = Integer.MAX_VALUE;
    for (int i = 0; i < N; i++) {
      int a = sc.nextInt();
      int count = 0;
      while (a % 2 == 0) {
        count++;
        a /= 2;
      }
      ans = Math.min(ans, count);
    }
    
    System.out.println(ans == Integer.MAX_VALUE ? 0 : ans);
  }
}