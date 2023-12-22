import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int H = scanner.nextInt();
    int W = scanner.nextInt();
    int N = scanner.nextInt();
    int sr = scanner.nextInt();
    int sc = scanner.nextInt();
    char[] s = scanner.next().toCharArray();
    char[] t = scanner.next().toCharArray();

    if (solve(H, W, N, sr, sc, s, t)) {
      System.out.println("NO");
    } else {
      System.out.println("YES");
    }
  }

  private static boolean solve(int H, int W, int N, int sr, int sc, char[] s, char[] t) {
    int[] rem = new int[] {sc, W - sc + 1, sr, H - sr + 1};
    int[] max = new int[] {W, W, H, H};
    char[] dir = new char[] {'L', 'R', 'U', 'D'};
    char[] otherdir = new char[] {'R', 'L', 'D', 'U'};

    for (int i = 0; i < 4; i++) {
      int r = rem[i];
      int m = max[i];
      char d = dir[i];
      char o = otherdir[i];

      for (int j = 0; j < N; j++) {
        if (s[j] == d) r--;
        if (r <= 0) return true;
        if (t[j] == o) r = Math.min(r + 1, m);
      }
    }
    return false;
  }
}
