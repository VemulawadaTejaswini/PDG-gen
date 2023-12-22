import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int K = scanner.nextInt();

    int n = N / K;
    long count = n * n * n;
    if (K % 2 == 0) {
      int r = K / 2;
      n = (N + r) / K;
      count += n * n * n;
    }

    System.out.println(count);
  }
}
