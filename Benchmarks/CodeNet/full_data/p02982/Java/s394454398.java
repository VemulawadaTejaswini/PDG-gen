import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int D = scan.nextInt();
    int[][] array = new int[N][D];
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < D; j++) {
        array[i][j] = scan.nextInt();
      }
    }

    int count = 0;
    for (int i = 0; i < N - 1; i++)
      for (int j = i + 1; j < N; j++)
        if (isInteger(array[i], array[j], D))
          count++;
    System.out.println(count);
  }

  private static boolean isInteger(int[] array1, int[] array2, int d) {
    int sum = 0;
    for (int i = 0; i < d; i++) {
      sum += Math.pow(array1[i] - array2[i], 2);
    }
    int squareRoot = (int) Math.sqrt(sum);
    return squareRoot * squareRoot == sum;
  }
}
