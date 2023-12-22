import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int H = scanner.nextInt();
    int W = scanner.nextInt();
    char[][] A = new char[H][W];
    for (int i = 0; i < H; i++) {
      A[i] = scanner.next().toCharArray();
    }
    if (possible(H, W, A)) {
      System.out.println("Possible");
    } else {
      System.out.println("Impossible");
    }
  }

  private static boolean possible(int H, int W, char[][] A) {
    int pright = 0;
    for (int i = 0; i < H; i++) {
      int left = -1;
      int right = -1;
      for (int j = 0; j < W; j++) {
        if (A[i][j] == '#') {
          if (left < 0) {
            left = j;
            while (j < W && A[i][j] == '#') j++;
            right = j;
          } else {
            return false;
          }
        }
      }
      if (left != pright) return false;
      pright = right - 1;
    }
    return true;
  }
}
