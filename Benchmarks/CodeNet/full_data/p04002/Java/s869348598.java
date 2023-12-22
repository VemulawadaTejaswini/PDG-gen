import java.util.*;

class Point {
  int a, b;
  Point (int a, int b) {
    this.a = a;
    this.b = b;
  }

  public int hashCode() {
    return 3*a + b;
  }

  public boolean equals(Object object) {
    Point point = (Point)object;
    return this.a == point.a && this.b == point.b;
  }
}

public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int h = s.nextInt();
    int w = s.nextInt();
    int n = s.nextInt();
    HashSet<Point> check = new HashSet<Point>();
    HashSet<Point> black = new HashSet<Point>();
    for (int i = 0; i < n; i++) {
      int a = s.nextInt() - 1;
      int b = s.nextInt() - 1;
      black.add(new Point(a, b));
      for (int da = Math.max(0, a - 2); da <= Math.min(h - 3, a); da++) {
        for (int db = Math.max(0, b - 2); db <= Math.min(w - 3, b); db++) {
          check.add(new Point(da, db));
        }
      }
    }
    int[] output = new int[10];
    for (Point p : check) {
      int count = 0;
      for (int da = 0; da < 3; da++) {
        for (int db = 0; db < 3; db++) {
          if (black.contains(new Point(p.a + da, p.b + db))) {
            count++;
          }
        }
      }
      output[count]++;
    }
    System.out.println((long)(h - 2) * (long)(w - 2) - check.size());
    for (int i = 1; i < output.length; i++) {
      System.out.println(output[i]);
    }
  }
}
