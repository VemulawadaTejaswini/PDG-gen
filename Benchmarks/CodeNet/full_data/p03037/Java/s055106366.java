import java.util.Arrays;
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
    int m = Integer.parseInt(sc.next());

    int[] l = new int[m];
    int[] r = new int[m];
    for (int i = 0; i < m; i++) {
      l[i] = Integer.parseInt(sc.next());
      r[i] = Integer.parseInt(sc.next());
    }

    int min = Arrays.stream(r).min().getAsInt();
    int count = 0;
    for (int j = 0; j < l.length; j++) {
      if (l[j] > min) {
        continue;
      }
      count++;
    }
    System.out.println(count);
  }

}
