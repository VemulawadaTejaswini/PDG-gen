import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        ConsoleIO io = new ConsoleIO(new InputStreamReader(System.in), new PrintWriter(System.out));
        //String test = "A-large";
        //ConsoleIO io = new ConsoleIO(new FileReader("D:\\Dropbox\\Competitions\\GCJ17\\quals\\" + test + ".in"), new PrintWriter(new File("D:\\Dropbox\\Competitions\\GCJ17\\quals\\" + test + "-out.txt")));

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
        char[] S = io.readLine().toCharArray();
        char[] T = io.readLine().toCharArray();
        int[] sa = new int[S.length+1];
        int[] sb = new int[S.length+1];
        int[] ta = new int[T.length+1];
        int[] tb = new int[T.length+1];
        for(int i = 1;i<sa.length;i++) {
            sa[i] = sa[i - 1];
            sb[i] = sb[i - 1];
            if (S[i-1] == 'A') sa[i]++;
            else sb[i]++;
        }
        for(int i = 1;i<ta.length;i++) {
            ta[i] = ta[i - 1];
            tb[i] = tb[i - 1];
            if (T[i-1] == 'A') ta[i]++;
            else tb[i]++;
        }
        StringBuilder res = new StringBuilder();
        int Q = Integer.parseInt(io.readLine());
        for(int i = 0;i<Q;i++) {
            int[] l = io.readIntArray(4);
            int difS = ((sa[l[1]] - sa[l[0] - 1]) - (sb[l[1]] - sb[l[0] - 1]) + 300000) % 3;
            int difT = ((ta[l[3]] - ta[l[2] - 1]) - (tb[l[3]] - tb[l[2] - 1]) + 300000) % 3;
            if (res.length() > 0) res.append(System.lineSeparator());
            if (difS == difT) res.append("YES");
            else res.append("NO");
        }
        io.writeLine(res.toString());
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