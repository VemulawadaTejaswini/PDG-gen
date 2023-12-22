import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    double[] x = new double[n];
    double[] y = new double[n];
    for(int i = 0; i < n; i++) {
      x[i] = sc.nextDouble();
      y[i] = sc.nextDouble();
    }
    double ans = 0;
    double left = 0;
    double right = 2000;
    for(int q = 0; q < 50; q++) {
      double med = (left + right) / 2;
      int p = 0;
      for(int i = 0; i < n - 1; i++) {
        for(int j = i + 1; j < n; j++) {
          double t = (x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]);
          if(t <= (4 * med * med)) {
            double tx = (x[i] + x[j]) / 2;
            double ty = (y[i] + y[j]) / 2;
            double d = (med * med) - ((tx - x[i]) * (tx - x[i]) + (ty - y[i]) * (ty - y[i]));
            d = (double)Math.sqrt(d);
            double x1 = 0;
            double y1 = 0;
            double x2 = 0;
            double y2 = 0;
            if(y[i] == y[j]) {
              x1 = tx;
              x2 = tx;
              y1 = ty + d;
              y2 = ty - d;
            } else if(x[i] == x[j]) {
              y1 = ty;
              y2 = ty;
              x1 = tx + d;
              x2 = tx - d;              
            } else {
              double s = (x[j] - x[i]) / (y[i] - y[j]);
              double s1 = (double)Math.sqrt(1 + s * s);
              double m = d / s1;
              double dx = m;
              double dy = (s * dx);
              double ddx = ((-1) * m);
              double ddy = (s * ddx);
              x1 = tx + dx;
              x2 = tx + ddx;
              y1 = ty + dy;
              y2 = ty + ddy;
            }

            int p1 = 0;
            int p2 = 0;

            for(int k = 0; k < n; k++) {
              double t1 = (x1 - x[k]) * (x1 - x[k]) + (y1 - y[k]) * (y1 - y[k]);
              double t2 = (x2 - x[k]) * (x2 - x[k]) + (y2 - y[k]) * (y2 - y[k]);
              if(t1 > (med * med)) p1++;
              if(t2 > (med * med)) p2++;
            }

            if((p1 == 0) || (p2 == 0)) p++;
          }
        }
      }
      if(p == 0) {
        left = med;
      } else {
        right = med;
      }
      ans = med;
    }
    System.out.println(ans);
  }
}
