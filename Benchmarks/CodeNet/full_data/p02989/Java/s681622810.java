import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int[] array = new int[N];

    long sum = 0;
    for (int i = 0; i < N; i++) {
      array[i] = scan.nextInt();
      sum += array[i];
    }

    long longAvg = sum / N;
    int avg = (int) longAvg;

    if (!judge(array, N, avg)) {
      System.out.println(0);
      return;
    }

    int ijo = 0;
    int miman = 0;
    int ijo_abs = 100000;
    int miman_abs = 100000;
    for (int i = 0; i < N; i++) {
      if (array[i] > avg && array[i] - avg <= ijo_abs) {
        ijo_abs = array[i] - avg;
        ijo = array[i];
      } else if (array[i] <= avg && avg - array[i] < miman_abs) {
        miman_abs = avg - array[i];
        miman = array[i];
      }
    }

    System.out.println(ijo - miman);
  }

  private static boolean judge(int[] array, int N, int num) {
    int countARC = 0;
    int countABC = 0;
    for (int i = 0; i < N; i++) {
      if (array[i] > num) {
        countARC++;
      } else {
        countABC++;
      }
    }
    return countARC == countABC;
  }
}
