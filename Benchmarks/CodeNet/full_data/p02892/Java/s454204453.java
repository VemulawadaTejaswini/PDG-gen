import java.util.*;
import java.io.*;

public class Main {
    static int n;
    static boolean[][] map;
    static ArrayList<ArrayList<Integer>> next;
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        n = sc.nextInt();
        map = new boolean[n][n];
        next = new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<n; i++){
            ArrayList<Integer> mList = new ArrayList<Integer>();
            String s = sc.next();
            for(int j=0; j<n; j++){
                if(s.charAt(j) == '1'){
                    map[i][j] = true;
                    mList.add(j);
                }else{
                    map[i][j] = false;
                }
            }
            next.add(mList);
        }

        int mmax = 0;
        for(int i=0; i<n; i++){
            int[] len = new int[n];
            ArrayDeque<Integer[]> que = new ArrayDeque<Integer[]>();
            que.add(new Integer[]{i, 0});
            Arrays.fill(len, -1);
            len[i] = 0;
            int max = 0;
            while(!que.isEmpty()){
                Integer[] mque = que.poll();
                for(int mnext : next.get(mque[0])){
                    if(len[mnext] == -1){
                        len[mnext] = mque[1] + 1;
                        que.add(new Integer[]{mnext, mque[1] + 1});
                        max = Math.max(max, mque[1] + 1);
                    }else{
                        if(len[mnext] % 2 != (mque[1] + 1) % 2){
                            System.out.println(-1);
                            return;
                        }
                    }
                }
            }
            mmax = Math.max(mmax, max);
        }

        System.out.println(mmax+1);
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

