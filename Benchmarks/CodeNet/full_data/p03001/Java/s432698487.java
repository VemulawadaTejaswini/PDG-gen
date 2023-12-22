
import java.util.Scanner;

/**
 * @author author
 *
 */
public class Main {

  /**
   * @param args
   */
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    long w = Long.parseLong(sc.next());
    long h = Long.parseLong(sc.next());
    long x = Long.parseLong(sc.next());
    long y = Long.parseLong(sc.next());

    int numberOfLine = 0;
    Long area = (w * h) / 2;

    if (x + x == w && y + y == h) {
      numberOfLine = 1;
    }
    System.out.printf("%d.000000 %d\n", area, numberOfLine);

  }

}
