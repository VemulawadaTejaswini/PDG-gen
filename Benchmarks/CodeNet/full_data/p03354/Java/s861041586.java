import java.io.PrintWriter;
import java.util.*;
import java.io.*;
import java.util.function.*;
import java.util.stream.Stream;
import java.util.Map.Entry;

public class Main {

    public static void main(String[] args) { new Main().stream(); }

    final IO          io   = new IO();
    final PrintWriter out  = new PrintWriter(System.out);

    final int INF = Integer.MAX_VALUE/2;

    void stream(){ solve(); out.flush(); }

    /// ********** 本体 ********** ///

    void solve() {
        int N = io.Int();
        int M = io.Int();
        int[] p = new int[N];
        int[] x = new int[M];
        int[] y = new int[M];
        REP(N,i-> p[i] = io.Int() - 1);
        REP(M,i->{
            x[i] = io.Int() - 1;
            y[i] = io.Int() - 1;
        });

        UnionFind uf = new UnionFind(N);
        for(int i = 0; i < M; ++i){
            uf.Unite(x[i], y[i]);
        }

        int ans = 0;
        for(int i = 0; i < N; ++i){
            if(uf.Find(i, p[i])) ans++;
        }

        out.println(ans);

    }

    /// ********** __ ********** ///

    void FOR(int a, int b, Consumer<Integer>act) { for(int i = a; i < b; ++i) act.accept(i); }
    void REP(int a, Consumer<Integer>act) { FOR(0, a, act); }
    Integer[] int2IntegerArr(int[] arr) { return Arrays.stream(arr).boxed().toArray(Integer[]::new); }
    Character[] str2CharacterArr(String str) {return str.chars().mapToObj(c->(char)c).toArray(Character[]::new); }
}
/// ********** その他 ********** ///

class UnionFind{
    private int[] data;
    public UnionFind(int n){
        data=new int[n+1];
        for(int i=0;i<n+1;++i){data[i]=-1;}
    }
    public void Unite(int x,int y){
        x=Root(x);
        y=Root(y);
        if(x==y)return;
        if(data[y]<data[x]){
            int tmp=y;
            y=x;
            x=tmp;
        }
        data[x]+=data[y];
        data[y]=x;
    }
    public boolean Find(int x, int y){
        return Root(x)==Root(y);
    }
    public int Root(int x){
        return data[x]<0?x:Root(data[x]);
    }
    public int Size(int x){
        return -data[Root(x)];
    }
}

/// ********** ___ ********** ///

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
    public char  [] CharArr   (final int n) { final char  [] arr = new char  [n]; for(int i = 0; i < n; ++i) arr[i] = Char  (); return arr; }
    public int   [] IntArr    (final int n) { final int   [] arr = new int   [n]; for(int i = 0; i < n; ++i) arr[i] = Int   (); return arr; }
    public long  [] LongArr   (final int n) { final long  [] arr = new long  [n]; for(int i = 0; i < n; ++i) arr[i] = Long  (); return arr; }
    public double[] DoubleArr (final int n) { final double[] arr = new double[n]; for(int i = 0; i < n; ++i) arr[i] = Double(); return arr; }
}