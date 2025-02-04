import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int t = sc.nextInt();
    int ans = 2000;
    for(int i = 0; i < n; i++) {
      int c = sc.nextInt();
      int time = sc.nextInt();
      if(time <= t) ans = Math.min(ans, c);
    }
    if(ans < 2000) {
      System.out.println(ans);
    } else {
      System.out.println("TLE");
    }
  }
}