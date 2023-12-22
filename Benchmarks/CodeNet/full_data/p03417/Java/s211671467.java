import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    long N = scanner.nextInt();
    long M = scanner.nextInt();

    N -= 2;
    M -= 2;
    if (N < 0) N = 1;
    if (M < 0) M = 1;

    System.out.println(N * M);
  }
}
