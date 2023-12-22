import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int n = sc.nextInt();
        int[][] a = new int[n][n-1];
        for(int i=0; i<n; i++){
            for(int j=0; j<n-1; j++){
                a[i][j] = sc.nextInt() - 1;
            }
        }

        long ans = 1;
        int[] pos = new int[n];
        ArrayDeque<Integer> que = new ArrayDeque<>();
        for(int i=0; i<n; i++){
            que.add(i);
        }

        boolean[] play = new boolean[n];
        Arrays.fill(play, false);
        boolean pflag = false;
        int pwait = -1;
        while(!que.isEmpty()){
            int m = que.poll();
            if(pos[m] == n-1) continue;
            int oppo = a[m][pos[m]];
            if(a[oppo][pos[oppo]] == m){
                que.remove(oppo);
                if(play[m] || play[oppo]){
                    if(!pflag){
                        que.add(m);
                        pflag = true;
                        pwait = m;
                        continue;
                    }else{
                        if(m == pwait){
                            pflag = false;
                        }else{
                            que.add(m);
                            continue;
                        }
                    }
                    ans++;
                    Arrays.fill(play, false);
                }
                pos[m]++;
                pos[oppo]++;
                play[m] = true;
                play[oppo] = true;
                
                if(pos[m] != n-1) que.add(m);
                if(pos[oppo] != n-1) que.add(oppo);
            }
        }

        for(int i=0; i<n; i++){
            if(pos[i] != n-1){
                System.out.println(-1);
                return;
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

