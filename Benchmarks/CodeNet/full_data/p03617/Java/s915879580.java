import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    long q = sc.nextLong();
    long h = sc.nextLong();
    long s = sc.nextLong();
    long d = sc.nextLong();
    long n = sc.nextLong();

    long onel = Math.min(Math.min(4 * q, 2 * h), s);
    long twol = Math.min(onel * 2, d);
    if ((onel * 2) >= d) {
      System.out.println((twol * (n / 2)) + (onel * (n % 2)));
    } else {
      System.out.println(onel * n);
    }

  }
}