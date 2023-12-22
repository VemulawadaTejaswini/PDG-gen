import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    char[] s = scanner.next().toCharArray();

    int lb = -1;
    int numw = 0;
    for (int i = 0; i < N; i++) {
      if (s[i] == '#' && lb < 0) {
        lb = i;
      }
      if (lb >= 0 && s[i] == '.') numw++;
    }
    if (lb < 0) {
      System.out.println(0);
      return;
    }
    System.out.println(Math.min(N - lb - numw, numw));
  }
}
