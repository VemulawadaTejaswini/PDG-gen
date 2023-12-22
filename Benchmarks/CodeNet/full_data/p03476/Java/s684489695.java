import java.util.*;
import java.io.*;
class Main {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int Q = sc.nextInt();
        int start = 1;
        int end = 1;
        int[] prime = new int[100001];
        int[] pcnt = new int[100001];

        int num = 100000;
        boolean isPrime = false;
        int count = 2;
        prime[3] = 1;
        prime[2] = 1;
        for (int i = 5; i <= num; i += 2) {
            // 素数判定対象(i)は素数判定対象(j)の平方根以下で除算する
            for (int j = 2; j * j <= i; j++) {
                // 除算できた場合は素数ではないため判定から抜ける
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
                isPrime = true;
            }
            if (isPrime) {
                prime[i] = 1; // 素数をカウント
                // 遅くなるのでコメントアウト
                // System.out.println("PrimeNumber -> " + i);
            }
        }
        for(int i = 2; i<=100000; i++) {
            int j = (i+1)/2;
            if(prime[i] == 1 && prime[j] == 1) pcnt[i] = pcnt[i-1]+1;
            else pcnt[i] = pcnt[i-1];
        }

        for(int i = 0; i<Q; i++) {
            start = sc.nextInt();
            end = sc.nextInt();
            System.out.println(pcnt[end] - pcnt[start-1]);
        }
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
        if (hasNextByte())
            return buffer[ptr++];
        else
            return -1;
    }
 
    private boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }
 
    public boolean hasNext() {
        while (hasNextByte() && !isPrintableChar(buffer[ptr]))
            ptr++;
        return hasNextByte();
    }
 
    public String next() {
        if (!hasNext())
            throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }
 
    public long nextLong() {
        if (!hasNext())
            throw new NoSuchElementException();
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