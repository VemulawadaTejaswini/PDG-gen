import java.util.*;
import java.io.*;

public class Main {

    static ArrayList<ArrayList<Integer[]>> tree;
    static int k;
    static int[] ans;
    static boolean[] use;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int n = sc.nextInt();
        tree = new ArrayList<ArrayList<Integer[]>>();
        for (int i = 0; i < n; i++) {
            tree.add(new ArrayList<Integer[]>());
        }
        for (int i = 0; i < n-1; i++) {
            int ma = sc.nextInt() - 1;
            int mb = sc.nextInt() - 1;
            tree.get(ma).add(new Integer[]{mb, i});
            tree.get(mb).add(new Integer[]{ma, i});
        }
        k = 0;
        for (int i = 0; i < tree.size(); i++) {
            k = Math.max(k, tree.get(i).size());
        }

        ans = new int[n-1];
        use = new boolean[n];
        System.out.println(k);

        ans[0] = 0;
        use[0] = true;
        bfs(0, 0);

        for (int mans : ans) {
            System.out.println(mans + 1);
        }

    }

    public static void bfs(int pos, int mcol){
        for (Integer[] next : tree.get(pos)) {
            if(use[next[0]]) continue;
            use[next[0]] = true;
            mcol = (mcol + 1) % k;
            ans[next[1]] = mcol;
            bfs(next[0], mcol);
        }
    }


    public static void update(long[] data, int a, int b, long x, int k, int l, int r){
        if(a <= l && b >= r && data[k] >= x){
            data[k] = x;
        }else if(r-l == 1){
        }else{
            update(data, a, b, x, k*2+1, l, (l+r)/2);
            update(data, a, b, x, k*2+2, (l+r)/2, r);
        }
    }

    public static long get(long[] data, int a, int k, int l, int r){
        if(a < l || a >= r){
            return Long.MAX_VALUE / 2;
        }else if(a == l && a == r-1){
            return data[k];
        }else{
            long tmp1 = get(data, a, k*2+1, l, (l+r)/2);
            long tmp2 = get(data, a, k*2+2, (l+r)/2, r);
            return Math.min(tmp1, Math.min(tmp2, data[k]));
        }
    }


    private static class FastScanner {
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
}
