import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    //列の数
    int n = stdIn.nextInt();
    //各マスの飴の個数
    int[][] a = new int[2][n];
    for (int i = 0 ; i < 2 ; i++ ) {
      for (int j = 0; j < n ; j++ ) {
        a[i][j] = stdIn.nextInt();
      }
    }

    //右下に向かって飴を取りながら進む、全パターン
    int sum = 0;
    int cmp = 0;

    for (int k = n ; k > 0 ; k-- ) {
      sum = 0;
      //1段目
      for (int j = 0; j < k ; j++ ) {
        sum += a[0][j];
      }
      //2段目
      for (int j = k - 1 ; j < n ; j++ ) {
        sum += a[1][j];
      }
      //今までの合計の最大値と比較
      if (sum >= cmp) {
        cmp = sum;
      } else {
        sum = cmp;
      }
    }

    System.out.println(sum);
  }
}
