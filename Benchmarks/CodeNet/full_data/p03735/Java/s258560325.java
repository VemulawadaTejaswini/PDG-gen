import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
public class Main {
  public static void main(String[] args) {
    Main m = new Main();
    m.run();
  }
  private void run() {
    int n = 0;
    Ball[] b = new Ball[0];
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
      n = Integer.parseInt(br.readLine());
      b = new Ball[n];
      for (int i=0;i<n;i++) {
        String[] s = br.readLine().split("\\s+");
        long x = Long.parseLong(s[0]);
        long y = Long.parseLong(s[1]);
        b[i] = x < y ? new Ball(x,y) : new Ball(y,x);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    if (n == 1) {
      System.out.println(0);
      System.exit(0);
    }
    long rmin = 1000000001L;
    long rmax = 0L;
    long bmin = 1000000001L;
    long bmax = 0L;
    for (Ball a : b) {
      if (rmin > a.x) rmin = a.x;
      if (rmax < a.x) rmax = a.x;
      if (bmin > a.y) bmin = a.y;
      if (bmax < a.y) bmax = a.y;
    }
    long m = (rmax-rmin)*(bmax-bmin);
    Arrays.sort(b,Comparator.comparingLong(a -> ((Ball)a).x));
    bmin = rmin;
    long d = 1000000001L;
    long xmin = b[1].x;
    long ymin = b[0].y;
    for (int i=0;i<n-1;i++) {
      xmin = b[i+1].x;
      if (ymin > b[i].y) ymin = b[i].y;
      if (rmax < b[i].y) rmax = b[i].y;
      rmin = Math.min(xmin,ymin);
      if (d > rmax-rmin) d = rmax-rmin;
    }
    if (m > d*(bmax-bmin)) m = d*(bmax-bmin);
    System.out.println(m);
  }
  private class Ball {
    private long x,y;
    Ball(long x,long y) {
      this.x = x;
      this.y = y;
    }
  }
}