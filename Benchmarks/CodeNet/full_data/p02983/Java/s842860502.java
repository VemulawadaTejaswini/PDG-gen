import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long l = sc.nextInt();
    long r = sc.nextInt();

    if (r > l + 2018) {
      System.out.println(0);
      System.exit(0);
    }

    for (long i = l + 2; i <= r; ++i) {
      if (i % 2019 == 0) {
        System.out.println(0);
        System.exit(0);
      }
    }

    System.out.println((l * (l + 1)) % 2019);
  }
}