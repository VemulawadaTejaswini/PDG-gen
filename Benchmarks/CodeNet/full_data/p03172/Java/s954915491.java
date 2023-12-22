import java.io.*;
import java.util.*;

class Main {

  static class Reader {
    private final int BUFFER_SIZE = 1 << 16;
    private DataInputStream din;
    private byte[] buffer;
    private int bufferPointer, bytesRead;

    public Reader() {
      din = new DataInputStream(System.in);
      buffer = new byte[BUFFER_SIZE];
      bufferPointer = bytesRead = 0;
    }

    public Reader(String file_name) throws IOException {
      din = new DataInputStream(new FileInputStream(file_name));
      buffer = new byte[BUFFER_SIZE];
      bufferPointer = bytesRead = 0;
    }

    public String readLine() throws IOException {
      byte[] buf = new byte[64]; // line length
      int cnt = 0, c;
      while ((c = read()) != -1) {
        if (c == '\n') break;
        buf[cnt++] = (byte) c;
      }
      return new String(buf, 0, cnt);
    }

    public int nextInt() throws IOException {
      int ret = 0;
      byte c = read();
      while (c <= ' ') c = read();
      boolean neg = (c == '-');
      if (neg) c = read();
      do {
        ret = ret * 10 + c - '0';
      } while ((c = read()) >= '0' && c <= '9');

      if (neg) return -ret;
      return ret;
    }

    public long nextLong() throws IOException {
      long ret = 0;
      byte c = read();
      while (c <= ' ') c = read();
      boolean neg = (c == '-');
      if (neg) c = read();
      do {
        ret = ret * 10 + c - '0';
      } while ((c = read()) >= '0' && c <= '9');
      if (neg) return -ret;
      return ret;
    }

    public double nextDouble() throws IOException {
      double ret = 0, div = 1;
      byte c = read();
      while (c <= ' ') c = read();
      boolean neg = (c == '-');
      if (neg) c = read();

      do {
        ret = ret * 10 + c - '0';
      } while ((c = read()) >= '0' && c <= '9');

      if (c == '.') {
        while ((c = read()) >= '0' && c <= '9') {
          ret += (c - '0') / (div *= 10);
        }
      }

      if (neg) return -ret;
      return ret;
    }

    private void fillBuffer() throws IOException {
      bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
      if (bytesRead == -1) buffer[0] = -1;
    }

    private byte read() throws IOException {
      if (bufferPointer == bytesRead) fillBuffer();
      return buffer[bufferPointer++];
    }

    public void close() throws IOException {
      if (din == null) return;
      din.close();
    }
  }

  // static final Scanner in = new Scanner(System.in);
  static final Reader in = new Reader();
  static final PrintWriter out = new PrintWriter(System.out);
  static int N, K;

  static int[] a;
  static int dp[][];
  static final int MOD = 1000000007;
  static int pre[][];

  public static void main(String[] args) throws Exception {
    N = in.nextInt();
    K = in.nextInt();
    a = new int[N];
    dp = new int[N + 1][K + 1];
    pre = new int[N + 1][K + 1];

    for (int i = 0; i < N; i++) {
      a[i] = in.nextInt();
      Arrays.fill(dp[i], -1);
      Arrays.fill(pre[i], -1);
    }

    Arrays.fill(dp[N], -1);
    Arrays.fill(pre[N], -1);
    
    out.println(F());

    // out.println(Arrays.deepToString(dp));
    // out.println(Arrays.deepToString(pre));

    out.close();
  }

  static int F() {

    //..base case, fill the 0th row directly
    dp[0][0] = 1;
    pre[0][0] = 1;
    for (int k = 1; k <= K; k++) {

      if (a[0] >= k) 
        dp[0][k] = 1; 
      else 
        dp[0][k] = 0;

      pre[0][k] = pre[0][k - 1] + dp[0][k];
    }

    //..now start traversing the matrix row by row and
    //..fill both the matrices dp[][] and pre[][].
    for (int i = 1; i < N; i++) {
      for (int k = 0; k <= K; k++) {
        
        int val = pre[i - 1][k] + MOD;

        if (k - a[i] > 0) 
          val -= pre[i - 1][k - a[i] - 1];

        val %= MOD;

        dp[i][k] = val; //..dp[][] cell filled

        //..calculate the prefix sum for cell (i,k)
        pre[i][k] = dp[i][k];
        if(k > 0)
          pre[i][k]  += pre[i][k-1];

        pre[i][k] %= MOD; //..don't forget the MOD
      }
    }

    return dp[N-1][K]; 
  }
}
