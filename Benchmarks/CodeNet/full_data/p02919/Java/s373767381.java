import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] p = new int[n];
        for(int i=0; i<n; i++) {
            p[i] = in.nextInt();
        }
        memo = new HashMap<>();

        int s = 0;
        for(int l=n-2; l>=0; l--) {
            for(int r=l+1; r<n; r++) {
                TupleABC140E t = getTupleFromMemo(p, l, r);
                s+= t.max2;
            }
        }
        System.out.println(s);
    }
    private static Map<String, TupleABC140E> memo;
    private static TupleABC140E getTupleFromMemo(int[] p, int l, int r) {
        String key = l + "_" + r;
        if(memo.containsKey(key)) {
            return memo.get(key);
        }
        if(l+1<r) {
            String key2 = null;
            key2 = (l+1)+"_"+r;
            if(memo.containsKey(key2)) {
                TupleABC140E clone = memo.get(key2).clone();
                clone.add(p[l]);
                memo.put(key, clone);
                return clone;
            }
        }
        TupleABC140E t = new TupleABC140E();
        for(int i=l; i<=r; i++) {
            t.add(p[i]);
        }
        memo.put(key, t);
        return t;
    }
}
class TupleABC140E implements Cloneable {
    int max;
    int max2;
    TupleABC140E() {
        this.max = 0;
        this.max2 = 0;
    }
    void add(int a) {
        int b = this.max;
        int c = this.max2;
        this.max = Math.max(a, b);
        this.max2 = Math.max(Math.min(a, b), c);
    }
    @Override
    public TupleABC140E clone() {
        TupleABC140E tuple = new TupleABC140E();
        tuple.max = this.max;
        tuple.max2 = this.max2;
        return tuple;
    }
}