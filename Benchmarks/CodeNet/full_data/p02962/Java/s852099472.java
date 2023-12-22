/**
 * Created at 21:58 on 2019-07-27
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

      String s = sc.next();
      String t = sc.next();

      if (s.length()*1000 < t.length()) {
        StringBuilder sb = new StringBuilder(s);
        while(sb.length() <= t.length()*1000) sb.append(s);
        if (sb.toString().contains(t)) {
          out.println(-1);
        } else {
          out.println(0);
        }
        return;
      }

      int[] S = new int[s.length()];
      int[] T = new int[t.length()];

      for (int i=0; i<s.length(); i++) {
        S[i] = s.charAt(i) - 'a';
      }

      for (int i=0; i<t.length(); i++) {
        T[i] = t.charAt(i) - 'a';
      }

      ArrayList<Integer>[] index = new ArrayList[26];

      for (int i=0; i<26; i++) {
        index[i] = new ArrayList<Integer>();
      }

      for (int i=0; i<t.length(); i++) {
        index[T[i]].add(i);
      }

      int chain = 0;
      int ti = 0;
      int maxChain = 0;
      int startSIndex = -1;
      boolean loop = false;

      for (int si=0; si<s.length()*1000; si++) {
        int ssi = si % s.length();
        if (Collections.binarySearch(index[S[ssi]], ti) >= 0) {
          if (chain == 0 && ti == 0) startSIndex = ssi;
          if (ti == t.length() - 1) {
            ti = 0;
            chain++;
            maxChain = Math.max(maxChain, chain);
          } else {
            ti++;
          }
          if ((ssi+1)%s.length() == startSIndex && chain >= 1) {
            loop = true;
          }
        } else {
          ti = 0;
          chain = 0;
          startSIndex = -1;
        }
      }

      out.println(loop ? -1 : maxChain);

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
