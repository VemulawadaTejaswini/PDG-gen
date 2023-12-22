import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    int count = 0;
    boolean flag1 = false;
    boolean flag2 = false;

    int n = stdIn.nextInt();
    int[] a = new int[n];
    int[] b = new int[n];

    for (int i = 0; i < n; i++) {
      a[i] = stdIn.nextInt();
    }
    for (int i = 0; i < n; i++) {
      b[i] = stdIn.nextInt();
    }

    for (int i = 0; i < n; i++) {
      if (a[i] > b[i]) {
        for (int j = i + 1; j < n; j++) {
          if (a[j] <= a[i] - 1) {
            int c = a[j];
            a[j] = a[i];
            a[i] = c;
            count++;
            flag1 = true;
            break;
          }
        }
        if (!flag1) {
          for (int k = 0; k < n; k++) {
            if (a[i] < b[k]) {
              int c = a[i];
              a[i] = a[k];
              a[k] = c;
            }
            if (a[i] <= b[i] && a[k] <= b[k]) {
              count++;
              flag2 = true;
              break;
            } else {
              int c = a[i];
              a[i] = a[k];
              a[k] = c;
            }
          }
          if (!flag2) {
            System.out.println("No");
            break;
          }
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
