import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int x = sc.nextInt();
    int n = 0;

    while (true) {
      if ((int)Math.pow(n, 2) > x) {
        break;
      } else {
        n = n + 1;
      }
    }

    System.out.println((int)Math.pow(n-1, 2));
  }
}
