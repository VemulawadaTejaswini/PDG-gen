import java.util.Arrays;
import java.util.Scanner;

class Main {

  public static int calc(int[] x, int step) {
    int sum = 0;
    for (int i = 0; i < x.length - 1; i++) {
      if (x[i] + step >= x[i + 1]) {
        sum += x[i + 1] - x[i];
      }
    }
    return sum;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();
    int[] x = new int[m];
    int[] d = new int[m - 1];
    for (int i = 0; i < m; i++) {
      x[i] = scanner.nextInt();
    }
    scanner.close();
    Arrays.sort(x);
    for (int i = 0; i < m - 1; i++) {
      d[i] = x[i + 1] - x[i];
    }
    Arrays.sort(d);
    if (d.length == 0) {
      System.out.println(0);
      return;
    }
    for (int i = 0; i < d.length; i++) {
      int step = d[i];
      int count = 1;
      for (int j = 0; j < x.length - 1; j++) {
        if (x[j] + step < x[j + 1]) {
          count++;
        }
      }
      if (count <= n) {
        System.out.println(calc(x, step));
        return;
      }
    }
  }

}
