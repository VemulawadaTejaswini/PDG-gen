import java.util.Arrays;
import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int[] V = new int[N];
    int[] C = new int[N];
    for (int i = 0; i < N; i++) {
      V[i] = scanner.nextInt();
    }
    for (int i = 0; i < N; i++) {
      C[i] = scanner.nextInt();
    }
    int[] D = new int[N];
    for (int i = 0; i < N; i++) {
      D[i] = V[i] - C[i];
    }
    Arrays.sort(D);
    int ans = 0;
    for (int i = D.length - 1; i >= 0 && D[i] > 0; i--) {
      ans += D[i];
    }
    System.out.println(ans);
  }

}
