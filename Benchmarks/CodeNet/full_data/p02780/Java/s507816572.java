import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int K = scanner.nextInt();
    int[] e = new int[N];
    for (int i = 0; i < N; i++) {
      int p = scanner.nextInt();
      e[i] = p + 1;
    }

    long max = 0;
    long sum = 0;
    for (int i = 0; i < K; i++) sum += e[i];
    for (int i = K; i < N; i++) {
      sum += e[i];
      sum -= e[i - K];
      max = Math.max(max, sum);
    }
    System.out.println(max * 0.5d);
  }
}
