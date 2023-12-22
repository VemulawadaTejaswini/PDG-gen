import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int Y = sc.nextInt();
    for (int num10000 = 0; num10000 <= N && num10000 * 10000 <= Y; num10000++) {
      for (int num5000 = 0; num5000 + num10000 <= N && (num10000 * 10000 + num5000 * 5000) <= Y; num5000++) {
        int remainder = Y - (num10000 * 10000 + num5000 * 5000);
        if (remainder % 1000 == 0 && (remainder / 1000) + num10000 + num5000 == N) {
          System.out.println(num10000 + " " + num5000 + " " + remainder / 1000);
          return;
        }
      }
    }
    System.out.println("-1 -1 -1");
  }
}
