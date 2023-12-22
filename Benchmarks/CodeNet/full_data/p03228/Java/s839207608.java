import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

  private class ValueManager {

    private long a;

    private long b;

    private int k;

    private long[] aSum;

    private long[] bSum;

    private int idx = 0;

    public ValueManager(long a, long b, int k) {
      super();
      this.a = a;
      this.b = b;
      this.k = k;
      this.aSum = new long[this.k];
      this.bSum = new long[this.k];
    }

    public boolean calcuNumCookies(String downTarget) {
      if ("a".equals(downTarget)) {
        this.a = (this.a % 2 != 0) ? this.a - 1 : this.a;

        final long half = this.a / 2;
        this.a -= half;
        this.b += half;

      } else if ("b".equals(downTarget)) {
        this.b = (this.b % 2 != 0) ? this.b - 1 : this.b;

        final long half = this.b / 2;
        this.b -= half;
        this.a += half;
      }

      this.aSum[idx] = a;
      this.bSum[idx] = b;

      return (this.k == ++this.idx);
    }

    public long getFinalValueA() {
      return this.aSum[aSum.length - 1];
    }

    public long getFinalValueB() {
      return this.bSum[bSum.length - 1];
    }
  }

  public static void main(String[] args) {

    Main main = new Main();
    Main.ValueManager vManager = null;
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      String[] tmp = br.readLine().split("\\s");
      final long a = Long.parseLong(tmp[0]);
      final long b = Long.parseLong(tmp[1]);
      final int k = Integer.parseInt(tmp[2]);
      vManager = main.new ValueManager(a, b, k);
    } catch (IOException e) {
      e.printStackTrace();
      System.exit(1);
    }

    while (true) {
      boolean bFlag = vManager.calcuNumCookies("a");
      if (bFlag) {
        break;
      }
      bFlag = vManager.calcuNumCookies("b");
      if (bFlag) {
        break;
      }
    }

    System.out.printf("%d %d", vManager.getFinalValueA(), vManager.getFinalValueB());
  }
}
