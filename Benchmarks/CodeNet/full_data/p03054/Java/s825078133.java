import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int H = scanner.nextInt();
    int W = scanner.nextInt();
    int N = scanner.nextInt();
    int sr = scanner.nextInt();
    int sc = scanner.nextInt();
    char[] S = scanner.next().toCharArray();
    char[] T = scanner.next().toCharArray();
    if (possible(H, W, N, sr, sc, S, T)) {
      System.out.println("NO");
    } else {
      System.out.println("YES");
    }
  }

  private static boolean possible(int H, int W, int N, int sr, int sc, char[] S, char[] T) {
    int[] count = new int[4];
    for (int i = 0; i < N; i++) {
      switch (S[i]) {
        case 'U':
          count[0]++;
          break;
        case 'R':
          count[1]++;
          break;
        case 'D':
          count[2]++;
          break;
        case 'L':
          count[3]++;
          break;
      }
      if (sr - count[0] <= 0) return true;
      if (sr + count[2] > H) return true;
      if (sc - count[3] <= 0) return true;
      if (sc + count[1] > W) return true;
      switch (T[i]) {
        case 'U':
          if (sr + count[2] > 1) count[2]--;
          break;
        case 'R':
          if (sc - count[3] < W) count[3]--;
          break;
        case 'D':
          if (sr - count[0] < H) count[0]--;
          break;
        case 'L':
          if (sc + count[1] > 1) count[1]--;
          break;
      }
    }
    return false;
  }
}
