import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long l = sc.nextLong();
    long r = sc.nextLong();

    if (r > l + 2018) {
      System.out.println(0);
      System.exit(0);
    }

    long res = 2019;

    for (long i = l; i <= r; ++i) {
      for (long j = l; j <= r; ++j) {
        if (i == j)
          continue;
        res = ((i * j) % 2019 < res) ? (i * j) % 2019 : res;
      }
    }

    System.out.println(res);
  }
}