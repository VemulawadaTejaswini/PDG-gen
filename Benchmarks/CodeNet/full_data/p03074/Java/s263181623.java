import java.io.*;
import java.util.*;

class Main {
    static class FastScanner {
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

    static class BIT {
        // Genericにはできないので、long以外であれば、replaceする
        final long[] data; // 0-indexed: 0 to N (inclusive)

        public BIT(int n) {
            data = new long[n+1];
        }

        // Add x at index (0-indexed) in O(log(N))
        public void add(int index, long x) {
            for (int i=index; i<data.length; i |= i+1) {
                data[i] += x;
            }
        }

        // Return a sum of [0, index) in O(log(N))
        long sum(int index) {
            long ret = 0;
            for (int i=index-1; i>=0; i=(i&(i+1))-1) {
                ret += data[i];
            }
            return ret;
        }

        // Return a sum of [s, e) in O(log(N))
        long sum(int s, int e) {
            return sum(e) - sum(s);
        }
    }

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        // * word: next()
        // * integer: nextInt(), nextLong()
        // * string: nextLine()
        int N = sc.nextInt();
        int K = sc.nextInt();
        String S = sc.next();

        BIT bit = new BIT(N+1);

        for (int i=1; i<N; i++) {
          if (S.charAt(i-1) == S.charAt(i)) continue;

          if (S.charAt(i-1) == '0') { // 01
            bit.add(i-1, 1);
          } else {
            bit.add(i, 1); //10
          }
        }
        if (S.charAt(0)   == '0') bit.add(0,  1);
        if (S.charAt(N-1) == '0') bit.add(N-1,1);

        // [i, j)
        int i=0;
        int j=1;
        int ret = 0;
        while (i<j && j<=N) {
          if (j!=N && S.charAt(j-1) == '0') {
            j++;
            continue;
          }

          long curK = bit.sum(i, j);
          //System.err.printf("i,j: %d, %d  curK: %d\n", i, j, curK);
          if (curK > 2*K) {
            i++;
            continue;
          }

          ret = Math.max(ret, j-i);
          //System.err.printf("i,j: %d, %d  ret %d (curK: %d)\n", i, j, ret, curK);
          j++;
        }

        System.out.println(ret);
    }
}
