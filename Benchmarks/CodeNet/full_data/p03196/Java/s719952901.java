import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = Long.parseLong(sc.next());
        long p = Long.parseLong(sc.next());
        sc.close();
        if (p == 1) {
            System.out.println(1);
        } else if (n == 1) {
            System.out.println(p);
        } else {
            HashMap<Long, Long> h = factorization(p);
            long ans = 1;
            for (long k : h.keySet()) {
                long v = h.get(k);
                while (v >= n) {
                    ans *= k;
                    v -= n;
                }
            }
            System.out.println(ans);
        }
    }

    static HashMap<Long, Long> factorization(long p) {
        HashMap<Long, Long> h = new HashMap<>();
        while (p % 2 == 0) {
            if (h.containsKey(2L)) {
                h.put(2L, h.get(2L) + 1);
            } else {
                h.put(2L, 1L);
            }
            p /= 2;
        }
        for (long i = 3; i * i <= p; i += 2) {
            while (p % i == 0) {
                if (h.containsKey(i)) {
                    h.put(i, h.get(i) + 1);
                } else {
                    h.put(i, 1L);
                }
                p /= i;
            }
        }
        if (p > 0)
            h.put(p, 1L);
        return h;
    }
}