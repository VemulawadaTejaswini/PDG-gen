import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int[] P = new int[M];
    int[] Y = new int[M];
    int[][] array = new int[N + 1][M];
    for (int i = 0; i < M; i++) {
      P[i] = sc.nextInt();
      Y[i] = sc.nextInt();
      int index = 0;
      while (array[P[i]][index] != 0) {
        index++;
      }
      array[P[i]][index] = Y[i];
    }
    for (int i = 1; i <= N; i++) {
      Arrays.sort(array[i]); // 昇順にソート
    }
    for (int i = 0; i < M; i++) {
      System.out.println(String.format("%06d", P[i]) + String.format("%06d", getLastIndex(array[P[i]], Y[i]) - getLastIndex(array[P[i]], 0)));
    }
  }

  public static int getLastIndex(int[] a, int value) {
    for (int i = a.length - 1; i >= 0; i--) {
      if (a[i] == value) {
        return i;
      }
    }
    return -1;
  }
}