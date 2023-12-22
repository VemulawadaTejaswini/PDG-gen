import java.io.*;
import java.util.*;

class Main {
  static class Reader 
    { 
        final private int BUFFER_SIZE = 1 << 16; 
        private DataInputStream din; 
        private byte[] buffer; 
        private int bufferPointer, bytesRead; 
  
        public Reader() 
        { 
            din = new DataInputStream(System.in); 
            buffer = new byte[BUFFER_SIZE]; 
            bufferPointer = bytesRead = 0; 
        } 
  
        public Reader(String file_name) throws IOException 
        { 
            din = new DataInputStream(new FileInputStream(file_name)); 
            buffer = new byte[BUFFER_SIZE]; 
            bufferPointer = bytesRead = 0; 
        } 
  
        public String readLine() throws IOException 
        { 
            byte[] buf = new byte[64]; // line length 
            int cnt = 0, c; 
            while ((c = read()) != -1) 
            { 
                if (c == '\n') 
                    break; 
                buf[cnt++] = (byte) c; 
            } 
            return new String(buf, 0, cnt); 
        } 
  
        public int nextInt() throws IOException 
        { 
            int ret = 0; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
            do
            { 
                ret = ret * 10 + c - '0'; 
            }  while ((c = read()) >= '0' && c <= '9'); 
  
            if (neg) 
                return -ret; 
            return ret; 
        } 
  
        public long nextLong() throws IOException 
        { 
            long ret = 0; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
            do { 
                ret = ret * 10 + c - '0'; 
            } 
            while ((c = read()) >= '0' && c <= '9'); 
            if (neg) 
                return -ret; 
            return ret; 
        } 
  
        public double nextDouble() throws IOException 
        { 
            double ret = 0, div = 1; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
  
            do { 
                ret = ret * 10 + c - '0'; 
            } 
            while ((c = read()) >= '0' && c <= '9'); 
  
            if (c == '.') 
            { 
                while ((c = read()) >= '0' && c <= '9') 
                { 
                    ret += (c - '0') / (div *= 10); 
                } 
            } 
  
            if (neg) 
                return -ret; 
            return ret; 
        } 
  
        private void fillBuffer() throws IOException 
        { 
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE); 
            if (bytesRead == -1) 
                buffer[0] = -1; 
        } 
  
        private byte read() throws IOException 
        { 
            if (bufferPointer == bytesRead) 
                fillBuffer(); 
            return buffer[bufferPointer++]; 
        } 
  
        public void close() throws IOException 
        { 
            if (din == null) 
                return; 
            din.close(); 
        } 
    } 
  
  // static final Scanner in = new Scanner(System.in);
  static final Reader in = new Reader();
  static final PrintWriter out = new PrintWriter(System.out);
  static int N, K;

  static int[] a;
  static long dp[][][];

  static class Pair {
    long curr_val, other_val;

    Pair(int l, int r) {
      curr_val = l;
      other_val = r;
    }

    @Override
    public String toString() {
      return "(" + curr_val + " , " + other_val + ")";
    }
  }

  public static void main(String[] args) throws Exception {
    N = in.nextInt();

    a = new int[N];

    for (int i = 0; i < N; i++) a[i] = in.nextInt();
    dp = new long[N][N][2];
    for(int i = 0;i < N;i++){
      for(int j = 0;j < N;j++)
        Arrays.fill(dp[i][j],-1);
    }

    out.println(F(0, N - 1,0));
    out.close();
  }

  static long F(int l, int r,int player) {
    // System.out.println("l = " + l + " r = " + r);
    if (l == r) {
      if(player == 0)
        return a[l];
      return -1 * a[l];  
    }

    if (dp[l][r][player] != -1) return dp[l][r][player];

    
    long val = 0;
    if(player == 0){
      long left = F(l+1,r,1) + a[l];
      long right = F(l,r-1,1) + a[r];
      val = Math.max(left, right);
    }
    else{
      long left = F(l+1,r,0) - a[l];
      long right = F(l,r-1,0) - a[r];
      val = Math.min(left, right);
    }

    dp[l][r][player] = val;
    return val;
  }

  // static void F() {
  //   for (int k = 1; k <= a[0] && k <= K; k++) {
  //     dp[k] = false;
  //   }

  //   for (int k = a[0]; k <= K; k++) {
  //     boolean win_state = false;
  //     for (int i = 0; i < N; i++) {
  //       if (k < a[i]) break;
  //       if (!dp[k - a[i]]) win_state = true;
  //     }
  //     dp[k] = win_state;
  //   }
  // }
}
