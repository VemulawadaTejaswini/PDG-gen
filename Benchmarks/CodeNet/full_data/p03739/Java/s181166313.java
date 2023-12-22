import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) a[i] = scanner.nextInt();

    long c1 = 0;
    long sum = 0;
    for (int i = 0; i < n; i++) {
      sum += a[i];
      if (i % 2 == 0 && sum <= 0) {
        long d = 1 - sum;
        c1 += d;
        sum += d;
      } else if (i % 2 == 1 && sum >= 0){
        long d = sum + 1;
        c1 += d;
        sum -= d;
      }
    }

    long c2 = 0;
    sum = 0;
    for (int i = 0; i < n; i++) {
      sum += a[i];
      if (i % 2 == 0 && sum >= 0) {
        long d = sum + 1;
        c2 += d;
        sum -= d;
      } else if (i % 2 == 1 && sum <= 0){
        long d = 1 - sum;
        c2 += d;
        sum += d;
      }
    }

    System.out.println(Math.min(c1, c2));
  }
}
