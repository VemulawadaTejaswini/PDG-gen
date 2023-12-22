import java.util.Scanner;

class Main {
  static void swap(int[] a, int idx1, int idx2) {
    int t = a[idx1];
    a[idx1] = a[idx2];
    a[idx2] = t;
  }

  static void quickSort(int[] a, int left, int right) {
    int pl = left;
    int pr = right;
    int x = a[(pl + pr) / 2];

    do {
      while (a[pl] < x) {
        pl++;
      }
      while (a[pr] > x) {
        pr--;
      }
      if (pl <= pr) {
        swap(a, pl++, pr--);
      }
    } while (pl <= pr);

    if (left < pr) {
      quickSort(a, left, pr);
    }
    if (pl < right) {
      quickSort(a, pl, right);
    }
  }

  static void quickSortPlus(int[] a, int[] b, int left, int right) {
    int pl = left;
    int pr = right;
    int x = a[(pl + pr) / 2];

    do {
      while (a[pl] < x) {
        pl++;
      }
      while (a[pr] > x) {
        pr--;
      }
      if (pl <= pr) {
        swap(a, pl++, pr--);
        swap(b, pl++, pr--);
      }
    } while (pl <= pr);

    if (left < pr) {
      quickSortPlus(a, b, left, pr);
    }
    if (pl < right) {
      quickSortPlus(a, b, pl, right);
    }
  }

  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    int count = 0;
    boolean ans = true;

    int n = stdIn.nextInt();
    int[][] a = new int[3][n];
    for (int i = 0; i < n; i++) {
      a[0][i] = stdIn.nextInt();
      a[2][i] = a[0][i];
    }
    for (int i = 0; i < n; i++) {
      a[1][i] = stdIn.nextInt();
    }

    quickSortPlus(a[1], a[0], 0, n-1);
    quickSort(a[2], 0, n-1);

    for (int i = 0; i < n; i++) {
      if (a[1][i] < a[2][i]) {
        ans = false;
        break;
      }
    }

    if (ans) {
      for (int i = 0; i < n; i++) {
        if (a[0][i] != a[2][i]) {
          for (int j = i+1; j < n; j++) {
            if (a[0][j] == a[2][i]) {
              swap(a[0], i, j);
              count++;
              break;
            }
          }
        }
        if (count > n - 2) {
          ans = false;
          break;
        }
      }
    }

    if (ans) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
