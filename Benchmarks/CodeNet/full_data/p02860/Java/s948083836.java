import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.next();
    sc.close();
    if (N % 2 != 0) {
      System.out.println("No");
    } else {
      String A = S.substring(0, N / 2);
      String B = S.substring((N / 2), N);
      if (A.equals(B)) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
    }
  }
}
