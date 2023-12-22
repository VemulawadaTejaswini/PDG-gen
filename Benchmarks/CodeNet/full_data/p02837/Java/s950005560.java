import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    int A[] = new int[N];
    int x[][] = new int [N][N];
    int y[][] = new int [N][N];

    for (int i = 0; i < N; i++) {
      A[i] = Integer.parseInt(sc.next());
      for (int j = 0; j < A[i]; j++) {
        x[i][j] = Integer.parseInt(sc.next());
        y[i][j] = Integer.parseInt(sc.next());
      }
    }

    int twoPowN = 1;
    for (int i = 0; i < N; i++) {
      twoPowN *= 2;
    }

    boolean flag = true;
    int count = 0;
    int max = 0;
    for (int i = 1; i < twoPowN; i++) {
      String bin = Integer.toBinaryString(i);
      while (bin.length() < N) {
        bin = "0" + bin;
      }

      for (int j = 0; j < N; j++) {
        if (bin.charAt(bin.length() - j - 1) == '1') {
          for (int k = 0; k < A[j]; k++) {
            if (y[j][k] != bin.charAt(bin.length() - x[j][k]) - '0'){
              flag = false;
              break;
            }
          }
          count++;
        }
      }

      if (flag) {
        if (count > max) {
          max = count;
        }
      }

      flag = true;
      count = 0;
    }

    System.out.println(max);
  }
}
