import java.util.*;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int K = sc.nextInt();
    int X = sc.nextInt();
    sc.close();
    if (500 * K >= X) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
