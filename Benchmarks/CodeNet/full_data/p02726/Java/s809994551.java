import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int X = scanner.nextInt() - 1;
    int Y = scanner.nextInt() - 1;
    int[] res = new int[N];

    for (int i = 0; i < N; i++) {
      for (int j = 0; j < i; j++) {
        int d = i - j;
        d = Math.min(d, Math.abs(i - Y) + Math.abs(j - X) + 1);
        res[d]++;
      }
    }

    for (int i = 1; i < N; i++) {
      System.out.println(res[i]);
    }
  }
}
