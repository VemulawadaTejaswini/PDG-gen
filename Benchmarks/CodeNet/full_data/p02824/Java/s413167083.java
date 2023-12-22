import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    long M = scanner.nextInt();
    long V = scanner.nextInt();
    int P = scanner.nextInt();
    int[] A = new int[N];
    for (int i = 0; i < N; i++) A[i] = scanner.nextInt();
    Arrays.sort(A);
    reverse(A);

    int res = P;
    for (int i = P; i < N && A[i] + M >= A[P - 1]; i++) {
      long cap = M * (N - i + P - 1);
      for (int j = P - 1; j < i; j++) {
        cap += A[i] + M - A[j];
      }
      if (cap >= M * V) res++;
    }
    System.out.println(res);
  }

  private static void reverse(int[] a) {
    int i = 0;
    int j = a.length - 1;
    while (i < j) {
      int tmp = a[i];
      a[i] = a[j];
      a[j] = tmp;
      i++;
      j--;
    }
  }
}
