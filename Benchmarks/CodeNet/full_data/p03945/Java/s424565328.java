import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int W = sc.nextInt();
    int H = sc.nextInt();
    int N = sc.nextInt();
    int xmin = 0;
    int xmax = W;
    int ymin = 0;
    int ymax = H;
    for(int i = 0; i < N; i++) {
      int x = sc.nextInt();
      int y = sc.nextInt();
      int a = sc.nextInt();
      if(a == 1) xmin = Math.max(xmin, x);
      if(a == 2) xmax = Math.min(xmax, x);
      if(a == 3) ymin = Math.max(ymin, y);
      if(a == 4) ymax = Math.min(ymax, y);
    }
    int ans = Math.max(0, xmax - xmin) * Math.max(0, ymax - ymin);
    System.out.println(ans);
  }
}