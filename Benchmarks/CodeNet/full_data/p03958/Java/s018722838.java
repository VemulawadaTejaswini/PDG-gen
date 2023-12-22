import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int K = scanner.nextInt();
    int T = scanner.nextInt();
    int[] a = new int[T];
    int max = 0;
    for (int i = 0; i < T; i++) {
      a[i] = scanner.nextInt();
      max = Math.max(max, a[i]);
    }
    if (max > (K + 1) / 2) {
      System.out.println(max * 2 - K - 1);
    } else {
      System.out.println(0);
    }
  }
}
