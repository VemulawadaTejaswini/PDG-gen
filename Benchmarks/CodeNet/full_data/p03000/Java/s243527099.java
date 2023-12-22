/**
 * 
 */

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
    int n = Integer.parseInt(sc.next());
    long x = Long.parseLong(sc.next());
    int d = 0;

    
    for (int i = 1; i <= n; i++) {
      d += Integer.parseInt(sc.next());
      if (d > x) {
        System.out.println(i);
        return;
      }
    }
  }

}
