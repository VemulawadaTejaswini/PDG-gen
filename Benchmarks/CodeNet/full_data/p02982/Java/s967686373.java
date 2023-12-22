import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.IntStream;

public class Main {

  static Set<Long> squareNumber = new HashSet<>();

  static {
    int max = 40 * 40 * 10;
    for (int i = 0; i < max; i++) {
      long pow = i * i;
      squareNumber.add(pow);
      if (pow > max) {
        break;
      }
    }
  }

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }


  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int n = Integer.parseInt(sc.next());
    int d = Integer.parseInt(sc.next());
    sc.nextLine();
    List<Point> points = new ArrayList<>();
    int result = 0;
    for (int i = 0; i < n; i++) {
      Point pointN = Point.of(d, sc.nextLine());
      result += points.stream().filter(p -> p.isIntegerDistance(pointN)).count();
      points.add(pointN);
    }
    pw.println(result);
  }

  static class Point {

    int d;
    int x[];

    Point(int d, int[] x) {
      this.d = d;
      this.x = x;
    }

    static Point of(int d, String line) {
      return new Point(d,
        Arrays.stream(line.split(" ", -1)).map(Integer::parseInt).mapToInt(Integer::intValue)
          .toArray());
    }

    boolean isIntegerDistance(Point other) {
      long powDistance = (int) IntStream.range(0, d)
        .mapToLong(i -> (this.x[i] - other.x[i]) * (this.x[i] - other.x[i])).sum();
      return squareNumber.contains(powDistance);
    }
  }
}
