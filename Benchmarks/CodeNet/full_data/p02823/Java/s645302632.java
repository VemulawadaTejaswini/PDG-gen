import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    long n = scan.nextLong();
    long a = scan.nextLong();
    long b = scan.nextLong();

    if (a % 2 == b % 2) {
      System.out.println((b - a) / 2);
    } else {
      System.out.println(Math.min(n - b, a - 1) + 1 + (Math.abs(b - a - 1) / 2));
    }
  }
}