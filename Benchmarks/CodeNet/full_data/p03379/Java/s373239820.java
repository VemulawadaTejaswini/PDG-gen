import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] x = new int[n];
    int[] rx = new int[n];
    for (int i = 0; i < n; i++) {
      x[i] = sc.nextInt();
      rx[i] = x[i];
    }
    Arrays.sort(rx);
    for (int i = 0; i < n; i++) {
      if (x[i] >= rx[n / 2]) {
        System.out.println(rx[(n - 1) / 2]);
      } else {
        System.out.println(rx[(n - 1) / 2 + 1]);
      }
    }
  }
}
