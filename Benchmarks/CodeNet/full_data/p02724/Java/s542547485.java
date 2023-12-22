import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    final Scanner scanner = new Scanner(System.in);
    final int x = scanner.nextInt();

    final int count500 = x / 500;
    final int count5 = (x % 500) / 5;

    System.out.println(count500 * 1000 + count5 * 5);
  }
}
