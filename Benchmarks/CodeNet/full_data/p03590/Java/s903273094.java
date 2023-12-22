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
        
        Entry s = calc(N, K, v, pickup);
        debug(s);
        System.out.println(s.b);
    }

    private static class Entry implements Comparable<Entry> {
            private final static int INVALID_A = -1;
            private final int a;
            private final long b;

            private static final Entry INVALID = new Entry(INVALID_A, 0L);

            public static final Entry ZERO = new Entry(0, 0L);

            public Entry(int a, long b) {
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

            public boolean isValid() {
                  return a != INVALID_A;
            }

            public Entry add(Entry o, int K) {
                if ( isValid() == false ) return INVALID;
                if ( o.isValid() == false ) return INVALID;
                int bitsum = a | o.a;
                if ( bitsum > K ) {
                     return INVALID;
                }
                return new Entry(bitsum, b + o.b);
            }

            public String toString() {
                return "[a=" + a + ",b=" + b + "]";
            }
    }

    private static Entry calc(int N, int K
                                        , List<Entry> v, List<Integer> pickup) {
        if ( N == 0 ) return Entry.ZERO;
        if ( pickup.size() < 1 ) return Entry.ZERO;
        Collections.sort(pickup);
        int firstindex = pickup.get(0);
        if ( N == 1 ) {
                Entry v0 = v.get(firstindex);
                return v0.add(Entry.ZERO, K);
        }
        Entry result = Entry.ZERO;
        int pickupSize = pickup.size();
        for ( int i = 0; i < pickupSize; i++ ) {
            List<Integer> p = new ArrayList<>();
            for ( int j = 0; j < pickupSize; j++ ) {
                if ( j == i ) continue;
                p.add(pickup.get(j));
            }
            Entry r = calc(N-1, K, v, p);
            if ( r.isValid() == false ) continue;
            Entry vi = v.get(pickup.get(i));
            Entry candidate = r.add(vi, K);
            if ( candidate.isValid() ) {
                r = candidate;
            }
            debug(r);
             if ( r.b > result.b ) {
                result = r;
            }
        }
        return result;
    }

    private static void debug(Object obj) {
//        System.out.println("#DEBUG: " + obj);
    }
}