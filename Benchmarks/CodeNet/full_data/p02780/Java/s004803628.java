import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int K = scanner.nextInt();
    double[] e = new double[N];
    for (int i = 0; i < N; i++) {
      int p = scanner.nextInt();
      e[i] = (1 + p) * 0.5d;
    }

    double max = 0.d;
    double sum = 0.d;
    for (int i = 0; i < K; i++) sum += e[i];
    for (int i = K; i < N; i++) {
      sum += e[i];
      sum -= e[i - K];
      max = Math.max(max, sum);
    }
    System.out.println(max);
  }
}
