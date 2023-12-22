import java.util.*;
import java.io.*;

public class Main{
  public static void main(String[]args){
    FastScanner sc = new FastScanner();
    int N = Integer.parseInt(sc.next());
    int[][] order = new int[N+1][N];
    for(int i = 1; i <= N; i++){
      for(int j = 1; j <= N-1; j++){
        order[i][j] = Integer.parseInt(sc.next());
      }
    }

    int[] M = new int[N+1];
    for(int i = 1; i <= N; i++){
      M[i] = 1;
    }
    int ans = 0;
    int count = 0;
    boolean flag = true;
    boolean[] c = new boolean[N+1];
    while(count < N*(N-1)){
      flag = true;
      for(int i = 1; i <= N; i++){
        int n = order[i][M[i]];
        if(i == order[n][M[n]]){
          flag = false;
          c[i] = true;
          
        }
      }
        
      for(int j = 1; j <= N; j++){
        if(c[j]){
          c[j] = false;
          count++;
          M[j]++;
          if(M[j] == N){
            M[j] = 0;
          }
        }
      }
      if(flag){
        System.out.println(-1);
        return;
      }
      ans++;
    }
    System.out.println(ans);
  }
}

class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    private boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        }else{
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
    private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
    private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
    private void skipUnprintable() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;}
    public boolean hasNext() { skipUnprintable(); return hasNextByte();}
    public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while(isPrintableChar(b)) {
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
        while(true){
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            }else if(b == -1 || !isPrintableChar(b)){
                return minus ? -n : n;
            }else{
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
}