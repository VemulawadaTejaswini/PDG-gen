/**
 * Created at 22:03 on 2019-07-21
 */

import java.io.*;
import java.util.*;

public class Main {

  static FastScanner sc = new FastScanner();
  static PrintStream out = System.out;
  static PrintWriter pw = new PrintWriter(out);

  static final int[] dx = {0, 1, 0, -1};
  static final int[] dy = {-1, 0, 1, 0};

  static final long MOD = (long) (1e9 + 7);
  static final long INF = Long.MAX_VALUE / 2;

  public static class Solver {
    public Solver() {

      int N = sc.nextInt();
      long K = sc.nextLong();

      int[] A = new int[N];
      for (int i=0; i<N; i++) {
        A[i] = sc.nextInt()-1;
      }

      int M = 200000;

      ArrayList<Integer>[] appear = new ArrayList[M];

      for (int i=0; i<M; i++) {
        appear[i] = new ArrayList<Integer>();
      }

      for (int i=0; i<N; i++) {
        appear[A[i]].add(i);
      }

      int[] s = new int[N+1];

      int[] lastAppear = new int[M];
      Arrays.fill(lastAppear, -1);

      //s[N] = {}
      s[N] = -1;
      s[N-1] = A[N-1];
      lastAppear[A[N-1]] = N-1;
      for (int i=N-2; i>=0; i--) {
        if (lastAppear[A[i]] == -1) {
          s[i] = A[i];
        } else {
          s[i] = s[lastAppear[A[i]]+1];
        }
        lastAppear[A[i]] = i;
      }

      int[] ansIndex = new int[N];

      int i=0;
      int count = 0;
      while(true) {
        if (s[i] == -1) {
          count++;
          break;
        } else {
          ansIndex[count] = i;
          i = appear[s[i]].get(0)+1;
          count++;
        }
      }

      int j = ansIndex[(int)((K-1) % count)];

      int[] last = new int[M];
      Arrays.fill(last, -1);

      int[] t = new int[N+1];
      //s[N] = {}
      t[N] = N;
      t[N-1] = N;
      last[A[N-1]] = N-1;
      for (int k=N-2; k>=0; k--) {
        if (last[A[k]] == -1) {
          t[k] = k+1;
        } else {
          t[k] = ~(last[A[k]]+1);
        }
        last[A[k]] = k;
      }

      ArrayList<Integer> ans = new ArrayList<Integer>();
      while(j != N && j != ~N) {
        if (j >= 0) {
          if (t[j] >= 0) {
            ans.add(A[j] + 1);
            j = t[j];
          } else {
            j = t[j];
          }
        } else {
          if (t[~j] >= 0) {
            ans.add(A[~j] + 1);
            j = t[~j];
          } else {
            j = t[~j];
          }
        }
      }

      if (ans.size() >= 1) out.print(ans.get(0));
      for (int m=1; m<ans.size(); m++) {
        out.print(" " + ans.get(m));
      }
      out.println();

    }
  }

  public static void main(String[] args) {
    new Solver();
  }

  static class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;

    private boolean hasNextByte() {
      if (ptr < buflen) {
        return true;
      } else {
        ptr = 0;
        try {
          buflen = in.read(buffer);
        } catch (IOException e) {
          e.printStackTrace();
        }
        if (buflen <= 0) {
          return false;
        }
      }
      return true;
    }

    private int readByte() {
      if (hasNextByte()) return buffer[ptr++];
      else return -1;
    }

    private static boolean isPrintableChar(int c) {
      return 33 <= c && c <= 126;
    }

    private void skipUnprintable() {
      while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
    }

    public boolean hasNext() {
      skipUnprintable();
      return hasNextByte();
    }

    public String next() {
      if (!hasNext()) throw new NoSuchElementException();
      StringBuilder sb = new StringBuilder();
      int b = readByte();
      while (isPrintableChar(b)) {
        sb.appendCodePoint(b);
        b = readByte();
      }
      return sb.toString();
    }

    public long nextLong() {
      if (!hasNext()) throw new NoSuchElementException();
      long n = 0;
      boolean minus = false;
      int b = readByte();
      if (b == '-') {
        minus = true;
        b = readByte();
      }
      if (b < '0' || '9' < b) {
        throw new NumberFormatException();
      }
      while (true) {
        if ('0' <= b && b <= '9') {
          n *= 10;
          n += b - '0';
        } else if (b == -1 || !isPrintableChar(b)) {
          return minus ? -n : n;
        } else {
          throw new NumberFormatException();
        }
        b = readByte();
      }
    }

    public int nextInt() {
      return (int) nextLong();
    }

    public int[] nextIntArray(int N, boolean oneBased) {
      if (oneBased) {
        int[] array = new int[N + 1];
        for (int i = 1; i <= N; i++) {
          array[i] = sc.nextInt();
        }
        return array;
      } else {
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
          array[i] = sc.nextInt();
        }
        return array;
      }
    }

    public long[] nextLongArray(int N, boolean oneBased) {
      if (oneBased) {
        long[] array = new long[N + 1];
        for (int i = 1; i <= N; i++) {
          array[i] = sc.nextLong();
        }
        return array;
      } else {
        long[] array = new long[N];
        for (int i = 0; i < N; i++) {
          array[i] = sc.nextLong();
        }
        return array;
      }
    }
  }

}
