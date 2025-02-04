import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.NoSuchElementException;

/*
                   _ooOoo_
                  o8888888o
                  88" . "88
                  (| -_- |)
                  O\  =  /O
               ____/`---'\____
             .'  \\|     |//  `.
            /  \\|||  :  |||//  \
           /  _||||| -:- |||||-  \
           |   | \\\  -  /// |   |
           | \_|  ''\---/''  |   |
           \  .-\__  `-`  ___/-. /
         ___`. .'  /--.--\  `. . __
      ."" '<  `.___\_<|>_/___.'  >'"".
     | | :  `- \`.;`\ _ /`;.`/ - ` : | |
     \  \ `-.   \_ __\ /__ _/   .-` /  /
======`-.____`-.___\_____/___.-`____.-'======
                   `=---='
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
            pass System Test!
*/

public class Main {
  private static class Task {
    class Node {
      int[] to = new int[27];
      int cnt = 0;
      int end = 0;
    }

    class Trie {
      ArrayList<Node> nodes = new ArrayList<>();
      Trie() {
        nodes.add(new Node());
      }

      void add(String S) {
        int pos = 0;
        int cur = 0;
        for (; ; ) {
          Node node = nodes.get(cur);
          node.cnt++;
          if (pos == S.length()) {
            node.end++;
            break;
          }
          int c = S.charAt(pos) - 'a';
          if (node.to[c] == 0) {
            node.to[c] = nodes.size();
            nodes.add(new Node());
          }
          pos++;
          cur = node.to[c];
        }
      }

      int calc(String S, String P) {
        int pos = 0;
        int cur = 0;
        int ans = 0;
        for (; ; ) {
          Node node = nodes.get(cur);
          if (node.cnt == 1) break;
          if (pos == S.length()) break;
          int c = S.charAt(pos) - 'a';
          ans += node.end;
          for (int i = 0; i < 26; i++) {
            if (P.charAt(i) - 'a' == c) break;
            int to = node.to[P.charAt(i) - 'a'];
            if (to == 0) continue;
            ans += nodes.get(to).cnt;
          }
          pos++;
          cur = node.to[c];
        }
        return ans;
      }

      void simplify() {
        ArrayDeque<int[]> deque = new ArrayDeque<>();
        for (int i = 0; i < 26; i++) {
          if (nodes.get(0).to[i] == 0) continue;
          deque.add(new int[]{0, i, nodes.get(0).to[i]});
        }

        while (!deque.isEmpty()) {
          int[] p = deque.poll();
          int ancient = p[0];
          int to = p[1];
          int v = p[2];

          int cnt = 0;
          int next = 0;
          for (int i = 0; i <= 26; i++) {
            if (nodes.get(v).to[i] != 0) {
              cnt++;
              next = nodes.get(v).to[i];
            }
          }
          if (cnt == 1) {
            nodes.get(ancient).to[to] = v;
            deque.add(new int[]{ancient, to, next});
          } else {
            for (int i = 0; i < 26; i++) {
              if (nodes.get(v).to[i] != 0) {
                deque.add(new int[]{v, i, nodes.get(v).to[i]});
              }
            }
          }
        }
      }

    }

    void solve(FastScanner in, PrintWriter out) throws Exception {

      int N = in.nextInt();
      Trie trie = new Trie();
      String[] S = new String[N];
      for (int i = 0; i < N; i++) {
        S[i] = in.next();
        trie.add(S[i]);
      }

      trie.simplify();
      int Q = in.nextInt();
      for (int i = 0; i < Q; i++) {
        int K = in.nextInt() - 1;
        String P = in.next();
        out.println(trie.calc(S[K], P) + 1);
      }
    }
  }

  /**
   * ここから下はテンプレートです。
   */
  public static void main(String[] args) throws Exception {
    OutputStream outputStream = System.out;
    FastScanner in = new FastScanner();
    PrintWriter out = new PrintWriter(outputStream);
    Task solver = new Task();
    solver.solve(in, out);
    out.close();
  }
  private static class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int bufferLength = 0;

    private boolean hasNextByte() {
      if (ptr < bufferLength) {
        return true;
      } else {
        ptr = 0;
        try {
          bufferLength = in.read(buffer);
        } catch (IOException e) {
          e.printStackTrace();
        }
        if (bufferLength <= 0) {
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

    boolean hasNext() {
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

    long nextLong() {
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

    double nextDouble() {
      return Double.parseDouble(next());
    }

    double[] nextDoubleArray(int n) {
      double[] array = new double[n];
      for (int i = 0; i < n; i++) {
        array[i] = nextDouble();
      }
      return array;
    }

    double[][] nextDoubleMap(int n, int m) {
      double[][] map = new double[n][];
      for (int i = 0; i < n; i++) {
        map[i] = nextDoubleArray(m);
      }
      return map;
    }

    public int nextInt() {
      return (int) nextLong();
    }

    public int[] nextIntArray(int n) {
      int[] array = new int[n];
      for (int i = 0; i < n; i++) array[i] = nextInt();
      return array;
    }

    public long[] nextLongArray(int n) {
      long[] array = new long[n];
      for (int i = 0; i < n; i++) array[i] = nextLong();
      return array;
    }

    public String[] nextStringArray(int n) {
      String[] array = new String[n];
      for (int i = 0; i < n; i++) array[i] = next();
      return array;
    }

    public char[][] nextCharMap(int n) {
      char[][] array = new char[n][];
      for (int i = 0; i < n; i++) array[i] = next().toCharArray();
      return array;
    }

    public int[][] nextIntMap(int n, int m) {
      int[][] map = new int[n][];
      for (int i = 0; i < n; i++) {
        map[i] = nextIntArray(m);
      }
      return map;
    }
  }
}