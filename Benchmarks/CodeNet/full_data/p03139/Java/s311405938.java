import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int A = scanner.nextInt();
    int B = scanner.nextInt();

    System.out.printf("%d %d\n", Math.min(A, B), Math.max(A + B - N, 0));
  }
}
