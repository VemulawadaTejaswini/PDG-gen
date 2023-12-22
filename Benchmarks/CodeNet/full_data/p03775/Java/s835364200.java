import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    long n = scan.nextLong();

    long start = (int) Math.sqrt(n);

    for (long i = start; i <= n; i++) {
      if (n % i == 0) {
        String str = Long.toString(Math.max(i, n / i));
        System.out.println(str.length());
        return;
      }
    }

  }

}