import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Built using CHelper plug-in Actual solution is at the top
 *
 * @author MaxHeap
 */
public class Main {

  public static void main(String[] args) {
    InputStream inputStream = System.in;
    OutputStream outputStream = System.out;
    InputReader in = new InputReader(inputStream);
    PrintWriter out = new PrintWriter(outputStream);
    EStringsOfImpurity solver = new EStringsOfImpurity();
    solver.solve(1, in, out);
    out.close();
  }

  static class EStringsOfImpurity {

    int[][] next;
    char[] s;
    char[] t;

    public void solve(int testNumber, InputReader in, PrintWriter out) {
      s = in.next().toCharArray();
      t = in.next().toCharArray();
      next = ArrayUtils.createIntMatrix(26, s.length, s.length);
      int[] sFreq = Strings.frequencyArray(s);
      for (int i = 0; i < t.length; ++i) {
        if (sFreq[t[i]] == 0) {
          out.println(-1);
          return;
        }
      }

      for (char c = 'a'; c <= 'z'; ++c) {
        int last = s.length;
        for (int i = s.length - 1; i >= 0; --i) {
          if (s[i] == c) {
            last = i;
          }
          next[c - 'a'][i] = last;
        }
      }
      int lo = 0, hi = (int) 1e6;
      int ans = -1;
      while (lo <= hi) {
        int mid = (lo + hi) >> 1;
        if (can(mid)) {
          ans = mid;
          hi = mid - 1;
        } else {
          lo = mid + 1;
        }
      }
      out.println(ans);
    }

    private boolean can(int mid) {
      long len = 0;
      int sPt = 0;
      int tPt = 0;
      while (tPt < t.length) {
        if (t[tPt] == s[sPt]) {
          ++sPt;
          ++tPt;
          ++len;
        } else {
          int index = next[t[tPt] - 'a'][sPt];
          if (index >= s.length) {
            len += index - sPt;
            sPt = 0;
          } else {
            len += index - sPt;
            sPt = index;
          }
        }
      }
      return len <= mid;
    }

  }

  static class InputReader implements FastInput {

    final private int BUFFER_SIZE = 1 << 16;
    private DataInputStream din;
    private byte[] buffer;
    private int bufferPointer;
    private int bytesRead;

    public InputReader(InputStream is) {
      din = new DataInputStream(is);
      buffer = new byte[BUFFER_SIZE];
      bufferPointer = bytesRead = 0;
    }

    public InputReader(String file_name) throws IOException {
      din = new DataInputStream(new FileInputStream(file_name));
      buffer = new byte[BUFFER_SIZE];
      bufferPointer = bytesRead = 0;
    }

    public String next() {
      StringBuilder sb = new StringBuilder();
      byte c = read();
      while (c <= ' ') {
        c = read();
      }
      while (c != ' ' && c != '\n' && c != '\t' && c != '\r') {
        sb.append((char) c);
        c = read();
      }
      return sb.toString();
    }

    private void fillBuffer() {
      try {
        bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
      } catch (IOException e) {
        throw new RuntimeException("trying to read from null input, verify constraints ");
      }
      if (bytesRead == -1) {
        buffer[0] = -1;
      }
    }

    private byte read() {
      if (bufferPointer == bytesRead) {
        fillBuffer();
      }
      return buffer[bufferPointer++];
    }

  }

  static interface FastInput {

  }

  static class Strings {

    public static int[] frequencyArray(char[] s) {
      int[] arr = new int[255];
      for (char c : s) {
        arr[c]++;
      }
      return arr;
    }

  }

  static class ArrayUtils {

    public static int[] createIntArray(final int size, final int initialValue) {
      int[] ret = new int[size];
      for (int i = 0; i < size; ++i) {
        ret[i] = initialValue;
      }
      return ret;
    }

    public static int[][] createIntMatrix(final int rows, final int columns,
        final int initialValue) {
      int[][] ret = new int[rows][];
      for (int i = 0; i < rows; ++i) {
        ret[i] = createIntArray(columns, initialValue);
      }
      return ret;
    }

  }
}

