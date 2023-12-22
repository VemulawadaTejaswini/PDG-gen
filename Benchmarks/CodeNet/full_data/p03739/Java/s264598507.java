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
        int n = io.Int();
        int[] a = new int[n];
        REP(n,integer -> a[integer]=io.Int());
        long cost1=0,cost2=0;
        long sum1=0,sum2=0;
        //sum is +-+...
        for(int i=0;i<n;++i){
            if(i%2==0){
                //sum is +
                sum1+=a[i];
                long addVal =
                        sum1<0?(-sum1)+1:
                        sum1==0?1:0;
                sum1+=addVal;
                cost1+=Math.abs(addVal);
            }else{
                //sum is -
                sum1+=a[i];
                long addVal =
                        sum1>0?(-sum1)-1:
                        sum1==0?-1:0;
                sum1+=addVal;
                cost1+=Math.abs(addVal);
            }
        }
        //sum is -+-...
        for(int i=0;i<n;++i){
            if(i%2!=0){
                //sum is +
                sum2+=a[i];
                long addVal =
                        sum2<0?(-sum2)+1:
                                sum2==0?1:0;
                sum2+=addVal;
                cost2+=Math.abs(addVal);
            }else{
                //sum is -
                sum2+=a[i];
                long addVal =
                        sum2>0?(-sum2)-1:
                                sum2==0?-1:0;
                sum2+=addVal;
                cost2+=Math.abs(addVal);
            }
        }
        //result
        long ans = Math.min(cost1,cost2);
        System.out.println(ans);
    }

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