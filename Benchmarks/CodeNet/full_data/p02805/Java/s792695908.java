import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in Actual solution is at the top
 *
 * @author Silviase
 */
public class Main {

  public static void main(String[] args) {
    InputStream inputStream = System.in;
    OutputStream outputStream = System.out;
    Scanner in = new Scanner(inputStream);
    PrintWriter out = new PrintWriter(outputStream);
    ABC151F solver = new ABC151F();
    solver.solve(1, in, out);
    out.close();
  }

  static class ABC151F {

    public void solve(int testNumber, Scanner in, PrintWriter out) {
      Geometry g = new Geometry();
      int n = in.nextInt();
      Coordinate[] poi = new Coordinate[n];
      for (int i = 0; i < n; i++) {
        double x = in.nextDouble();
        double y = in.nextDouble();
        poi[i] = new Coordinate(x, y);
      }

      double res = g.minimumBoundingCircle(n, poi);
      out.println(res);

    }

  }

  static class Coordinate {

    double x;
    double y;

    Coordinate() {
      this.x = 0;
      this.y = 0;
    }

    Coordinate(double x, double y) {
      this.x = x;
      this.y = y;
    }

    Coordinate midPoint(Coordinate c) {
      return new Coordinate((this.x + c.x) / 2, (this.y + c.y) / 2);
    }

    public String toString() {
      return "c:" + this.x + " " + this.y;
    }

  }

  static class Geometry {

    double dist(Coordinate c1, Coordinate c2) {
      return Math.sqrt((c1.x - c2.x) * (c1.x - c2.x) + (c1.y - c2.y) * (c1.y - c2.y));
    }

    double distSquare(Coordinate c1, Coordinate c2) {
      return (c1.x - c2.x) * (c1.x - c2.x) + (c1.y - c2.y) * (c1.y - c2.y);
    }

    Coordinate circumcenter(Coordinate c1, Coordinate c2, Coordinate c3) {
      Coordinate res = new Coordinate();
      double d1 = distSquare(c2, c3);
      double d2 = distSquare(c3, c1);
      double d3 = distSquare(c1, c2);
      // System.out.println(d1 + " " + d2 + " " + d3);

      final double v = (d1 * (d2 + d3 - d1))
          + (d2 * (d3 + d1 - d2))
          + (d3 * (d1 + d2 - d3));
      if (v == 0) {
        return new Coordinate(-1919810, -364364);
      }
      res.x = ((d1 * (d2 + d3 - d1) * c1.x)
          + (d2 * (d3 + d1 - d2) * c2.x)
          + (d3 * (d1 + d2 - d3) * c3.x))
          / v;
      res.y = (d2 * (d3 + d1 - d2) * c2.y
          + d1 * (d2 + d3 - d1) * c1.y
          + d3 * (d1 + d2 - d3) * c3.y)
          / v;
      return res;
    }

    public double minimumBoundingCircle(int n, Coordinate[] points) {
      // 3点を選んだ時の三角形の外心,もしくは2点を選んだ際の直径である
      double r = 1.145141919810364364e20;
      for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
          for (int k = 0; k < n; k++) {
            Coordinate circumCenter;
            // System.out.println("r: " + i + " " + j + " " + k);

            if (k == i || k == j) {
              circumCenter = points[i].midPoint(points[j]);
            } else {
              circumCenter = circumcenter(points[i], points[j], points[k]);
              // System.out.println(circumCenter.toString());
            }
            double tmpRadius = dist(circumCenter, points[i]);
            // System.out.println("tmpRadius:" + tmpRadius);
            boolean canBoundAll = true;
            for (int l = 0; l < n; l++) {
              if (dist(circumCenter, points[l]) > tmpRadius + 1e-9) {
                canBoundAll = false;
                break;
              }
            }

            // System.out.println("canBoundAll: " + canBoundAll);
            if (canBoundAll) {
              r = Math.min(r, tmpRadius);
            }
          }
        }
      }

      return r;
    }

  }
}

