import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    long a = scanner.nextLong();
    long b = scanner.nextLong();
    long x = scanner.nextLong();
    b = b / x;
    a = (a - 1) / x;
    System.out.println(b - a);
  }
}
