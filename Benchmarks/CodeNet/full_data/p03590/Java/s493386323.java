import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        for ( int i = 0; i < N; i++ ) {
            a.add(sc.nextInt());
            b.add(sc.nextInt());
        }
        List<Integer> except = new ArrayList<Integer>();
        Result s = calc(N, K, a, b, except);
        System.out.println(s.sum);
    }

    private static class Result {
        private final long sum;
        private final long bitsum;
        public Result(long sum, long bitsum) {
            this.sum = sum;
            this.bitsum = bitsum;
        }
    }

    private static Result calc(int N, int K
                                        , List<Integer> a, List<Integer> b, List<Integer> except) {
        List<Integer> aa = smaller(a, except);
        List<Integer> bb = smaller(b, except);
        if ( N == 0 ) return new Result(0L, 0L);
        if ( N == 1 ) return aa.get(0) <= K ? new Result(bb.get(0), aa.get(0)) : new Result(0L, 0L);
        Result result = new Result(0L,0L);
        for ( int i = 0; i < N; i++ ) {
            List<Integer> ee = new ArrayList<Integer>();
            ee.addAll(except);
            if ( ee.contains(i) == false ) {
                ee.add(i);
            }
            Result r = calc(N-1, K, a, b, ee);
            long bitsum = r.bitsum | a.get(i);
            if ( bitsum <= K ) {
                r = new Result(r.sum + b.get(i), bitsum);
            }
            if ( r.sum > result.sum ) {
                result = r;
            }
        }
        return result;
    }

    private static List<Integer> smaller(List<Integer> c, List<Integer> except) {
           int N = c.size();
           List<Integer> r = new ArrayList<Integer>();
           for ( int i = 0; i < N; i++ ) {
               if ( except.contains(i) ) continue;
               r.add(c.get(i));
           }
           return r;
    }
}