import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int L = scanner.nextInt();
    int[] a = new int[N];
    for (int i = 0; i < N; i++) a[i] = scanner.nextInt();

    int last = -1;
    for (int i = 0; i < N - 1; i++) {
      if (a[i] + a[i + 1] >= L) last = i;
    }
    if (last < 0) {
      System.out.println("Impossible");
      return;
    }
    System.out.println("Possible");
    for (int i = 0; i < last; i++) System.out.println(i + 1);
    for (int i = N - 2; i > last; i--) System.out.println(i + 1);
    System.out.println(last + 1);
  }
}
