import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int[] b = new int[N - 1];
    for (int i = 0; i < N - 1; i++) b[i] = scanner.nextInt();

    int sum = b[0] + b[N - 2];
    for (int i = 1; i < N - 1; i++) {
      sum += Math.min(b[i], b[i - 1]);
    }
    System.out.println(sum);
  }
}
