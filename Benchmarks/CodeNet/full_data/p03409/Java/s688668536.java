import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    List<Point> red = new ArrayList<>();
    List<Point> blue = new ArrayList<>();
    for (int i=0; i<N; i++) {
      red.add(new Point(sc.nextInt(), sc.nextInt()));
    }
    for (int i=0; i<N; i++) {
      blue.add(new Point(sc.nextInt(), sc.nextInt()));
    }
    red.sort(Comparator.comparingInt(a -> a.y));
    blue.sort(Comparator.comparingInt(a -> a.x));
    int ans = 0;
    for (int i=0; i<N; i++) {
      Point blueI = blue.get(i);
      for (int j=red.size()-1; j>=0; j--) {
        Point redJ = red.get(j);
        if (redJ.x < blueI.x && redJ.y < blueI.y) {
          ans++;
          red.remove(redJ);
          break;
        }
      }
    }
    System.out.println(ans);
  }
  
  static class Point {
    int x;
    int y;
    Point (int x, int y) {
      this.x = x;
      this.y = y;
    }
  }
}
