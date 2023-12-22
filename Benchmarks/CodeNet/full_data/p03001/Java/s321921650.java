
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
    int w = Integer.parseInt(sc.next());
    int h = Integer.parseInt(sc.next());
    int x = Integer.parseInt(sc.next());
    int y = Integer.parseInt(sc.next());

    int numberOfLine = 0;
    float area = (w * h) / 2f;

    if (x + x == w && y + y == h) {
      numberOfLine = 1;
    }
    System.out.printf("%f %d\n", area, numberOfLine);

  }

}
