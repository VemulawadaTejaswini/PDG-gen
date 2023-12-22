import java.util.*;
import java.io.*;
import static java.lang.System.*;

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
  public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
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
  public int nextInt() {
      long nl = nextLong();
      if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
      return (int) nl;
  }
  public double nextDouble() { return Double.parseDouble(next());}
}

class Main {
  public static final int MOD = 1000000007;
  public static final int INF = 1000000000;
  public static void main(String[] args) {
    FastScanner sc = new FastScanner();
    int H = sc.nextInt();
    int W = sc.nextInt();
    int dist[][] = new int[H][W];
    String color[] = new String[H];
    boolean used[][] = new boolean[H][W];
    for(int i=0; i<H; i++){
      color[i] = sc.next();
      Arrays.fill(dist[i], INF);
    }
    dist[0][0] = 1;
    while(true){
      int tmp = INF;
      int a = -1;
      int b = -1;
      for(int i=0; i<H; i++){
        for(int j=0; j<W; j++){
          if(color[i].charAt(j) == '.' && used[i][j] == false && dist[i][j] < tmp){
            a = i;
            b = j;
            tmp = dist[i][j];
          }
        }
      }
      if(tmp == INF) break;
      for(int i=-1; i<2; i++){
        for(int j=-1; j<2; j++){
          if(i != 0 && j != 0) continue;
          if(a+i < 0 || a+i >= H || b+j < 0 || b+j >= W) continue;
          if(color[a+i].charAt(b+j) == '.'){
            dist[a+i][b+j] = Math.min(dist[a][b]+1, dist[a+i][b+j]);
          }
        }
      }
      used[a][b] = true;
      out.println(a + " " + b + " " + dist[a][b]);
    }
    int cnt = 0;
    for(int i=0; i<H; i++){
      for(int j=0; j<W; j++){
        if(color[i].charAt(j) == '.') cnt++;
      }
    }
    if(dist[H-1][W-1] == INF) out.println(-1);
    else out.println(cnt - dist[H-1][W-1]);
  }

  public static int gcd(int a, int b){
    if(b == 0) return a;
    return gcd(b, a%b);
  }
}