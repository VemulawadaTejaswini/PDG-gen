import java.util.*;
import java.math.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int w = sc.nextInt();
    int h = sc.nextInt();
    int n = sc.nextInt();

    int[] x = new int[n];
    int[] y = new int[n];
    int[] a = new int[n];

    for (int i = 0; i < n; i++) {
      x[i] = sc.nextInt();
      y[i] = sc.nextInt();
      a[i] = sc.nextInt();
    }

    int x1 = 0;
    int x2 = w;
    int y3 = 0;
    int y4 = h;

    for (int i = 0; i < n; i++) {
      if (a[i] == 1) x1 = Math.max(x1,x[i]);
      if (a[i] == 2) x2 = Math.min(x2,x[i]);
      if (a[i] == 3) y3 = Math.max(y3,y[i]);
      if (a[i] == 4) y4 = Math.min(y4,y[i]);
    }

    int ans = (x2-x1)*(y4-y3);
    if (ans <= 0) {
      System.out.println(0);
    } else {
      System.out.println(ans);
    }

  }

}
