import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.NoSuchElementException;

public class Main {

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        String n = sc.next();
        int k = sc.nextInt();
        int l = n.length();
        int[] nn = new int[l];
        for (int i = 0; i < nn.length; i++) {
            nn[i] = Integer.parseInt(n.charAt(i) + "");
        }

        long ans = 0;
        if(k == 1){
            ans = (l-1) * 9 + nn[0];
        }else if(k == 2){
            for (int i = 0; i < nn.length-1; i++) {
                ans += 9 * 9 * (l-i-2);
            }

            ans += (nn[0]-1) * 9 * (l-1);
            
            int pos = 1;
            for (; pos < nn.length; pos++) {
                if(nn[pos] != 0){
                    break;
                }
            }
            if(pos != l){
                ans += nn[pos] + (l-pos-1) * 9;
            }
        }else{
            ans += 729L * (l-1) * (l-2) * (l-3) / 6;

            ans += (nn[0] - 1L) * (l-1) * (l-2) / 2 * 9 * 9;

            for (int i = 1; i < nn.length - 1; i++) {
                if(nn[i] == 0) continue;
                ans += (nn[i]-1) * 9 * (l-i-1);
                int pos = i+1;
                for (; pos < nn.length; pos++) {
                    if(nn[pos] != 0){
                        break;
                    }
                }
                if(pos < l){
                    ans += nn[pos] + (l-pos-1) * 9;
                }
            }
        }

        System.out.println(ans);

    }



    private static class FastScanner {
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

        private static boolean isPrintableChar(int c) {
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

}

