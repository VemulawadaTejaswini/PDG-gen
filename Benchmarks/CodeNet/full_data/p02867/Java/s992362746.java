import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    int count = 0;

    int n = stdIn.nextInt();
    int[] a = new int[n];
    int[] b = new int[n];

    for (int i = 0; i < n; i++) {
      a[i] = stdIn.nextInt();
    }
    for (int i = 0; i < n; i++) {
      b[i] = stdIn.nextInt();
    }

    int x, y;
    for (x = 0; x < n; x++) {
      if (a[x] > b[x]) {
        for (y = 0; y < n; y++) {
          if (a[y] <= a[x] - 1) {
            int c = a[y];
            a[y] = a[x];
            a[x] = c;
          }
          if (a[y] > b[y]) {
            int c = a[y];
            a[y] = a[x];
            a[x] = c;
          } else {
            count++;
            break;
          }
        }
        if (y == n) {
          System.out.println("No");
          break;
        }
      }
    }
    if (count <= n - 2) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }

  }
}
