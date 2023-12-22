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
    int N = sc.nextInt();
    int A[][] = new int[N][N-1];
    for(int i=0; i<N; i++){
      for(int j=0; j<N-1; j++){
        A[i][j] = sc.nextInt()-1;
      }
    }
    boolean used[][] = new boolean[N][N-1];
    int cnt[] = new int[N];
    List<Integer> change = new ArrayList<Integer>();
    for(int i=0; i<N; i++){
      if(!used[i][0] && !used[A[i][0]][0] && A[A[i][0]][0] == i){
        used[i][0] = true;
        used[A[i][0]][0] = true;
        if(cnt[i] != N-2){
          change.add(i);
        }
        if(cnt[A[i][0]] != N-2){
          change.add(A[i][0]);
        }
      }
    }
    for(int z : change){
      if(cnt[z] != N-2) cnt[z]++;
     }
    int ans = 1;
    while(!change.isEmpty() ){
      ans++;
      List<Integer> tmp = new ArrayList<Integer>();
      for(int x : change){
        int y = A[x][cnt[x]];
        if((!used[x][cnt[x]]) && (!used[y][cnt[y]]) && (x == A[y][cnt[y]]) ){
          used[x][cnt[x]] = true;
          used[y][cnt[y]] = true;
          if(cnt[x] != N-2){
            tmp.add(x);
          }
          if(cnt[y] != N-2){
            tmp.add(y);
          }
        }
      }
      for(int z : tmp){
        if(cnt[z] != N-2) cnt[z]++;
      }
      change = tmp;
    }
    boolean check = true;
    for(int i=0; i<N; i++){
      if(cnt[i] != N-2) check = false;
    }
    if(check) out.println(ans);
    else out.println(-1);
  }
}