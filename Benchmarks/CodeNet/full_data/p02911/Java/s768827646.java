import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
public class Main {
    private static Reader scn = new Reader();
    private static OutputStream out = new BufferedOutputStream(System.out);
    private static final int delta = (int) 1e9 + 7;

    private static class Reader {
        
        final private int BUFFER_SIZE = 1 << 16;
        private final DataInputStream din;
        private final byte[] buffer;
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
            byte[] buf = new byte[1024];
            int cnt = 0, c;
            while ((c = read()) != -1) {
                if (c == '\n') {
                    break;
                }
                buf[cnt++] = (byte) c;
            }
            return new String(buf, 0, cnt);
        }
        
        public int nextInt() throws IOException {
            int ret = 0;
            byte c = read();
            while (c <= ' ') {
                c = read();
            }
            boolean neg = (c == '-');
            if (neg) {
                c = read();
            }
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');
            
            if (neg) {
                return -ret;
            }
            return ret;
        }
        
        public long nextLong() throws IOException {
            long ret = 0;
            byte c = read();
            while (c <= ' ') {
                c = read();
            }
            boolean neg = (c == '-');
            if (neg) {
                c = read();
            }
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');
            if (neg) {
                return -ret;
            }
            return ret;
        }
        
        public double nextDouble() throws IOException {
            double ret = 0, div = 1;
            byte c = read();
            while (c <= ' ') {
                c = read();
            }
            boolean neg = (c == '-');
            if (neg) {
                c = read();
            }
            
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');
            
            if (c == '.') {
                while ((c = read()) >= '0' && c <= '9') {
                    ret += (c - '0') / (div *= 10);
                }
            }
            
            if (neg) {
                return -ret;
            }
            return ret;
        }
        
        private void fillBuffer() throws IOException {
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
            if (bytesRead == -1) {
                buffer[0] = -1;
            }
        }
        
        private byte read() throws IOException {
            if (bufferPointer == bytesRead) {
                fillBuffer();
            }
            return buffer[bufferPointer++];
        }
        
        public void close() throws IOException {
            if (din == null) {
                return;
            }
            din.close();
        }
        
        public int[] nextArray(int n) throws IOException {
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = nextInt();
            }
            return arr;
        }
    }
    private static void print(Object str) {
        try {
            out.write(str.toString().getBytes());
        } catch (IOException e) {
        }
    }
    private static void println(Object str) {
        try {
            out.write((str.toString() + "\n").getBytes());
        } catch (IOException e) {
        }
    }
    private static long add(long a, long b) {
        return add(a, b, delta);
    }
    private static long add(long a, long b, long mod) {
        return ((a % mod) + (b % mod)) % mod;
    }
    private static long multiply(long a, long b) {
        return ((a % delta) * (b % delta)) % delta;
    }
    private static double multiply(double a, double b) {
        return ((a % delta) * (b % delta)) % delta;
    }
    private static long pow(int base, int pow) {
        if (pow == 0) {
            return 1;
        }
        if (pow == 1) {
            return base;
        }
        long halfPow = pow(base, pow / 2);
        if ((pow & 1) == 0) {
            return multiply(halfPow, halfPow);
        }
        return multiply(halfPow, multiply(base, halfPow));
    }
    private static long gcd(long a, long b) {
        if (a == 0 || b == 0) {
            return a == 0 ? b : a;
        }
        return gcd(b, a % b);
    }
    private static long kadane(int[] arr) {
        int size = arr.length;
        long max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        
        for (int anArr : arr) {
            max_ending_here = max_ending_here + anArr;
            if (max_so_far < max_ending_here) {
                max_so_far = max_ending_here;
            }
            if (max_ending_here < 0) {
                max_ending_here = 0;
            }
        }
        return max_so_far;
    }
    
    public static void main(String args[] ) throws Exception {
        int n = scn.nextInt();
        int k = scn.nextInt();
        int q = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
            arr[i]=k;
        while(q-->0){
            int a = scn.nextInt();
            for(int i = 0; i < n; i++){
                if(i!=a)
                    arr[i]--;
            }
        }
        for(int i : arr){
            println(i>0?"Yes":"No");
        }
        out.flush();
    }
}
