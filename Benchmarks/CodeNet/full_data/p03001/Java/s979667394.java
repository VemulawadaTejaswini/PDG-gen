
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
    Double w = Double.parseDouble(sc.next());
    Double h = Double.parseDouble(sc.next());
    Double x = Double.parseDouble(sc.next());
    Double y = Double.parseDouble(sc.next());

    int numberOfLine = 0;
    Double area = (w * h) / 2;

    if (x * 2 == w && y * 2 == h) {
      numberOfLine = 1;
    }
    System.out.println(area + " " + numberOfLine);

  }

}
