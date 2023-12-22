import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int N = scn.nextInt();

    int[] H = new int[N];
    for (int i = 0; i < N; i++) {
      H[i] = scn.nextInt();
    }

    boolean flg = true;
    H[0]--;
    for (int i = 1; i < N - 1; i++) {
      if (H[i] < H[i + 1]) {
        H[i + 1]--;
      } else if (H[i] > H[i + 1]) {
        flg = false;
        break;

      }
      H[i]--;
    }

    System.out.println(flg ? "Yes" : "No");
  }
}