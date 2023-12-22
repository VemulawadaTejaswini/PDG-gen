import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();
    int[] l = new int[N];
    for (int i = 0; i < N; i++) l[i] = scanner.nextInt();

    int min = Integer.MAX_VALUE;
    for (int i = 0; i < 1 << N * 2; i++) {
      int[] assign = iToAssign(i, N);
      int[] cand = new int[3];
      int unused = 0;
      for (int j = 0; j < N; j++) {
        if (assign[j] < 3) cand[assign[j]] += l[j];
        else unused++;
      }
      if (cand[0] == 0 || cand[1] == 0 || cand[2] == 0) continue;
      int cost = Math.abs(a - cand[0]) + Math.abs(b - cand[1]) + Math.abs(c - cand[2]);
      cost += (N - unused - 3) * 10;
      min = Math.min(min, cost);
    }
    System.out.println(min);
  }

  private static int[] iToAssign(int num, int N) {
    int[] res = new int[N];
    int i = 0;
    while (num > 0) {
      res[i++] = num % 4;
      num /= 4;
    }
    return res;
  }
}
