import java.util.*;
import java.io.*;
import java.util.stream.Collectors;

public class Main {
    public static final long MOD = 1000000007;
    public static final int INF = 1 << 15;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        Integer i,j,k,n=0,m=0,h=0,w=0;
        long a=0,b=0,c=0,x=0,y=0,z=0,ans=0;
        List<Integer> l = new ArrayList<>();
        List<String> s = new ArrayList<>();
        List<Pair> p = new ArrayList<>();
        List<List<Integer>> ll = new ArrayList<>();
        Set<String> st = new HashSet<>();

        n = sc.nextInt();
        k = sc.nextInt();

        int[][] field = new int[n][2];

        long[][] dp = new long[n][k+1];

        for(i=0;i<n;i++)
            for(j=0;j<2;j++)
                field[i][j]=sc.nextInt();

        for(i=0;i<n;i++)
            for(j=0;j<k+1;j++)
                dp[i][j]=0;

        for(i=0;i<n;i++){
            if(i==0){
                for(j=field[i][0];j<k+1;j++)
                    dp[i][j]=field[i][1];
            }else{
                for(j=0;j<k+1;j++){
                    if(j>=field[i][0])
                        dp[i][j] = Math.max(dp[i][j],dp[i-1][j-field[i][0]]+field[i][1]);
                    dp[i][j]=Math.max(dp[i][j],dp[i-1][j]);
                }
            }
        }
        print(dp[n-1][k]);
    }

    private static void print(Object o) {
        System.out.println(o.toString());
    }

    private static long lcm(long m, long n) {
        return m * n / gcd(m, n);
    }

    private static long gcd(long m, long n) {
        if(m < n) return gcd(n, m);
        if(n == 0) return m;
        return gcd(n, m % n);
    }

    private static class Pair {
        private int key;
        private int value;

        public Pair(int key, int value){
            this.key=key;
            this.value=value;
        }

        public int getValue(){
            return this.value;
        }

        public int getKey(){
            return this.key;
        }

        public void setValue(int value){
            this.value = value;
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
