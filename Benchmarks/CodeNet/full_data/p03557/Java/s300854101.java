import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int[] a = new int[N];
    int[] b = new int[N];
    int[] c = new int[N];
    for (int i = 0; i < N; i++) a[i] = scanner.nextInt();
    for (int i = 0; i < N; i++) b[i] = scanner.nextInt();
    for (int i = 0; i < N; i++) c[i] = scanner.nextInt();

    Arrays.sort(a);
    Arrays.sort(b);
    Arrays.sort(c);

    int[] bc = new int[N + 1];
    int j = 0;
    for (int i = 0; i < N; i++) {
      while (j < N && c[j] <= b[i]) j++;
      bc[i] = N - j;
    }
    for (int i = N - 1; i > 0; i--) bc[i - 1] += bc[i];

    int total = 0;
    j = 0;
    for (int i = 0; i < N; i++) {
      while (j < N && b[j] <= a[i]) j++;
      total += bc[j];
    }
    System.out.println(total);
  }
}
