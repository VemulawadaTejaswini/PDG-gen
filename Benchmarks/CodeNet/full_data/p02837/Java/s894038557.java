import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    int[][] proof = new int[n][n];
    int[][] proofcp = new int[n][n];
    int[] honest = new int[n];
    int res = 0;
    boolean acc;

    for (int i = 0; i < n; i++) {

      int a = sc.nextInt();

      for (int j = 0; j < a; j++) {

        int man = sc.nextInt() - 1;
        int tmp = sc.nextInt();

        switch (tmp) {
        case 1:
          proof[i][man] = 1;
          break;

        case 0:
          proof[i][man] = -1;
          break;
        }

      }
    }

    for (int bit = 0; bit < Math.pow(2, n); bit++) {
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
          proofcp[i][j] = proof[i][j];
        }
      }
      acc = true;
      int cnt = 0;
      for (int i = 0; i < n; i++) {
        if ((1 & (bit >> i)) == 1) { // i が bit に入るかどうか
          honest[i] = 1;
          cnt++;
        } else {
          honest[i] = -1;
          for (int j = 0; j < n; j++) {
            proofcp[i][j] = -proofcp[i][j];
          }
        }
      }

      for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
          if ((proofcp[i][j] != 0) && (honest[j] != proofcp[i][j])) {
            acc = false;
            break;
          }
        }
        if (!acc) {
          break;
        }
      }

      if ((acc) && (res < cnt)) {
        res = cnt;
      }
    }

    System.out.println(res);

  }

}