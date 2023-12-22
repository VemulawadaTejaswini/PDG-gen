import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 * N 人の社員からなる会社があり、各社員には 1, ..., N の社員番号が割り当てられています。 社員番号 1
 * の社員以外の全ての社員には、自分より社員番号が小さい直属の上司がちょうど 1 人います。 X さんが Y さんの直属の上司であるとき、Y さんは X
 * さんの直属の部下であるといいます。 社員番号 i の社員の直属の上司の社員番号が A_i
 * であることが与えられます。各社員について直属の部下が何人いるか求めてください。 Input: N A_2 ... A_N
 */
public final class Main {
  public static void main(final String[] args) throws Exception {
    try (final BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); final PrintWriter out = new PrintWriter(System.out)) {
      execute(in, out);
      out.flush();
    }
  }

  private static void execute(final BufferedReader in, final PrintWriter out) throws Exception {
    int n = readInt(in);
    int[] a = readIntArray(in); // A_2 ... A_N
    int[] r = new int[n];
    for (int an : a) {
      r[an - 1]++;
    }
    for (int rn : r) {
      out.println(rn);
    }
  }

  public static int readInt(final BufferedReader in) throws IOException {
    return Integer.parseInt(in.readLine());
  }

  public static int[] readIntArray(final BufferedReader in) throws IOException {
    return Arrays.stream(in.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
  }
}
