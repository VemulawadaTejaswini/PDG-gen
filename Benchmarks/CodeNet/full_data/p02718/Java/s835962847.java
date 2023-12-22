import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int M = scanner.nextInt();
    int[] A = new int[N];
    int sum = 0;
    for (int i = 0; i < N; i++) {
      A[i] = scanner.nextInt();
      sum += A[i];
    }

    int cnt = 0;
    for (int i = 0; i < N; i++) if (A[i] * M * 4 >= sum) cnt++;
    if (cnt >= M) System.out.println("Yes");
    else System.out.println("No");
  }
}
