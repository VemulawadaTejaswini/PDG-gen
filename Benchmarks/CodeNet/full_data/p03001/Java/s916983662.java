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
    float w = Float.parseFloat(sc.next());
    float h = Float.parseFloat(sc.next());
    float x = Float.parseFloat(sc.next());
    float y = Float.parseFloat(sc.next());

    int numberOfLine = 0;
    float area = (w * h) / 2f;

    if (x + x == w && y + y == h) {
      numberOfLine = 1;
    }
    System.out.printf("%f %d\n", area, numberOfLine);

  }

}
