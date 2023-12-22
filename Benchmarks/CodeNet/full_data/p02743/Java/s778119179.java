import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    long a = scanner.nextInt();
    long b = scanner.nextInt();
    long c = scanner.nextInt();

    long d = c - a - b;
    d = d * d;
    if (4 * a * b < d) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
