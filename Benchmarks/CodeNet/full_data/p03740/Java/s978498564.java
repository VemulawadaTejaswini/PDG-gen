import java.lang.reflect.Array;
import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors.*;
public class Main {
    public static void main(String[] args) {
        new Main().solve();
    }
    IO io = new IO();

    /// ********** 本体 ********** ///

    void solve() {
        long X = io.Long();
        long Y = io.Long();
        String ans = "";
        if(X+Y<=1){
            ans="Brown";
        }else if(Math.abs(X-Y)<=1){
            ans="Brown";
        }else{
            ans="Alice";
        }
        System.out.println(ans);
    }

    /// ********** 本体 ********** ///

    void FOR(int a, int b, Consumer<Integer>act) { for(int i = a; i < b; ++i) act.accept(i); }
    void REP(int a, Consumer<Integer>act) { FOR(0, a, act); }
}
class IO{
    String[] nextBuff;
    int      buffCnt;
    Scanner  sc = new Scanner(System.in);
    public IO(){
        nextBuff = new String[0];
        buffCnt = 0;
    }
    String next() {
        if (buffCnt < nextBuff.length) return nextBuff[buffCnt++];
        String line = sc.nextLine();
        while (line == "") line = sc.nextLine();
        nextBuff = line.split(" ");
        buffCnt = 0;
        return nextBuff[buffCnt++];
    }
    public String String() { return next(); }
    public char   Char()   { return next().charAt(0);}
    public int    Int()    { return Integer.parseInt(next());}
    public long   Long()   { return Long.parseLong(next());}
    public double Double() { return Double.parseDouble(next());}
}