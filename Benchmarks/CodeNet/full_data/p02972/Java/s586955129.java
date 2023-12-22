import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.*;

public class Main {

    private static Scanner in = new Scanner(System.in);
    private static PrintWriter out = new PrintWriter(System.out);

    private static BigInteger MOD = BigInteger.valueOf((long) 1e9 + 7);

    public static void main(String[] args) {
        solve();
        out.flush();
    }

    private static void solve() {
        int n = in.nextInt();
        boolean[] a = new boolean[n];
        for (int i=0; i < n; i++)
            a[i] = in.nextInt() == 1;

        boolean[] ans = new boolean[n];
        boolean[] placed = new boolean[n];
        for (int i=n-1; i >= 0; i--) {
            if (a[i] != ans[i]) {
                List<Long> divs = new PrimeFact(i+1).divisors();
                for (long d : divs) {
                    ans[(int) d - 1] = !ans[(int) d - 1];
                }
                placed[i] = true;
            }
        }

        boolean flag = true;
        for (int i=0; i < n; i++) {
            if (ans[i] != a[i]) {
                flag = false;
                break;
            }
        }
        if (!flag) {
            out.println(-1);
            return;
        }

        int m = 0;
        for (int i=0; i < n; i++) {
            if (placed[i])
                m++;
        }
        out.println(m);
        for (int i=0; i < n; i++) {
            if (placed[i])
                out.println(i+1);
        }
    }


    public static class PrimeFact {
        private final Long orig;
        private LinkedHashMap<Long, Integer> factorization;

        public PrimeFact(long num) {
            orig = num;
            factorization = factorize(num);
        }

        public PrimeFact(int num) {
            orig = (long) num;
            factorization = factorize(num);
        }

        public List<Long> divisors() {
            return getDivisors(this.factorization);
        }
    }

    private static LinkedHashMap<Long, Integer> factorize(long num) {

        LinkedHashMap<Long, Integer> fact;

        if (num == 1L) return new LinkedHashMap<>();

        long sqrt = (long) Math.floor(Math.sqrt(num));

        for (long p : getPrimes(sqrt)) {
            if (num % p == 0) {
                fact = factorize(num/p);
                if (fact.containsKey(p)) fact.put(p, fact.get(p) + 1);
                else fact.put(p, 1);
                return fact;
            }
        }

        fact = new LinkedHashMap<>();
        fact.put(num, 1);
        return fact;
    }

    private static LinkedList<Long> primes;

    static {
        primes = new LinkedList<>();
        primes.add(2L);
    }

    public static boolean testPrime(long num) {
        int sqrt = (int) Math.floor(Math.sqrt(num));

        for (long p : getPrimes(sqrt)) {
            if (p > sqrt) break;
            if (num % p == 0) return false;
        }

        return true;
    }

    public static List<Long> getPrimes(long min) {

        if (primes.getLast() < min)
            genPrime(min);

        int index = 0;
        for (long p : primes) {
            if (p > min) break;
            index++;
        }

        return primes.subList(0, index);
    }

    private static void genPrime(long min) {
        for (long biggestKnown = primes.getLast() + 1; biggestKnown <= min; biggestKnown++) {
            if (isPrime(biggestKnown)) primes.add(biggestKnown);
        }
    }

    private static boolean isPrime(long num) {
        int sqrt = (int) Math.floor(Math.sqrt(num));

        for (long p : primes) {
            if (p > sqrt) break;
            if (num % p == 0) return false;
        }

        return true;
    }

    // ------------------------
    // Get Divisors List
    // ------------------------

    public static List<Long> getDivisors(HashMap<Long, Integer> fact) {
        List<Long> ret = new ArrayList<>();
        if (fact.isEmpty()) {
            ret.add(1L);
            return ret;
        }

        for (Map.Entry<Long, Integer> e : fact.entrySet()) {
            HashMap<Long, Integer> copy = clone(fact);
            copy.remove(e.getKey());
            List<Long> divs = getDivisors(copy);
            for (long div : divs) {
                for (int i = 0; i <= e.getValue(); i++) {
                    ret.add(div * (long) Math.pow(e.getKey(), i));
                }
            }
            break;
        }
        return ret;
    }

    private static HashMap<Long, Integer> clone(HashMap<Long, Integer> h) {
        HashMap<Long, Integer> ret = new HashMap<>();
        for (Map.Entry<Long, Integer> e : h.entrySet()) {
            ret.put(e.getKey(), e.getValue());
        }
        return ret;
    }

}
