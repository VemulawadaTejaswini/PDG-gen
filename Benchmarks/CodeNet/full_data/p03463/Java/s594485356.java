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
        int A = io.Int();
        int B = io.Int();
        boolean isAWin;
        int tmpA = A;
        int tmpB = B;
        for(int i = 0; ; ++i){
            if(i%2==0)
                tmpA++;
            else
                tmpB--;
            if(tmpA == tmpB){
                out.println(i%2!=0?"Alice":"Borys");
                return;
            }
        }
    }

    /// ********** __ ********** ///

    void FOR(int a, int b, Consumer<Integer>act) { for(int i = a; i < b; ++i) act.accept(i); }
    void REP(int a, Consumer<Integer>act) { FOR(0, a, act); }
    Integer[] int2IntegerArr(int[] arr) { return Arrays.stream(arr).boxed().toArray(Integer[]::new); }
    Character[] str2CharacterArr(String str) { return str.chars().mapToObj(c->(char)c).toArray(Character[]::new); }
}
/// ********** その他 ********** ///

class AA<T> {
    public Map<T, Integer> dic;
    public AA() { dic = new HashMap<>(); }
    public AA(T ... xs) { this(); Add(xs); }
    public void Add(T ... xs){
        for(T x : xs){
            if(!dic.containsKey(x)) dic.put(x, 0);
            dic.put(x, dic.get(x) + 1);
        }
    }
    private Stream <T>  keyStream   () { return dic.keySet().stream(); }
    private Stream <Integer> valueStream () { return dic.values().stream(); }
    public int[] Values () { return valueStream().mapToInt(x->x).toArray(); }
    public T  [] Keys   () { return (T[])keyStream().toArray(); }
    public int   ValSum () { return valueStream().reduce((acc,x)->acc+x).get(); }
    public int   KeyNum () { return (int) keyStream().count(); }
    public int   MaxVal () { return valueStream().max(Comparator.naturalOrder()).get(); }
    public int   Minval () { return valueStream().min(Comparator.naturalOrder()).get(); }
    public T MaxValKey () { return SearchFstKeyByValue(MaxVal()); }
    public T MinValKey () { return SearchFstKeyByValue(Minval()); }
    public T SearchFstKeyByValue(int val) { for(T k : Keys()) if(dic.get(k) == val) return k; return null; }
    public Entry<T, Integer>[]  ValueSortedKey() { return ValueSortedKey(true); }
    public Entry<T, Integer>[]  ValueSortedKey(boolean isInc){
        List<Entry<T, Integer>> entry = new ArrayList<>(dic.entrySet());
        Collections.sort(entry, (obj1, obj2) -> isInc ? obj1.getValue().compareTo(obj2.getValue()) : obj2.getValue().compareTo(obj1.getValue()));
        Entry<T, Integer>[] ret = new Entry[entry.size()];
        for(int i = 0; i < entry.size(); ++i) ret[i] = entry.get(i);
        return ret;
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