
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
    int p = Integer.parseInt(sc.next());
    int q = Integer.parseInt(sc.next());
    int r = Integer.parseInt(sc.next());
    
    System.out.println(p + r + q -  Math.max(p,Math.max(q,r)));
  }

}
