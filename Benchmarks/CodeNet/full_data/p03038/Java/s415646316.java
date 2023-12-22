import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.PriorityQueue;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.AbstractCollection;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author koneko096
 */
public class Main {
  public static void main(String[] args) {
    InputStream inputStream = System.in;
    OutputStream outputStream = System.out;
    InputReader in = new InputReader(inputStream);
    PrintWriter out = new PrintWriter(outputStream);
    DIntegerCards solver = new DIntegerCards();
    solver.solve(1, in, out);
    out.close();
  }

  static class DIntegerCards {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
      PriorityQueue<Pair<Integer, Integer>> pq = new PriorityQueue<>();
      int n = in.nextInt(), m = in.nextInt();
      for (int i = 0; i < n; i++) {
        pq.add(new Pair<>(in.nextInt(), 1));
      }
      for (int i = 0; i < m; i++) {
        int b = in.nextInt(), c = in.nextInt();
        while (b > 0 && c > pq.peek().getFs()) {
          Pair<Integer, Integer> pp = pq.poll();
          int e = Math.min(b, pp.getSc());
          b -= e;
          if (e < pp.getSc()) {
            pp.setSc(pp.getSc() - e);
            pq.add(pp);
          }
          pq.add(new Pair<>(c, e));
        }
      }
      long sum = 0L;
      while (!pq.isEmpty()) {
        Pair<Integer, Integer> pp = pq.poll();
        sum += (long) pp.getFs() * pp.getSc();
      }
      out.print(sum);
    }

  }


  static class Pair<T1 extends Comparable<T1>, T2 extends Comparable<T2>>
      implements Comparable<Pair<T1, T2>> {
    T1 fs;
    T2 sc;

    public T1 getFs() {
      return fs;
    }

    public T2 getSc() {
      return sc;
    }

    public void setSc(T2 sc) {
      this.sc = sc;
    }

    public Pair(T1 fs, T2 sc) {
      this.fs = fs;
      this.sc = sc;
    }

    public int compareTo(Pair<T1, T2> o) {
      int fc = fs.compareTo(o.fs);
      if (fc != 0) {
        return fc;
      }
      return sc.compareTo(o.sc);
    }

    public String toString() {
      return "<" + "" + fs + ", " + sc + '>';
    }

  }


  static class InputReader {
    private BufferedReader reader;
    private StringTokenizer tokenizer;

    public InputReader(InputStream stream) {
      reader = new BufferedReader(new InputStreamReader(stream), 32768);
      tokenizer = null;
    }

    public String next() {
      while (tokenizer == null || !tokenizer.hasMoreTokens()) {
        try {
          tokenizer = new StringTokenizer(reader.readLine());
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }
      return tokenizer.nextToken();
    }

    public int nextInt() {
      return Integer.parseInt(next());
    }

  }
}

