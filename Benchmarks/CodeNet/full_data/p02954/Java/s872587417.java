import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    char[] s = scanner.next().toCharArray();
    int N = s.length;

    int[] res = new int[N];
    for (int i = 0; i < N - 1; i++) {
      if (s[i] == 'R' && s[i + 1] == 'L') {
        for (int j = 0; i - j >= 0 && s[i - j] == 'R'; j++)
          if (j % 2 == 0) res[i]++; else res[i + 1]++;
        for (int j = 0; i + 1 + j < N && s[i + 1 + j] == 'L'; j++)
          if (j % 2 == 0) res[i + 1]++; else res[i]++;
      }
    }
    StringBuilder sb = new StringBuilder();
    for (int i : res) sb.append(i).append(' ');
    sb.setLength(sb.length() - 1);
    System.out.println(sb.toString());
  }
}
