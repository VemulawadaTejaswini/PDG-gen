import java.util.*;

public class Main {

  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {

    int N = sc.nextInt();

    double ans = 0;

    for (int i=0; i<N; i++) {
      String val = sc.next();
      if (sc.next().equals("JPY")) {
        ans += Integer.parseInt(val);
      } else {
        ans += 380000.0 * Double.parseDouble(val);
      }
    }

    System.out.println(ans);

  }

}