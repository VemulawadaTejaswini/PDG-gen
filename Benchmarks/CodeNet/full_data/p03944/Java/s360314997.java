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
        startX = Math.max(startX, x[i]);
      } else if (a[i] == 2) {
        endX = Math.min(endX, x[i]);
      } else if (a[i] == 3) {
        startY = Math.max(startY, y[i]);
      } else {
        endY = Math.min(endY, y[i]);
      }
    }

    if (0 < (endX - startX) && 0 < (endY - startY)) {
      ans = (endX - startX) * (endY - startY);
    }

    System.out.println(ans);

  }

}