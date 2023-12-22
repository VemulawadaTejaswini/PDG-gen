import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();

    int[] array = new int[N];
    int[] array2 = new int[N];
    int max = 0;
    int tmp;

    for (int i = 0; i < N; i++) {
      tmp = scan.nextInt();
      array[i] = tmp;
      array2[i] = tmp;
      if (max < tmp) {
        max = tmp;
      }
    }
    Arrays.sort(array2);

    for (int i = 0; i < N; i++) {
      if (array[i] < max) {
        System.out.println(max);
        continue;
      }
      System.out.println(array2[N - 2]);
    }
  }
}
