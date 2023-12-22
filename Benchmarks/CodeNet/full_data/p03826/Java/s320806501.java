import java.io.InputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Stream;


/**
 *
 * @author Pradyumn Agrawal coderbond007
 */
public class Main{
    public static InputStream inputStream = System.in;
    public static FastReader in = new FastReader(inputStream);
    public static PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    public static void main(String[] args)throws java.lang.Exception
    {
        new Main().run();
        out.close();
    }
    void run() throws java.lang.Exception
    {
        int[] primes = sieveEratosthenes(10000);
        int n = ni();
        long mod = (long)1e9 + 7;
        long ans = 1;
        for(int i = 0;n/primes[i] != 0; ++i) {
            int power = 0;
            int pri = primes[i];
            int f = pri;
            int count = 1;
            while(n/f != 0) {
                power += n/f;
                ++count;
                f = (int)Math.pow(pri,count);
            }
            power++;
            ans = ans * power;
            if(ans >= mod) ans %= mod;
        }
        out.println(ans);
    }
    public static int[] sieveEratosthenes(int n) {
        if(n <= 32){
            int[] primes = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31 };
            for(int i = 0;i < primes.length;i++){
                if(n < primes[i]){
                    return Arrays.copyOf(primes, i);
                }
            }
            return primes;
        }

        int u = n + 32;
        double lu = Math.log(u);
        int[] ret = new int[(int) (u / lu + u / lu / lu * 1.5)];
        ret[0] = 2;
        int pos = 1;

        int[] isp = new int[(n + 1) / 32 / 2 + 1];
        int sup = (n + 1) / 32 / 2 + 1;

        int[] tprimes = { 3, 5, 7, 11, 13, 17, 19, 23, 29, 31 };
        for(int tp : tprimes){
            ret[pos++] = tp;
            int[] ptn = new int[tp];
            for(int i = (tp - 3) / 2;i < tp << 5;i += tp)
                ptn[i >> 5] |= 1 << (i & 31);
            for(int i = 0;i < tp;i++){
                for(int j = i;j < sup;j += tp)
                    isp[j] |= ptn[i];
            }
        }

        // 3,5,7
        // 2x+3=n
        int[] magic = { 0, 1, 23, 2, 29, 24, 19, 3, 30, 27, 25, 11, 20, 8, 4,
                13, 31, 22, 28, 18, 26, 10, 7, 12, 21, 17, 9, 6, 16, 5, 15, 14 };
        int h = n / 2;
        for(int i = 0;i < sup;i++){
            for(int j = ~isp[i];j != 0;j &= j - 1){
                int pp = i << 5 | magic[(j & -j) * 0x076be629 >>> 27];
                int p = 2 * pp + 3;
                if(p > n)
                    break;
                ret[pos++] = p;
                for(int q = pp;q <= h;q += p)
                    isp[q >> 5] |= 1 << (q & 31);
            }
        }

        return Arrays.copyOf(ret, pos);
    }
    public static int[] enumLowestPrimeFactors(int n) {
        int tot = 0;
        int[] lpf = new int[n + 1];
        int u = n + 32;
        double lu = Math.log(u);
        int[] primes = new int[(int) (u / lu + u / lu / lu * 1.5)];
        for (int i = 2; i <= n; i++)
            lpf[i] = i;
        for (int p = 2; p <= n; p++) {
            if (lpf[p] == p)
                primes[tot++] = p;
            int tmp;
            for (int i = 0; i < tot && primes[i] <= lpf[p] && (tmp = primes[i] * p) <= n; i++) {
                lpf[tmp] = primes[i];
            }
        }
        return lpf;
    }
    private static int ni(){ 
        return in.nextInt();
    }
    private static long nl(){
        return in.nextLong();
    }
    private static String ns(){
        return in.nextString();
    }
    private static char nc(){
        return in.nextCharacter();
    }
    private static double nd(){
        return in.nextDouble();
    }

    private static char[] ns(int n)
    {
        char[] a = new char[n];
        for(int i=0;i<n;i++) a[i] = nc();
        return a;
    }

    private static char[][] nm(int n, int m)
    {
        char[][] map = new char[n][];
        for(int i=0;i<n;i++) map[i] = ns(m);
        return map;
    }

    private static int[] na(int n)
    {
        int[] a = new int[n];
        for(int i=0;i<n;i++) a[i] = ni();
        return a;
    }

    private static long[] nal(int n)
    {
        long[] a = new long[n];
        for(int i=0;i<n;i++) a[i] = nl();
        return a;
    }
    //private void tr(Object... o) { if(o.length() > 0)System.out.println(Arrays.deepToString(o)); }
}

