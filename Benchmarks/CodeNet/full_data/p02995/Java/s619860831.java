import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
    long c = sc.nextInt();
    long d = sc.nextInt();

    long lcmCD = lcm(c, d);

    long cMultiples = b / c - (a - 1) / c;
    long dMultiples = b / d - (a - 1) / d;
    long cdMultiples = b / lcmCD - (a - 1) / lcmCD;

    System.out.println(b - a + 1 - cMultiples - dMultiples + cdMultiples);
  }

  public static long gcd(long a, long b) {
    return (a == 0) ? b : gcd(b % a, a);
  }

  public static long lcm(long a, long b) {
    return a * b / gcd(a, b);
  }
}