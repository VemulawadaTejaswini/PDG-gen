import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) {
        FastScanner fsc = new FastScanner();
        int n = fsc.nextInt();
        char[] s = fsc.next().toCharArray();
        fsc.close();
        HashMap<StringPair, Long> pattern = new HashMap<>();
        for (int i = 0; i < (1 << n); i++) {
            StringBuilder red = new StringBuilder();
            StringBuilder blue = new StringBuilder();
            for (int j = n; j < 2 * n; j++) {
                if ((i & (1 << (j - n))) != 0) {
                    red.append(s[j]);
                } else {
                    blue.append(s[j]);
                }
            }
            StringPair sp = new StringPair(red.toString(), blue.toString());
            if (!pattern.containsKey(sp)) {
                pattern.put(sp, 1l);
            } else {
                pattern.put(sp, pattern.get(sp) + 1l);
            }
        }

        // for(Map.Entry<StringPair, Long> e:pattern.entrySet()){
        //     System.out.println("Pair: "+e.getKey()+",  Num: "+e.getValue());
        // }
        
        long ans = 0;
        for (int i = 0; i < (1 << n); i++) {
            StringBuilder red = new StringBuilder();
            StringBuilder blue = new StringBuilder();
            for (int j = n - 1; j >= 0; j--) {
                if ((i & (1 << j)) != 0) {
                    blue.append(s[j]);
                } else {
                    red.append(s[j]);
                }
            }
            StringPair sp = new StringPair(red.toString(), blue.toString());
            //System.out.println(red+", "+blue);
            if (pattern.containsKey(sp)) {
                ans += pattern.get(sp);
            }
        }
        System.out.println(ans);
    }

    static class StringPair {
        String str1;
        String str2;

        StringPair(String str1, String str2) {
            this.str1 = str1;
            this.str2 = str2;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            } else if (!(o instanceof StringPair)) {
                return false;
            } else {
                StringPair sp = (StringPair) o;
                return str1.equals(sp.str1) && str2.equals(sp.str2);
            }
        }

        @Override
        public int hashCode() {
            return Objects.hash(str1, str2);
        }

        @Override
        public String toString(){
            return "("+str1+", "+str2+")";
        }
    }

    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int buflen = 0;

        private boolean hasNextByte() {
            if (ptr < buflen)
                return true;
            else {
                ptr = 0;
                try {
                    buflen = in.read(buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (buflen <= 0)
                    return false;
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
            if (b < '0' || '9' < b)
                throw new NumberFormatException();
            while (true) {
                if ('0' <= b && b <= '9') {
                    n *= 10;
                    n += b - '0';
                } else if (b == -1 || !isPrintableChar(b))
                    return minus ? -n : n;
                else
                    throw new NumberFormatException();
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

        public void close() {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
