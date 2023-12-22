import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int Z = scanner.nextInt();
    int W = scanner.nextInt();

    int[] a = new int[N];
    for (int i = 0; i < N; i++) a[i] = scanner.nextInt();

    int b1 = Math.abs(W - a[N - 1]);
    int b2 = N > 1 ? Math.abs(a[N - 1] - a[N - 2]) : 0;
    System.out.println(Math.max(b1, b2));
  }
}
