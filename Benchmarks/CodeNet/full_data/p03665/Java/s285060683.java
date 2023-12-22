import java.util.Scanner;


public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int p = sc.nextInt();
    boolean hasOdd = false;

    for (int i = 0; i < n; i++) {
      long a = sc.nextLong();
      if (a % 2 == 1) {
        hasOdd = true;
        break;
      }
    }

    if (hasOdd) {
      long result = pow(2, n - 1);
      System.out.println(result);
    } else {
      if (p == 1) {
        System.out.println("0");
      } else {
        long result = pow(2, n);
        System.out.println(result);
      }
    }

  }

  static long pow(long n, long m) {
    long result = 1L;
    for (int i = 0; i < m; i++) {
      result = result * n;
    }

    return result;
  }

}
