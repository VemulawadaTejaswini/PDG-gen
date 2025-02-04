import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.*;
import java.io.*;
import java.util.function.*;
import java.util.stream.Collectors.*;
public class Main {

    public static void main(String[] args) { new Main().stream(); }

    final IO          io  = new IO();
    final PrintWriter out = new PrintWriter(System.out);

    final int INF = Integer.MAX_VALUE/2;

    void stream(){ solve(); out.flush(); }

    /// ********** 本体 ********** ///

    void solve() {
        int N = io.Int();
        char[] strN = String.valueOf(N).toCharArray();
        int SN = 0;
        for(int i = 0; i < strN.length; ++i){
            SN += Character.getNumericValue(strN[i]);
        }
        String ans = N % SN == 0 ? "Yes" : "No";
        out.println(ans);
    }

    /// ********** 本体 ********** ///

    void FOR(int a, int b, Consumer<Integer>act) { for(int i = a; i < b; ++i) act.accept(i); }
    void REP(int a, Consumer<Integer>act) { FOR(0, a, act); }
}
/// ********** その他 ********** ///


/// ********** その他 ********** ///

class IO{
    private final InputStream in = System.in;
    private final byte[] buffer  = new byte[1<<12];
    private int   ptr = 0, buffLen = 0;
    private boolean hasNextByte     ()      {
        if(ptr < buffLen) return true;
        ptr = 0;
        try{ buffLen = in.read(buffer); } catch (IOException e){ e.printStackTrace(); }
        return buffLen > 0;
    }
    private int     readByte        ()      { return hasNextByte()? buffer[ptr++] : -1; }
    private boolean isPrintableChar (int c) { return 33 <= c && c <= 126; } //ASCII
    private void    skipUnprintable ()      { while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; }
    private boolean hasNext         ()      { skipUnprintable(); return hasNextByte();}
    private String  next            ()      {
        if(!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (isPrintableChar(b)){ sb.appendCodePoint(b); b = readByte(); }
        return sb.toString();
    }
    public String String () { return next(); }
    public char   Char   () { return next().charAt(0);}
    public int    Int    () { return Integer.parseInt(next());}
    public long   Long   () { return Long.parseLong(next());}
    public double Double () { return Double.parseDouble(next());}
    public String[] StringArr (final int n) { final String[] arr = new String[n]; for(int i = 0; i < n; ++i) arr[i] = String(); return arr; }
    public char  [] CharArr   (final int n) { final char[]   arr = new char[n];   for(int i = 0; i < n; ++i) arr[i] = Char();   return arr; }
    public int   [] IntArr    (final int n) { final int[]    arr = new int[n];    for(int i = 0; i < n; ++i) arr[i] = Int();    return arr; }
    public long  [] LongArr   (final int n) { final long[]   arr = new long[n];   for(int i = 0; i < n; ++i) arr[i] = Long();   return arr; }
    public double[] DoubleArr (final int n) { final double[] arr = new double[n]; for(int i = 0; i < n; ++i) arr[i] = Double(); return arr; }
}
class Mat{
    public final long MDD = 1000000000+7;
    public long Gcd(long a, long b){ return a < b ? Gcd(b, a) : b == 0 ? a : Gcd(b, a % b); }
    public long Lcm(long a, long b){ return a * (b / Gcd(a, b)); }
    public long Gcd(long ... a)    { return Arrays.stream(a).reduce((acc,x)->Gcd(acc,x)).getAsLong(); }
    public long Lcm(long ... a)    { return Arrays.stream(a).reduce((acc,x)->Lcm(acc,x)).getAsLong(); }
}