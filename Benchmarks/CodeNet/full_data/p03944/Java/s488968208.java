import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int w = sc.nextInt();
    int h = sc.nextInt();
    int n = sc.nextInt();
    int[] x = new int[n];
    int[] y = new int[n];
    int[] a = new int[n];
    int[][] result = new int[w][h];
    int count = 0;
    for (int i = 0; i < n; i++) {
      x[i] = sc.nextInt();
      y[i] = sc.nextInt();
      a[i] = sc.nextInt();
    }
    for (int i = 0; i < n; i++) {
      if (a[i] == 1) {
        for (int j = 0; j < x[i]; j++) {
          for (int k = 0; k < h; k++) {
            result[j][k] = 1;
          }
        }
      }
      if (a[i] == 2) {
        for (int j = x[i]; j < w; j++) {
          for (int k = 0; k < h; k++) {
            result[j][k] = 1;
          }
        }
      }
      if (a[i] == 3) {
        for (int j = 0; j < w; j++) {
          for (int k = 0; k < y[i]; k++) {
            result[j][k] = 1;
          }
        }
      }
      if (a[i] == 4) {
        for (int j = 0; j < w; j++) {
          for (int k = y[i]; k < h; k++) {
            result[j][k] = 1;
          }
        }
      }
    }
    for (int i = 0; i < w; i++) {
      for (int j = 0; j < h; j++) {
        if (result[i][j] == 0) {
          count++;
        }
      }
    }
    System.out.println(count);
  }
}