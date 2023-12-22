
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
    long a = Long.parseLong(sc.next());
    long b = Long.parseLong(sc.next());
    long c = Long.parseLong(sc.next());
    long d = Long.parseLong(sc.next());

 //   System.out
 //       .println(
 //           LongStream.range(a, b + 1).filter(i -> i % c != 0 && i % d != 0).count());
 // }
    int count = 0;
    for (int i = 1; i <= b; i++) {
      if(i % c == 0 || i % d == 0) {
        continue;
      }else {
        count ++;
      }
    }
    System.out.println(count);
  }
}
