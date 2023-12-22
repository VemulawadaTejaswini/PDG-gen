import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    Block[] blocks = new Block[N];
    for (int i = 0; i < N; i++) {
      blocks[i] = new Block(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
    }

    Arrays.sort(blocks, Comparator.comparingInt(b -> b.s + b.w));

    final int MAX_W = 1000_000;
    long[] dp = new long[MAX_W + 1];
    for (int i = 1; i <= N; i++) {
      Block b = blocks[i - 1];
      for (int j = b.s; j >= 0; j--) {
        dp[j + b.w] = Math.max(dp[j] + b.v, dp[j + b.w]);
      }
    }

    long max = 0;
    for (int i = 0; i <= MAX_W; i++) {
      max = Math.max(max, dp[i]);
    }
    System.out.println(max);
  }

  private static class Block {
    public final int w;
    public final int s;
    public final int v;

    private Block(int w, int s, int v) {
      this.w = w;
      this.s = s;
      this.v = v;
    }
  }
}
