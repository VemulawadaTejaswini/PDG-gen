import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in Actual solution is at the top
 *
 * @author Silviase
 */
public class Main {

  public static void main(String[] args) {
    InputStream inputStream = System.in;
    OutputStream outputStream = System.out;
    Scanner in = new Scanner(inputStream);
    PrintWriter out = new PrintWriter(outputStream);
    CBoxesAndCandies solver = new CBoxesAndCandies();
    solver.solve(1, in, out);
    out.close();
  }

  static class CBoxesAndCandies {

    public void solve(int testNumber, Scanner in, PrintWriter out) {
    /*
      解法
      a[0],a[1]について,まずa[1]から減らすべきであることは分かっている.
      a[1]でも足りなければさかのぼって減らせばいいことがわかる.
      a b a....みたいな形になっていきそうだけど...
      サンプルはどうだろう
      1   1 6 1 2 0 4なら1,6->1,0にして0,1->1,2(1,0)にして0,4->0,1で6,2,3の11個
      多分問題は無さそう...?
      なんかキラーケースがあるような気がするんだけど…
     */
      int n = in.nextInt();
      int x = in.nextInt();
      int[] a = new int[n];
      int sum = 0;
      for (int i = 0; i < n; i++) {
        a[i] = in.nextInt();
      }
      for (int i = 1; i < n; i++) {
        int niko = a[i] + a[i - 1];
        if (a[i - 1] > x) {
          sum += (niko - x);
          a[i] = 0;
          a[i - 1] = x;
        } else if (niko > x) {
          sum += (niko - x);
          a[i] = x - a[i - 1];
        }
      }
      out.println(sum);

      // マジで直感的だけど通らなさそうな不安にさせるやつヤメロ
    }

  }
}

