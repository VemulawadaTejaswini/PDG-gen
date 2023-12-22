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
      if (s[0] == 'B' && s[s.length - 1] != 'A') b++;
      if (s[0] != 'B' && s[s.length - 1] == 'A') a++;
      if (s[0] == 'B' && s[s.length - 1] == 'A') c++;
      for (int j = 0; j < s.length - 1; j++) {
        if (s[j] == 'A' && s[j + 1] == 'B') ans++;
      }
    }
    if (c > 1) ans += c - 1;
    if (c > 0) c = 1;
    if (a < b) {
      ans += Math.min(a + c, b);
    } else if (b < a) {
      ans += Math.min(a, b + c);
    } else {
      ans += a + c;
    }
    System.out.println(ans);
  }
}
