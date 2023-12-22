import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int a = 0;
    int b = 0;
    int c = 0;
    int ans = 0;
    for (int i = 0; i < N; i++) {
      char[] s = scanner.next().toCharArray();
      if (s[0] == 'B') b++;
      if (s[s.length - 1] == 'A') a++;
      if (s[0] == 'B' && s[s.length - 1] == 'A') c++;
      for (int j = 0; j < s.length - 1; j++) {
        if (s[j] == 'A' && s[j + 1] == 'B') ans++;
      }
    }
    ans += Math.min(a, b);
    if (a == b && b == c) ans--;
    System.out.println(ans);
  }
}
