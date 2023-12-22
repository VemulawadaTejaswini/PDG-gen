import java.util.Scanner;

public class Main {
  public static void main(final String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.reset().nextLong();
    long a = sc.reset().nextLong();
    long b = sc.reset().nextLong();
    sc.close();

    long ab = a + b;
    long p = n / ab;
    long q = n % ab;
    long o = (p * a) + (q > a ? a : q);

    System.out.println(o);
  }
}