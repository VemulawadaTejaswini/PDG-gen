import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int A = scanner.nextInt();
    int B = scanner.nextInt();
    int K = scanner.nextInt();
    for (int i = 0; i < K; i++) {
      if (i % 2 == 0) {
        B += A / 2;
        A /= 2;
      } else {
        A += B / 2;
        B /= 2;
      }
    }
    System.out.printf("%d %d\n", A, B);
  }
}
