
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
    Long w = Long.parseLong(sc.next());
    Long h = Long.parseLong(sc.next());
    Long x = Long.parseLong(sc.next());
    Long y = Long.parseLong(sc.next());

    int numberOfLine = 0;
    Long area = (w * h) / 2;

    if (x * 2 == w && y * 2 == h) {
      numberOfLine = 1;
    }
    System.out.printf("%d.000000 %d\n", area, numberOfLine);

  }

}
