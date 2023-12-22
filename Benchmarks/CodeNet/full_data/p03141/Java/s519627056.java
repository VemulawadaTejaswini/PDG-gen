import java.util.Arrays;
import java.util.Scanner;

class Main {

  public static boolean isAllSame(long[][] x, int y) {
    boolean isAllSame = true;
    long p = x[0][y];
    for (int i = 1; i < x.length; i++) {
      if (x[i][y] != p)
        isAllSame = false;
    }
    return isAllSame;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    long[][] ab = new long[n][2];
    for (int i = 0; i < n; i++) {
      ab[i][0] = scanner.nextInt();
      ab[i][1] = scanner.nextInt();
    }
    int indexA = 0;
    int indexB = 0;
    long takahasi = 0;
    long aoki = 0;
    if (isAllSame(ab, 0)) {
      takahasi = ab[0][0] * (n + 1) / 2;
      long[] newab = new long[n];
      for (int i = 0; i < n; i++) {
        newab[i] = ab[i][1];
      }
      Arrays.sort(newab);
      for (int i = 1; i < n; i += 2) {
        aoki += newab[i];
      }
    } else if (isAllSame(ab, 1)) {
      aoki = ab[0][1] * n / 2;
      long[] newab = new long[n];
      for (int i = 0; i < n; i++) {
        newab[i] = ab[i][0];
      }
      Arrays.sort(newab);
      for (int i = 0; i < n; i += 2) {
        takahasi += newab[i];
      }
    } else {
      for (int i = 0; i < n; i++) {
        long maxA = 0;
        long MaxB = 0;
        for (int j = 0; j < n; j++) {
          if (maxA < ab[j][0]) {
            maxA = ab[j][0];
            indexA = j;
          }
          if (MaxB < ab[j][1]) {
            MaxB = ab[j][1];
            indexB = j;
          }
        }
        long add;
        if (i % 2 == 0) {
          if (maxA >= MaxB) {
            add = maxA;
            ab[indexA][0] = 0;
            ab[indexA][1] = 0;
          } else {
            add = ab[indexB][0];
            ab[indexB][0] = 0;
            ab[indexB][1] = 0;
          }
          takahasi += add;
        } else {
          if (maxA >= MaxB) {
            add = ab[indexA][1];
            ab[indexA][0] = 0;
            ab[indexA][1] = 0;
          } else {
            add = MaxB;
            ab[indexB][0] = 0;
            ab[indexB][1] = 0;
          }
          aoki += add;
        }
      }
    }
    System.out.println(takahasi - aoki);
  }
}
