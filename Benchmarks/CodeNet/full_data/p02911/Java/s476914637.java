import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int K = scanner.nextInt();
    int Q = scanner.nextInt();
    int[] win = new int[N];
    for (int i = 0; i < Q; i++) win[scanner.nextInt() - 1]++;
    for (int i = 0; i < N; i++) {
      if (K - Q + win[i] > 0) System.out.println("Yes");
      else System.out.println("No");
    }
  }
}
