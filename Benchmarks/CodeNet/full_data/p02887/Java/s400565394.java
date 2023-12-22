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
    CSlimes solver = new CSlimes();
    solver.solve(1, in, out);
    out.close();
  }

  static class CSlimes {

    public void solve(int testNumber, InputReader in, PrintWriter out) {
      int n = in.nextInt();
      char[] s = in.next().toCharArray();
      int ans = 0;
      char last = '0';
      for (int i = 0; i < n; ++i) {
        if (s[i] != last) {
          ++ans;
        }
        last = s[i];
      }
      out.println(ans);
    }

  }

  static interface FastInput {

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
      while (isEmptySpace(c)) {
        sb.append((char) c);
        c = read();
      }
      return sb.toString();
    }

    private boolean isEmptySpace(byte c) {
      return c != ' ' && c != '\n' && c != '\t' && c != '\r';
    }

    public int nextInt() {
      int ret = 0;
      byte c = read();
      while (c <= ' ') {
        c = read();
      }
      boolean neg = (c == '-');
      if (neg) {
        c = read();
      }
      do {
        ret = ret * 10 + c - '0';
      } while ((c = read()) >= '0' && c <= '9');

      if (neg) {
        return -ret;
      }
      return ret;
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
}