class FastReader{
    private boolean finished = false;

    private InputStream stream;
    private byte[] buf = new byte[1024];
    private int curChar;
    private int numChars;
    private SpaceCharFilter filter;

    public FastReader(InputStream stream){
        this.stream = stream;
    }

    public int read(){
        if (numChars == -1){
            throw new InputMismatchException ();
        }
        if (curChar >= numChars){
            curChar = 0;
            try{
                numChars = stream.read (buf);
            } catch (IOException e){
                throw new InputMismatchException ();
            }
            if (numChars <= 0){
                return -1;
            }
        }
        return buf[curChar++];
    }

    public int peek(){
        if (numChars == -1){
            return -1;
        }
        if (curChar >= numChars){
            curChar = 0;
            try{
                numChars = stream.read (buf);
            } catch (IOException e){
                return -1;
            }
            if (numChars <= 0){
                return -1;
            }
        }
        return buf[curChar];
    }

    public int nextInt(){
        int c = read ();
        while (isSpaceChar (c))
            c = read ();
        int sgn = 1;
        if (c == '-'){
            sgn = -1;
            c = read ();
        }
        int res = 0;
        do{
            if(c==','){
                c = read();
            }
            if (c < '0' || c > '9'){
                throw new InputMismatchException ();
            }
            res *= 10;
            res += c - '0';
            c = read ();
        } while (!isSpaceChar (c));
        return res * sgn;
    }

    public long nextLong(){
        int c = read ();
        while (isSpaceChar (c))
            c = read ();
        int sgn = 1;
        if (c == '-'){
            sgn = -1;
            c = read ();
        }
        long res = 0;
        do{
            if (c < '0' || c > '9'){
                throw new InputMismatchException ();
            }
            res *= 10;
            res += c - '0';
            c = read ();
        } while (!isSpaceChar (c));
        return res * sgn;
    }

    public String nextString(){
        int c = read ();
        while (isSpaceChar (c))
            c = read ();
        StringBuilder res = new StringBuilder ();
        do{
            res.appendCodePoint (c);
            c = read ();
        } while (!isSpaceChar (c));
        return res.toString ();
    }

    public boolean isSpaceChar(int c){
        if (filter != null){
            return filter.isSpaceChar (c);
        }
        return isWhitespace (c);
    }

    public static boolean isWhitespace(int c){
        return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
    }

    private String readLine0(){
        StringBuilder buf = new StringBuilder ();
        int c = read ();
        while (c != '\n' && c != -1){
            if (c != '\r'){
                buf.appendCodePoint (c);
            }
            c = read ();
        }
        return buf.toString ();
    }

    public String nextLine(){
        String s = readLine0 ();
        while (s.trim ().length () == 0)
            s = readLine0 ();
        return s;
    }

    public String nextLine(boolean ignoreEmptyLines){
        if (ignoreEmptyLines){
            return nextLine ();
        }else{
            return readLine0 ();
        }
    }

    public BigInteger nextBigInteger(){
        try{
            return new BigInteger (nextString());
        } catch (NumberFormatException e){
            throw new InputMismatchException ();
        }
    }

    public char nextCharacter(){
        int c = read ();
        while (isSpaceChar (c))
            c = read ();
        return (char) c;
    }

    public double nextDouble(){
        int c = read ();
        while (isSpaceChar (c))
            c = read ();
        int sgn = 1;
        if (c == '-'){
            sgn = -1;
            c = read ();
        }
        double res = 0;
        while (!isSpaceChar (c) && c != '.'){
            if (c == 'e' || c == 'E'){
                return res * Math.pow (10, nextInt ());
            }
            if (c < '0' || c > '9'){
                throw new InputMismatchException ();
            }
            res *= 10;
            res += c - '0';
            c = read ();
        }
        if (c == '.'){
            c = read ();
            double m = 1;
            while (!isSpaceChar (c)){
                if (c == 'e' || c == 'E'){
                    return res * Math.pow (10, nextInt ());
                }
                if (c < '0' || c > '9'){
                    throw new InputMismatchException ();
                }
                m /= 10;
                res += (c - '0') * m;
                c = read ();
            }
        }
        return res * sgn;
    }

    public boolean isExhausted(){
        int value;
        while (isSpaceChar (value = peek ()) && value != -1)
            read ();
        return value == -1;
    }
    public SpaceCharFilter getFilter(){
        return filter;
    }

    public void setFilter(SpaceCharFilter filter){
        this.filter = filter;
    }

    public interface SpaceCharFilter{
        public boolean isSpaceChar(int ch);
    }
}