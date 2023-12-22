import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    int sN = (int) Math.sqrt(N);
    int di = 1;
    long dj;
    for (int i = 2; i <= sN; i++) {
      if (N % i == 0) {
        di *= i;
      }
    }
    dj = N / di;
    if (di * dj != N) {
      System.out.println(N-1);
    } else {
      System.out.println((di - 1) + (dj - 1));
    }
  }
}
