import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int K = scanner.nextInt();
    boolean[] like = new boolean[10];
    for (int i = 0; i < 10; i++) like[i] = true;
    for (int i = 0; i < K; i++) {
      int d = scanner.nextInt();
      like[d] = false;
    }


    int ans = 0;
    int c = 0;
    int k = 1;
    while (N > 0 || c > 0) {
      int d = N % 10 + c;
      N /= 10;
      for (int i = 0; i < 10; i++) {
        int t = (d + i) % 10;
        if (like[t]) {
          c = t >= d ? 0 : 1;
          ans += t * k;
          k *= 10;
          break;
        }
      }
    }
    System.out.println(ans);
  }
}
