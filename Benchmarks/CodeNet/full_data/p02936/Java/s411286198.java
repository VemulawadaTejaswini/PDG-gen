import java.util.*;
 
public class Main {
 
  public static ArrayList[] edge;
  public static long[] point;
  public static boolean[] visit;
  public static void main(String[] args) {
    FastScanner sc = new FastScanner(System.in);
    int n = sc.nextInt();
    int q = sc.nextInt();
    point = new long[n];
    edge = new ArrayList[n];
    int[] c = new int[n];
    for(int i = 0; i < n - 1; i++) {
      int a = sc.nextInt() - 1;
      int b = sc.nextInt() - 1;
      if(c[a] == 0) {
        c[a] = 1;
        edge[a] = new ArrayList<Integer>();
      }
      if(c[b] == 0) {
        c[b] = 1;
        edge[b] = new ArrayList<Integer>();
      }      
      edge[a].add(b);
      edge[b].add(a);
    }
    
    for(int i = 0; i < q; i++) {
      int p = sc.nextInt() - 1;
      long x = sc.nextLong();
      point[p] += x;
    } 
 
    dfs(0, -1);
    for(int i = 0; i < n; i++) {
      System.out.print(point[i] + " ");
    }
  }
 
  public static void dfs(int v, int p) {
    ArrayList<Integer> list = edge[v];
    long x = point[v];
    for(int i = 0; i < list.size(); i++) {
      int t = list.get(i);
 
      if(t != p) {
        point[t] += x;
        dfs(t, v);
      }
    }
  }
}

public class FastScanner {
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