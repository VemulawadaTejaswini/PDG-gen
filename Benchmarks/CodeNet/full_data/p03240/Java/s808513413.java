import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.*;
class Main {

    public static void main(String[] args) throws IOException {
        FastR in = new FastR(System.in);
        StringBuilder st = new StringBuilder();
        int n = in.nextInt();
        int x[]=new int[n];
        int y[]=new int[n];
        int h[]=new int[n];
        for(int i=0;i<n;i++){
            x[i]=in.nextInt();
            y[i]=in.nextInt();
            h[i]=in.nextInt();
        }
        boolean f = false;
        for(int i=0;i<=1000;i++) {
            for (int j = 0; j <= 1000; j++) {
                long ans = 0;
                for (int m = 0; m < n; m++) {
                    ans += h[m] + (int) Math.abs(i - x[m]) + (int) Math.abs(j - y[m]);


                }

                if (ans % n == 0) {
                    System.out.println(i + " " + j + " " + ans / n);
                    f = true;
                    break;

                }
            }
            if (f)
                break;
        }
    }
}
class FastR{

    byte[] buf = new byte[2048];
    int index, total;
    InputStream in;

    FastR(InputStream is) {
        in = is;
    }

    int scan() throws IOException {
        if (index >= total) {
            index = 0;
            total = in.read(buf);
            if (total <= 0) {
                return -1;
            }
        }
        return buf[index++];
    }

    String next() throws IOException {
        int c;
        for (c = scan(); c <= 32; c = scan());
        StringBuilder sb = new StringBuilder();
        for (; c > 32; c = scan()) {
            sb.append((char) c);
        }
        return sb.toString();
    }

    int nextInt() throws IOException {
        int c, val = 0;
        for (c = scan(); c <= 32; c = scan());
        boolean neg = c == '-';
        if (c == '-' || c == '+') {
            c = scan();
        }
        for (; c >= '0' && c <= '9'; c = scan()) {
            val = (val << 3) + (val << 1) + (c & 15);
        }
        return neg ? -val : val;
    }

    long nextLong() throws IOException {
        int c;
        long val = 0;
        for (c = scan(); c <= 32; c = scan());
        boolean neg = c == '-';
        if (c == '-' || c == '+') {
            c = scan();
        }
        for (; c >= '0' && c <= '9'; c = scan()) {
            val = (val << 3) + (val << 1) + (c & 15);
        }
        return neg ? -val : val;
    }
}