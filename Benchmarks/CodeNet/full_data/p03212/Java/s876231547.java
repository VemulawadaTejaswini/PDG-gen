import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int digits = 0;
    int m = N;
    while (m > 0) {
      digits++;
      m /= 10;
    }

    int c = 0;
    for (int d = 3; d <= digits; d++) {
      for (int i = 1; i <= Math.pow(3, d); i++) {
        int n = i;
        int o = 0;
        int p = 1;
        int[] count = new int[3];
        for (int j = 0; j < d; j++) {
          count[n % 3]++;
          o += ((n % 3) * 2 + 3) * p;
          p *= 10;
          n /= 3;
        }
        if (count[0] == 0 || count[1] == 0 || count[2] == 0 || o > N) continue;
        c++;
      }
    }
    System.out.println(c);
  }
}
