import java.util.Arrays;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    final Scanner scanner = new Scanner(System.in);
    final int n = scanner.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = scanner.nextInt();
    }
    Arrays.sort(a);
    final int m = a[n - 1];
    int i = Arrays.binarySearch(a, m / 2);
    if (i > 0) {
      System.out.println(m + " " + i);
    } else {
      int j = -(i + 1);
      int k = j - 1;
      if (j >= n || j == n - 1) {
        System.out.println(m + " " + a[k]);
        return;
      }
      if (k < 0) {
        System.out.println(m + " " + a[j]);
        return;
      }
      if (a[j] - m / 2 > m / 2 - a[k]) System.out.println(m + " " + a[k]);
      else System.out.println(m + " " + a[j]);
    }
  }
}
