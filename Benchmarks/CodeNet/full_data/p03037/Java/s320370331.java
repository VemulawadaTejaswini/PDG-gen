import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();

    int lo = 1, hi = n;

    for (int i = 0; i < m; ++i) {
      int l = sc.nextInt();
      int r = sc.nextInt();

      lo = (l > lo) ? l : lo;
      hi = (r < hi) ? r : hi;
    }

    System.out.println(Math.max(0, hi - lo + 1));
  }
}