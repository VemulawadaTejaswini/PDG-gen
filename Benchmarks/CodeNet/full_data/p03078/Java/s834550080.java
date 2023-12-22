import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int X = scanner.nextInt();
    int Y = scanner.nextInt();
    int Z = scanner.nextInt();
    int K = scanner.nextInt();
    long[] A = new long[X];
    long[] B = new long[Y];
    long[] C = new long[Z];
    for (int i = 0; i < X; i++) A[i] = scanner.nextLong();
    for (int i = 0; i < Y; i++) B[i] = scanner.nextLong();
    for (int i = 0; i < Z; i++) C[i] = scanner.nextLong();

    Arrays.sort(A);
    reverse(A);
    Arrays.sort(B);
    reverse(B);
    Arrays.sort(C);
    reverse(C);

    long[] AB = new long[K * K];
    for (int i = 0; i < K && i < X; i++) {
      for (int j = 0; j < K && j < Y; j++) {
        AB[i * K + j] = A[i] + B[j];
      }
    }
    Arrays.sort(AB);
    reverse(AB);

    long[] ABC = new long[K * K];
    for (int i = 0; i < K; i++) {
      for (int j = 0; j < K && j < Z; j++) {
        ABC[i * K + j] = AB[i] + C[j];
      }
    }
    Arrays.sort(ABC);
    reverse(ABC);

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < K; i++) sb.append(ABC[i]).append('\n');
    System.out.println(sb.toString());
  }

  private static void reverse(long[] arr) {
    int i = 0;
    int j = arr.length - 1;
    while (i < j) {
      long tmp = arr[i];
      arr[i] = arr[j];
      arr[j] = tmp;
      i++;
      j--;
    }
  }
}
