import java.util.Scanner;
import java.util.stream.IntStream;

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
    
    System.out.println(IntStream.range(0, Integer.parseInt(sc.next())).sum());

  }

}
