
import java.util.Scanner;

public class Main {
  public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.next();

    if (N % 2 == 1) {
      System.out.println("No");
      sc.close();
      return;
    }

    String S1 = S.substring(0, N / 2);
    String S2 = S.substring(N / 2);

    if (S1.equals(S2)) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
    sc.close();
  }
}
