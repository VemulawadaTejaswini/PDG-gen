import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int M = scanner.nextInt();
    boolean[] possible = new boolean[N];
    possible[0] = true;
    int[] count = new int[N];
    Arrays.fill(count, 1);
    for (int i = 0; i < M; i++) {
      int x = scanner.nextInt() - 1;
      int y = scanner.nextInt() - 1;
      possible[y] |= possible[x];
      count[x]--;
      count[y]++;
      if (count[x] == 0) possible[x] = false;
    }
    int cnt = 0;
    for (int i = 0; i < N; i++) if (possible[i]) cnt++;
    System.out.println(cnt);
  }
}
