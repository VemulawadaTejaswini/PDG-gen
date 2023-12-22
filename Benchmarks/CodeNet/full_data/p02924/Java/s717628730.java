
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
    int[] h = new int[n];
    for (int i = 0; i < n; i++) {
      h[i] = Integer.parseInt(sc.next());
    }

    int returnMax = 0;
    int count = 0;
    for (int i = 0; i < n - 1; i++) {
      int leftPoint = i;
      count = 0;
      for (int j = i + 1; j < n; j++) {
        if (h[leftPoint] >= h[j]) {
          leftPoint = j;
          count++;
          if (returnMax < count) {
            returnMax = count;
            if (returnMax >= (n - i)) {
              break;
            }
          }
        } else {
          break;
        }
      }
      if (returnMax >= (n - i)) {
        break;
      }
    }
    System.out.println(returnMax);
  }
}