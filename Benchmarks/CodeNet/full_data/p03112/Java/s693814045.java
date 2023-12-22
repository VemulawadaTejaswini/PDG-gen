import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) {
    new Main().solve();
  }

  private void solve() {
    try(InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out)) {

      final int A = in.nextInt();
      final int B = in.nextInt();
      final int Q = in.nextInt();

      long[] s = new long[A+1];
      for (int i = 0; i < A; i++) {
        s[i] = in.nextLong();
      }
      s[A] = 1L << 40;

      long[] t = new long[B+1];
      for (int i = 0; i < B; i++) {
        t[i] = in.nextLong();
      }
      t[B] = 1L << 40;

      for (int q = 0; q < Q; q++) {
        long x = in.nextLong();
        long dist = 1L << 50;

        for (int c = 0; c < 2; c++) {
          long[] af = c == 0 ? s : t;
          long[] as = c == 0 ? t : s;

          for (int i = 0; i < 2; i++) {
            int posF = binarySearch(af, x) + i;
            long df = af[posF];

            for (int j = 0; j < 2; j++) {
              int posS = binarySearch(as, x) + j;
              long ds = as[posS];
              
              long d = Math.abs(x - df);
              d += Math.abs(df - ds);
              dist = Math.min(dist, d);
            }
          }
        }

        out.println(dist);
      }
    }
    catch(IOException e) {
      System.err.println(e);
    }
  }

  int atoi(String s) { return Integer.parseInt(s); }
  long atol(String s) { return Long.parseLong(s); }

  private int binarySearch(long[] arr, long x) {
    int left = 0;
    int right = arr.length;

    return loop(arr, x, left, right);
  }

  private int loop(long[] arr, long x, int left, int right) {
    if(right - left < 2) return left;

    int mid = (left + right) / 2;
    if(arr[mid] <= x) return loop(arr, x, mid, right);
    else return loop(arr, x, left, mid);
  }

  static class InputReader implements AutoCloseable {
    public BufferedReader reader;
    private String[] buf;
    private int p;
    private int end;

    public InputReader(InputStream stream) {
        reader = new BufferedReader(new InputStreamReader(stream), 32768);
        buf = null;
        p = end = 0;
    }
    @Override
    public void close() throws IOException {
      reader.close();
    }

    public String next() {
      if(buf == null || p == end) {
        try {
          buf = reader.readLine().split(" ");
          p = 0;
          end = buf.length;
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }
      return buf[p++];
    }

    public String[] nextSplit(String reg) {
      try {
        buf = reader.readLine().split(reg);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
      return buf;
    }

    public int nextInt() {
      return Integer.parseInt(next());
    }

    public long nextLong() {
      return Long.parseLong(next());
    }

    int[] nextMapInt() {
      nextSplit(" ");
      int[] ret = new int[buf.length];
      for (int i = 0; i < buf.length; i++) ret[i] = Integer.parseInt(buf[i]);
      return ret;
    }

    long[] nextMapLong() {
      nextSplit(" ");
      long[] ret = new long[buf.length];
      for (int i = 0; i < buf.length; i++) ret[i] = Long.parseLong(buf[i]);
      return ret;
    }
  }
}