import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int[] A = new int[N];
    for (int i = 0; i < N; i++) A[i] = scanner.nextInt();
    int count = 0;
    int d = 0;
    for (int i = 1; i < N; i++) {
      if (A[i] > A[i - 1] && d >= 0) {
        if (d == 0) d = 1;
        continue;
      }
      if (A[i] < A[i - 1] && d <= 0) {
        if (d == 0) d = -1;
        continue;
      }
      if (A[i] == A[i - 1] && d == 0) continue;
      if (A[i] > A[i - 1]) {
        count++;
        d = 0;
      } else if (A[i] < A[i - 1]) {
        count++;
        d = 0;
      }
    }
    System.out.println(count + 1);
  }
}
