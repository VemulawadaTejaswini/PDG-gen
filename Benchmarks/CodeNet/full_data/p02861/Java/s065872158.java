import java.awt.*;
import java.util.Scanner;

public class Main {
  private static void solve(int n, Point[] points) {
    int multi = 1;
    for (int i = 1; i <= n - 1; i++) multi *= i;
    double allSum = 0;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (i == j) continue;
        double distance = Math.hypot(
          points[i].getX() - points[j].getX(),
          points[i].getY() - points[j].getY());
        allSum += distance * multi;
      }
    }
    System.out.println(allSum / (multi * n));
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    Point[] points = new Point[n];
    for (int i = 0; i < n; i++) {
      points[i] = new Point();
      points[i].setLocation(sc.nextInt(), sc.nextInt());
    }
    sc.close();
    solve(n, points);
  }
}