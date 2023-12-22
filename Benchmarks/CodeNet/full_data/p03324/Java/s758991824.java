import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int D = scanner.nextInt();
    int N = scanner.nextInt();
    int cnt = 0;
    for (int i = 1; i <= 2000000; i++) {
      if (count(i) == D) cnt++;
      if (cnt == N) {
        System.out.println(i);
        return;
      }
    }
  }

  private static int count(int n) {
    int cnt = 0;
    while (n % 100 == 0) {
      cnt++;
      n /= 100;
    }
    return cnt;
  }
}
