import java.util.Scanner;

class Main {

  public static long maxkoyaku(long a, long b) {
    long r;
    if (a > b) {
      r = a;
      a = b;
      b = r;
    }
    while (a % b != 0) {
      r = a % b;
      a = b;
      b = r;
    }
    return b;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    long[] a = new long[n];
    for (int i = 0; i < n; i++) {
      a[i] = scanner.nextLong();
    }
    long r = maxkoyaku(a[0], a[1]);
    for (int i = 2; i < n; i++) {
      r = maxkoyaku(a[i], r);
    }
    System.out.println(r);
  }

}
