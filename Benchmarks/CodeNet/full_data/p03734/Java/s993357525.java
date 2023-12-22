import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        ConsoleIO io = new ConsoleIO(new InputStreamReader(System.in), new PrintWriter(System.out));
        //String test = "B-large-practice";
        //ConsoleIO io = new ConsoleIO(new FileReader("D:\\Dropbox\\code\\practice\\jb\\src\\" + test + ".in"), new PrintWriter(new File("D:\\Dropbox\\code\\practice\\jb\\src\\" + test + "-out.txt")));

        new Main(io).solve();
        io.close();
    }

    ConsoleIO io;
    Main(ConsoleIO io) {
        this.io = io;
    }

    long MOD = 1_000_000_007;
    List<List<Integer>> gr = new ArrayList<>();

    public void solve() {
        int N = io.ri();
        long W = io.ri();
        Piece[] all = new Piece[N];
        long sum = 0;
        for(int i =0;i<N;i++){
            int a = io.ri();
            int b= io.ri();
            all[i] = new Piece(b,a);
            sum+=a;
        }

        long res = 0;
        if(sum <= W) {
            for(int i = 0;i<N;i++)
                res+=all[i].c;
            io.writeLine(res+"");
            return;
        }

        if(N==1 || all[0].w>W) {
            io.writeLine("0");
            return;
        }

        if(W*N<=10_000_000L){
            res = calc(all, (int)W);
            io.writeLine(res+"");
            return;
        }

        int k1 = N, k2 = N;
        int w1 = (int)W, w2 = (int)W;

        if(all[0].w>1) {
            k1 = (int)W / (all[0].w - 1);
            w1 = (int)W % (all[0].w - 1);

            k2 = k1-1;
            w2 = (int)W - k2*(all[0].w - 1);

            for (int i = N; i >= 0; i--) {
                all[i].w -= all[0].w - 1;
            }
        }
        Arrays.sort(all, (p1, p2) -> p1.c > p2.c ? -1 : (p1.c < p2.c ? 1 : 0));
        io.writeLine(Math.max(ccc(all, w1, k1), ccc(all, k2,w2)) + "");
    }

    long ccc(Piece[] all, int W, int k){

        long sum = 0;
        long res=  0;
        for(int i = 0;i<k;i++) {
            sum += all[i].w;
            res+=all[i].c;
        }

        if(sum<=W){
            return res;
        }

        long[][] dp = new long[k+1][(int)W+1];
        for (int q = 0; q < all.length; q++) {
            Piece p = all[q];
            for(int i = Math.min(q+1,k);i>0;i--) {
                long[] wi = dp[i];
                long[] wi1 = dp[i - 1];
                for (int j = (int)W; j > 0; j--) {
                    wi[j] = Math.max(wi[j-1], wi1[j]);
                    if (p.w <= j) {
                        wi[j] = Math.max(wi[j], wi1[j - p.w] + p.c);
                    }
                }
            }
        }

        return dp[k][W];
    }

    long calc(Piece[] nums, int W){
        long[] dp = new long[W+1];
        for(int j = 0;j<nums.length;j++){
            Piece p = nums[j];
            for(int i = W;i>=0;i--){
                if(p.w<=i)
                    dp[i] = Math.max(dp[i], dp[i-p.w] + p.c);
            }
        }
        return dp[W];
    }


    class Piece {
        public Piece(int c, int w) {
            this.c = c;
            this.w = w;
        }

        public int c;
        public int w;
    }

}

class ConsoleIO {
    BufferedReader br;
    PrintWriter out;
    public ConsoleIO(Reader reader, PrintWriter writer){br = new BufferedReader(reader);out = writer;}
    public void flush(){this.out.flush();}
    public void close(){this.out.close();}
    public void writeLine(String s) {this.out.println(s);}
    public void writeInt(int a) {this.out.print(a);this.out.print(' ');}
    public void writeWord(String s){
        this.out.print(s);
    }
    public void writeIntArray(int[] a, int k, String separator) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k; i++) {
            if (i > 0) sb.append(separator);
            sb.append(a[i]);
        }
        this.writeLine(sb.toString());
    }
    public int read(char[] buf, int len){try {return br.read(buf,0,len);}catch (Exception ex){ return -1; }}
    public String readLine() {try {return br.readLine();}catch (Exception ex){ return "";}}
    public long[] readLongArray() {
        String[]n=this.readLine().trim().split("\\s+");long[]r=new long[n.length];
        for(int i=0;i<n.length;i++)r[i]=Long.parseLong(n[i]);
        return r;
    }
    public int[] readIntArray() {
        String[]n=this.readLine().trim().split("\\s+");int[]r=new int[n.length];
        for(int i=0;i<n.length;i++)r[i]=Integer.parseInt(n[i]);
        return r;
    }
    public int[] readIntArray(int n) {
        int[] res = new int[n];
        char[] all = this.readLine().toCharArray();
        int cur = 0;boolean have = false;
        int k = 0;
        boolean neg = false;
        for(int i = 0;i<all.length;i++){
            if(all[i]>='0' && all[i]<='9'){
                cur = cur*10+all[i]-'0';
                have = true;
            }else if(all[i]=='-') {
                neg = true;
            }
            else if(have){
                res[k++] = neg?-cur:cur;
                cur = 0;
                have = false;
                neg = false;
            }
        }
        if(have)res[k++] = neg?-cur:cur;
        return res;
    }
    public int ri() {
        try {
            int r = 0;
            boolean start = false;
            boolean neg = false;
            while (true) {
                int c = br.read();
                if (c >= '0' && c <= '9') {
                    r = r * 10 + c - '0';
                    start = true;
                } else if (!start && c == '-') {
                    start = true;
                    neg = true;
                } else if (start || c == -1) return neg ? -r : r;
            }
        } catch (Exception ex) {
            return -1;
        }
    }
    public long readLong() {
        try {
            long r = 0;
            boolean start = false;
            boolean neg = false;
            while (true) {
                int c = br.read();
                if (c >= '0' && c <= '9') {
                    r = r * 10 + c - '0';
                    start = true;
                } else if (!start && c == '-') {
                    start = true;
                    neg = true;
                } else if (start || c == -1) return neg ? -r : r;
            }
        } catch (Exception ex) {
            return -1;
        }
    }
    public String readWord() {
        try {
            boolean start = false;
            StringBuilder sb = new StringBuilder();
            while (true) {
                int c = br.read();
                if (c!= ' ' && c!= '\r' && c!='\n' && c!='\t') {
                    sb.append((char)c);
                    start = true;
                } else if (start || c == -1) return sb.toString();
            }
        } catch (Exception ex) {
            return "";
        }
    }
    public char readSymbol() {
        try {
            while (true) {
                int c = br.read();
                if (c != ' ' && c != '\r' && c != '\n' && c != '\t') {
                    return (char) c;
                }
            }
        } catch (Exception ex) {
            return 0;
        }
    }
    //public char readChar(){try {return (char)br.read();}catch (Exception ex){ return 0; }}
}