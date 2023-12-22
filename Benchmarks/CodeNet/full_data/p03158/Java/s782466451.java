import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        FastScanner sc = new FastScanner(System.in);
        int N=sc.nextInt();
        int Q=sc.nextInt();
        int[] A=new int[N];
        for(int i=0;i<N;i++){
            A[N-i-1]=Integer.parseInt(sc.next());
        }
        int[] X=new int[Q];
        for(int i=0;i<Q;i++){
            X[i]=Integer.parseInt(sc.next());
        }
        int B=(N+1)/2;
        int border[]=new int[B];
        for(int i=0;i<B;i++){
            border[i]=(A[i]+A[i*2])/2;
        }
        long result[]=new long[B];
        for(int i=0;i<B;i++){
            result[0]+=A[i*2];
        }
        for(int i=1;i<B;i++){
            result[i]=result[i-1]+A[i]-A[2*i];
        }
        PrintWriter out = new PrintWriter(System.out);



            for (int i = 0; i < Q; i++) {
                int x1 = 0;
                int x2 = (N + 1) / 2 - 1;
                while (true) {
                    int xm = (x1 + x2) / 2;
                    if (border[xm] > X[i]) {
                        x1 = xm;
                    } else {
                        x2 = xm;
                    }
                    if (x2 - x1 == 1) {
                        break;
                    }
                }
                if (border[x2] < X[i]) {
                    out.println(result[x2 - 1]);
                } else {
                    out.println(result[x2]);
                }
            }


        out.flush();


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
        private boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
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


}