import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] A = new int[n];
    int max = 0;
    int min = 0;

    for (int i=0; i < n; i++) {
      A[i] = sc.nextInt() - i - 1;
      if (A[i] > max) {
        max = A[i];
      }
      if (A[i] < min) {
        min = A[i];
      }
    }

    int sadness = Integer.MAX_VALUE;


    for (int b=min; b <= max; b++) {
      int tmp_sadness = 0;

      for (int i=0; i < n; i++) {
        tmp_sadness += Math.abs(A[i] - b);
      }

      if (tmp_sadness < sadness) {
        sadness = tmp_sadness;
      }
    }

    System.out.println(sadness);
  }
}
