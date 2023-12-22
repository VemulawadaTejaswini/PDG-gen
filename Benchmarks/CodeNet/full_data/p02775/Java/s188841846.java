import java.util.*;
import java.math.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String N = sc.next();
    char[] a = N.toCharArray();
    int n = a.length;
    int[][] f = new int[2][2];
    int old = 0;
    int now = 1 - old;
    f[old][0] = a[n - 1] - '0';
    f[old][1] = 6 - (a[n - 1] - '5');
    for(int i = n - 2; i > -1; --i) {
      int cur = Math.min(f[old][0], f[old][1]);
      f[now][0] = cur + (a[i] - '0');
      f[now][1] = Math.min(f[old][1] + ('9' - a[i]), f[old][0] + 6 - (a[i] - '5'));
      int mid = now;
      old = now;
      now = 1 - mid;
    }
    System.out.println(Math.min(f[0][0], f[0][1]));
  }
}
    
