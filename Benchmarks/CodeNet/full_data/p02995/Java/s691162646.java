
import java.util.Scanner;
import java.util.stream.LongStream;

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
    long a = Long.parseLong(sc.next());
    long b = Long.parseLong(sc.next());
    long c = Long.parseLong(sc.next());
    long d = Long.parseLong(sc.next());

    System.out
        .println(
            LongStream.range(a, b + 1).filter(i -> i % c != 0).filter(i -> i % d != 0).count());
  }

}
