import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int W = sc.nextInt();
    int H = sc.nextInt();
    int N = sc.nextInt();
    int[] x = new int[N];
    int[] y = new int[N];
    int[] a = new int[N];

    for (int i = 0; i < N; i++) {
      x[i] = sc.nextInt();
      y[i] = sc.nextInt();
      a[i] = sc.nextInt();
    }

    sc.close();

    int ans = 0;

    int startX = 0;
    int startY = 0;
    int endX = W;
    int endY = H;

    for (int i = 0; i < N; i++) {
      if (a[i] == 1) {
        startX = x[i];
      } else if (a[i] == 2) {
        endX = x[i];
      } else if (a[i] == 3) {
        startY = y[i];
      } else {
        endY = y[i];
      }
    }

    ans = (endX - startX) * (endY - startY);

    if (0 < ans) {
      System.out.println(ans);
    } else {
      System.out.println(0);
    }

  }

}