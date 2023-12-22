import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] t = new int[n + 1];
    int[] x = new int[n + 1];
    int[] y = new int[n + 1];
    for(int i = 0; i < n; i++) {
      t[i + 1] = sc.nextInt();
      x[i + 1] = sc.nextInt();
      y[i + 1] = sc.nextInt();
    }
    String ans = "Yes";
    for(int i = 0; i < n; i++) {
      int td = t[i + 1] - t[i];
      int xd = Math.abs(x[i + 1] - x[i]);
      int yd = Math.abs(y[i + 1] - y[i]);
      int s = xd + yd;
      if((((s - td) % 2) != 0) || (s > td)) ans = "No";
    }
    System.out.println(ans);
  }
}