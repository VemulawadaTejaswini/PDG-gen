import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int[][] x = new int[N][2];
    for (int i = 0; i < N; i++) {
      x[i][0] = scanner.nextInt();
      x[i][1] = scanner.nextInt();
    }

    double res = 0.d;
    for (int i = 0; i < N; i++) {
      for (int j = i + 1; j < N; j++) {
        int dx = x[i][0] - x[j][0];
        int dy = x[i][1] - x[j][1];
        res += Math.sqrt(dx * dx + dy * dy);
      }
    }
    System.out.println(res * 2 / N);
  }
}
