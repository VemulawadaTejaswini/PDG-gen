import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int d = sc.nextInt();
    long x = sc.nextLong();
    ans = x;
    for(int i = 0; i < n; i++) {
      long a = sc.nextLong();
      long t = (d + 1) / a;
      long r = ((d + 1) % a);
      ans += t;
      if(r == 0) {
        
      } else {
        ans++;
      }
      if(a == 1) ans--;
    }
    System.out.println(ans);
  }
}