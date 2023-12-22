import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int t = sc.nextInt();
    int a = sc.nextInt();
    int ans = 0;
    int sa = 1000000;
    for(int i = 0; i < n; i++) {
      int h = sc.nextInt();
      int s = Math.abs(a - (t - h * 0.006));
      if(s < sa) {
        sa = s;
        ans = (i + 1);
      }
    }
    System.out.println(ans);
  }
}