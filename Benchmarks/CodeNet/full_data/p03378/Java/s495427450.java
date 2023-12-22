import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = 0;
    int M = 0;
    int X = 0;

    while (N < 1 || N > 100) {
      N = sc.nextInt();
    }

    while (M < 1 || M > 100) {
      M = sc.nextInt();
    }

    while (X < 1 || X > N - 1) {
      X = sc.nextInt();
    }

    int[] A = new int[M];
    int s;

    for (int i = 0; i <= M - 1; i++) {
      s = 0;

      while (s < 1 || s > N -1 || s == X) {
        s = sc.nextInt();
      }
      A[i] = s;
    }

    int X2 =X;
    int  c1 = 0;

      while (X2 <= N - 1) {
      for (int ii = 0; ii <= M - 1; ii++) {
        if (A[ii] == X2) {
          c1++;
        }
      }
      X2++;
    }

    X2 =X;
    int  c2 = 0;

      while (X2 >= 0) {
      for (int iii = 0; iii <= M - 1; iii++) {
        if (A[iii] == X2) {
          c2++;
        }
      }
      X2--;
    }

    if (c1 < c2) {
      System.out.println(c1);
    }else {
      System.out.println(c2);
    }


    }
  }