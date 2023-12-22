import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        List<Entry> v = new ArrayList<Entry>();
        List<Integer> pickup = new ArrayList<>();
        for ( int i = 0; i < N; i++ ) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            v.add(new Entry(a, b));
            pickup.add(i);
        }
        Collections.reverse(v);
        
        Result s = calc(N, K, v, pickup);
        debug(s);
        System.out.println(s.sum);
    }

    private static class Entry implements Comparable<Entry> {
            private final int a;
            private final int b;

            public Entry(int a, int b) {
                this.a = a;
                this.b = b;
            }

            @Override
            public int compareTo(Entry o) {
                  if ( o == null ) return -1;
                  if ( b < o.b ) return -1;
                  if ( b == o.b ) return 0;
                  return 1;
            }
    }

    private static class Result {
        private final long sum;
        private final long bitsum;
        public Result(long sum, long bitsum) {
            this.sum = sum;
            this.bitsum = bitsum;
        }

        public String toString() {
            return "[sum=" + sum + ",bitsum=" + bitsum + "]";
        }
    }

    private static Result calc(int N, int K
                                        , List<Entry> v, List<Integer> pickup) {
        if ( N == 0 ) return new Result(0L, 0L);
        if ( pickup.size() < 1 ) return new Result(0L, 0L);
        Collections.sort(pickup);
        int firstindex = pickup.get(0);
        if ( N == 1 ) {
                Entry v0 = v.get(firstindex);
                return v0.a <= K 
                                    ? new Result(v0.b, v0.a)
                                     : new Result(0L, 0L);
        }
        Result result = new Result(0L,0L);
        int pickupSize = pickup.size();
        for ( int i = 0; i < pickupSize; i++ ) {
            List<Integer> p = new ArrayList<>();
            for ( int j = 0; j < pickupSize; j++ ) {
                if ( j == i ) continue;
                p.add(pickup.get(j));
            }
            Result r = calc(N-1, K, v, p);
            Entry vi = v.get(pickup.get(i));
            long bitsum = r.bitsum | vi.a;
            if ( bitsum <= K ) {
                r = new Result(r.sum + vi.b, bitsum);
            }
            debug(r);
             if ( r.sum > result.sum ) {
                result = r;
            }
        }
        return result;
    }

    private static void debug(Object obj) {
//        System.out.println("#DEBUG: " + obj);
    }
}