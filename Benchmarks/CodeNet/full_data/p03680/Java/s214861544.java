import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int[] a = new int[N];
    for (int i = 0; i < N; i++) a[i] = scanner.nextInt() - 1;
    int next = 0;
    for (int cnt = 1; cnt <= N; cnt++) {
      next = a[next];
      if (next == 1) {
        System.out.println(cnt);
        return;
      }
    }
    System.out.println(-1);
  }
}
