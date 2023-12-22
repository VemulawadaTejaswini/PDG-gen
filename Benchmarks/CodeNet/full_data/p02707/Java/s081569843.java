import java.util.*;
import java.io.*;
 
public class Main {
  public static void main(String[] args) throws Exception{
    FastScanner sc = new FastScanner(System.in);
    int n = sc.nextInt();
    int[] num = new int[n - 1];
    for(int i = 0; i < n - 1; ++i) {
      num[i] = sc.nextInt();
    }
    new Solution(n, num);
  }
}

class Solution {
  private int[] size;
  private int[] id;
  public Solution(int n, int[] num) {
    size = new int[n];
    id = new int[n];
    for(int i = 0; i<n; ++i) {
      id[i] = i;
      size[i] = 1;
    }
    for(int i = 1; i < n; ++i) {
      int p = i;
      id[p] = num[i - 1] - 1;
      size[id[p]] += size[p];
    }
    for(int i = 0; i<n; ++i) {
      System.out.println(size[i] - 1);
    }
    // System.out.println(res);
  }
}
class UF {
    private int[] id;
    private int[] size;
    private int count;
    public UF(int n) {
        id = new int[n];
        size = new int[n];
        count = n;
        for(int i = 0; i<n; ++i) {
            id[i] = i;
            size[i] = 1;
          }
    }
    public int countNum() {
        return count;
    }

    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }
    
    public int find(int p) {
        while(p != id[p]) {
            id[p] = id[id[p]];
            p = id[p];
        }
        return p;
    }
    
    public void union(int p, int q) {
        int pRoot = find(p);
        int qRoot = find(q);
        if(pRoot == qRoot) return;
        if(size[qRoot] > size[pRoot]) {
          id[pRoot] = qRoot; 
          size[qRoot] += size[pRoot];
        } else {
          id[qRoot] = pRoot;
          size[pRoot] += size[qRoot];
        }
        --count;
    }
}
class FastScanner {
  private final InputStream in;
  private final byte[] buffer = new byte[1024];
  private int ptr = 0;
  private int buflen = 0;

  public FastScanner(InputStream source) {
    in = source;
  }

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

  public boolean hasNext() {
    while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
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
    long nl = nextLong();
    if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
      throw new NumberFormatException();
    return (int) nl;
  }

  public double nextDouble() {
    return Double.parseDouble(next());
  }
}