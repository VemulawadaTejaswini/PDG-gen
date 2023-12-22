import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    char[] s = scanner.next().toCharArray();
    char[] t = scanner.next().toCharArray();
    int N = s.length;

    int[][] table = new int[N][26];
    Arrays.fill(table[N - 1], -1);
    for (int i = 0; i < N; i++) if (table[N - 1][s[i] - 'a'] < 0) table[N - 1][s[i] - 'a'] = i;

    for (int i = N - 2; i >= 0; i--) {
      table[i] = Arrays.copyOf(table[i + 1], 26);
      table[i][s[i + 1] - 'a'] = i + 1;
    }

    long res = 0;
    int cur = N - 1;
    for (char c : t) {
      int next = table[cur][c - 'a'];
      if (next < 0) {
        System.out.println(-1);
        return;
      }
      res += next - cur;
      if (next <= cur) res += N;
      cur = next;
    }
    System.out.println(res);
  }
}
