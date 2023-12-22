import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long k = sc.nextLong();
    sc.close();

    for (;;) {
      if (n == k) {
        System.out.println(0);
        return;
      }
      if (n > Math.abs(n - k)) {
        n = Math.abs(n - k);
      } else {
        System.out.println(n);
        return;
      }
    }
  }
}
