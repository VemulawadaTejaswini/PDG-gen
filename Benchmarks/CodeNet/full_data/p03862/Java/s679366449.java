import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int x = sc.nextInt();
    
    long ans = 0;
    int prev = sc.nextInt();
    if (prev > x) {
      int diff = prev - x;
      ans += diff;
      prev -= diff;
    }
    for (int i = 2; i <= N; i++) {
      int a = sc.nextInt();
      if (prev+a >= x) {
        int diff = prev+a - x;
        ans += diff;
        prev = a - diff;
      } else {
        prev = a;
      }
    }
    
    System.out.println(ans);
  }
}