import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int[] P = new int[N];
    for (int i = 0; i < N; i++) P[i] = scanner.nextInt();
    int max = P[0];
    int count = 0;
    for (int i = 1; i < N; i++) {
      if (P[i] <= max) count++;
      max = Math.max(max, P[i]);
    }
    System.out.println(count);
  }
}
