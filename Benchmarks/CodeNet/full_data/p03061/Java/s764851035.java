import java.io.*;
import java.util.*;
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

  static int gcd(int a,int b) {
    if(b == 0) { return a;}
    return gcd(b, a%b);
  }

  static int arrayGCD(int[] a, int max) {
    for(int i=1; i<a.length; i++) {
      a[i] = gcd(a[i-1],a[i]);
      if(a[i] >= max) {
        return 0;
      }
    }
    return a[a.length-1];
  }

  static int[] remove(int[] a,int idx) {
    int[] x = new int[a.length-1];
    int j = 0;
    for(int i = 0; i<a.length; i++) {
      if(i != idx) {
        x[j] = a[i];
        j++;
      }
    }
    return x;
  }

  public static void main(String[] args) {
    FastScanner stdIn = new FastScanner();
    int n = stdIn.nextInt();
    int[] a = new int[n];
    for(int i = 0; i<n; i++) {
      a[i] = stdIn.nextInt();
    }

    int[] b = new int[n];
    int max = 0;
    for(int i=0; i<n; i++) {
      b[i] = arrayGCD(remove(a,i), max);
      if(b[i] > max) {
        max = b[i];
      }
    }
    System.out.println(max);
  }
}