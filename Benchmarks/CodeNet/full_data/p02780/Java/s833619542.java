import java.util.*;

public class Main {
  public static void main(final String[] args) {
    final Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int[] p = new int[n];
    for (int i = 0; i < n; ++i) {
      p[i] = sc.nextInt();
    }
    sc.close();

    int start = -1;
    int max = -1;
    for (int i = 0; i < n - k + 1; ++i) {
      int tmp = 0;
      for (int j = i; j < k + i; ++j) {
        tmp += p[j];
        if (j == k + i - 1) {
          if (tmp > max) {
            max = tmp;
            start = i;
          }
        }
      }
    }
// System.out.println(start + " ");
// System.out.println(max + " ");
    double exp = 0;
    for (int i = start; i < k + start; ++i) {
// System.out.println(p[i] + " ");
      for (double j = 1; j <= p[i]; ++j) {
        exp += j / p[i];
      }
    }

    System.out.println(exp);
  }
}