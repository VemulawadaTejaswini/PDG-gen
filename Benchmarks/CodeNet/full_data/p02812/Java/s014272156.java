import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    char[] s = scanner.next().toCharArray();

    int cnt = 0;
    for (int i = 0; i < N - 2; i++) {
      if (s[i] == 'A' && s[i + 1] == 'B' && s[i + 2] == 'C') cnt++;
    }
    System.out.println(cnt);
  }
}
