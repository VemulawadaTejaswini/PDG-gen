import java.awt.*;
import java.util.Scanner;

public class Main {
  private  static double getDistance(Point p) {
    return Math.sqrt(p.getX() * p.getX() + p.getY() * p.getY());
  }
  private static void solve(int n, Point[] points) {
    Point area1 = new Point();
    Point area2 = new Point();
    Point area3 = new Point();
    Point area4 = new Point();
    for (Point p : points) {
      if (p.x >= 0 && p.y >= 0) {
        area1.translate(p.x, p.y);
      }
      if (p.x <= 0 && p.y >= 0){
        area2.translate(p.x, p.y);
      }
      if (p.x <= 0 && p.y <= 0) {
        area3.translate(p.x, p.y);
      }
      if (p.x >= 0 && p.y <= 0) {
        area4.translate(p.x, p.y);
      }
    }
    double max = 0.0D;
    max = Math.max(max, getDistance(area1));
    max = Math.max(max, getDistance(area2));
    max = Math.max(max, getDistance(area3));
    max = Math.max(max, getDistance(area4));
    System.out.println(max);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    Point[] points = new Point[n];
    for (int i = 0; i < n; i++) {
      String[] ps = sc.nextLine().split(" ");
      points[i] = new Point();
      points[i].setLocation(Integer.parseInt(ps[0]), Integer.parseInt(ps[1]));
    }
    sc.close();
    solve(n, points);
  }
}
