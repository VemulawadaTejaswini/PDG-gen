import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    long x1 = 0, y1 = 0, x2, y2, x3, y3;
    long S = scanner.nextLong();
    long n = 1;
    for (; n * n < S; n++);
    if (n * (n - 1) > S) {
      x2 = n;
      y3 = n - 1;
      y2 = 1;
      x3 = n * (n - 1) - S;
    } else {
      x2 = n;
      y3 = n;
      y2 = 1;
      x3 = n * n - S;
    }
    System.out.printf("%d %d %d %d %d %d\n", x1, y1, x2, y2, x3, y3);
  }
}
