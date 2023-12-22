import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    long N = scanner.nextInt();
    long A = scanner.nextInt();
    long B = scanner.nextInt();
    long max = A + B * (N - 1);
    long min = A * (N - 1) + B;
    System.out.println(Math.max(0, max - min + 1));
  }
}
