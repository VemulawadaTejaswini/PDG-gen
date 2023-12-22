import java.util.*;
import java.util.stream.Collectors;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = sc.nextInt();

        int[] a = new int[n];
        List<PrimeFact> p = new ArrayList<>();

        for (int i=0; i < n; i++) {
            a[i] = sc.nextInt();
            p.add(new PrimeFact(a[i]));
        }

        List<HashMap<Integer, Integer>> gcd1 = new ArrayList<>();
        List<HashMap<Integer, Integer>> gcd2 = new ArrayList<>();

        gcd1.add(p.get(0).factorization);
        gcd2.add(p.get(n-1).factorization);
        for (int i=1; i < (n-1); i++) {
            gcd1.add(commons(gcd1.get(i-1), p.get(i).factorization));
        }
        for (int i=1; i < (n-1); i++) {
            gcd2.add(commons(gcd2.get(i-1), p.get(n-1-i).factorization));
        }

        int max = 1;

        for (int i=0; i < n; i++) {
            if (i == 0)
                max = Math.max(max, value(gcd2.get(n-2)));
            else if (i == n-1)
                max = Math.max(max, value(gcd1.get(n-2)));
            else
                max = Math.max(max, value(commons(gcd1.get(i-1), gcd2.get(n-2-i))));
        }

        System.out.println(max);
    }

    /*
    private static int gcd(List<PrimeFact> pf, int exclude) {
        HashMap<Integer, Integer> gcd = new HashMap<>();

        for (int i = 0; i < pf.size(); i++) {
            PrimeFact p = pf.get(i);
            if (i != exclude) {
                if (gcd.isEmpty())
                    gcd = p.factorization;
                else
                    gcd = commons(gcd, p.factorization);
            }
        }

        return value(gcd);
    }
    */

    private static HashMap<Integer, Integer> commons(HashMap<Integer, Integer> h1, HashMap<Integer, Integer> h2) {
        HashMap<Integer, Integer> orig = (HashMap<Integer, Integer>) h1.clone();
        orig.entrySet().removeIf(e -> !h2.containsKey(e.getKey()));

        HashMap<Integer, Integer> ret = new HashMap<>();
        for (Map.Entry<Integer, Integer> e : orig.entrySet()) {
            ret.put(e.getKey(), (e.getValue() > h2.get(e.getKey()) ? h2.get(e.getKey()) : e.getValue()));
        }
        return ret;
    }

    private static int value(HashMap<Integer, Integer> h) {
        int ans = 1;
        for (Map.Entry<Integer, Integer> e : h.entrySet()) {
            for (int i=0; i < e.getValue(); i++)
                ans *= e.getKey();
        }

        return ans;
    }

    public static class PrimeFact {

        private final int orig;
        private LinkedHashMap<Integer, Integer> factorization;

        public PrimeFact(int num) {
            orig = num;
            factorization = factorize(num);
        }

        public void println() {
            System.out.print(orig);
            if (factorization.isEmpty()) System.out.println(" = 1");
            else if (this.isPrime()) System.out.println(" is a prime!");
            else {
                System.out.println(
                        " = " +
                                factorization.entrySet().stream().sorted(
                                        (o1, o2) -> (int) (o1.getKey() - o2.getKey())
                                ).map(
                                        e -> e.getKey() + (e.getValue() != 1 ? "^" + e.getValue() : "")
                                ).collect(Collectors.joining(" * "))
                );
            }
        }

        public boolean isPrime() {
            return factorization.size() == 1 && factorization.containsValue(1);
        }

    }

    private static LinkedHashMap<Integer, Integer> factorize(int num) {

        LinkedHashMap<Integer, Integer> fact;

        if (num == 1L) return new LinkedHashMap<>();

        int sqrt = (int) Math.floor(Math.sqrt(num));

        for (int p : getPrimes(sqrt)) {
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

    private static LinkedList<Integer> primes;

    static {
        primes = new LinkedList<>();
        primes.add(2);
    }

    public static LinkedList<Integer> getPrimes() {
        return primes;
    }

    /**
     * Returns a list of primes that are smaller than or equal to the given minimum value.
     * @param min Minimum value.
     * @return A prime.
     */

    public static List<Integer> getPrimes(int min) {

        if (primes.getLast() < min)
            genPrime(min);

        int index = 0;
        for (int p : primes) {
            if (p > min) break;
            index++;
        }

        return primes.subList(0, index);
    }

    /**
     * Generates primes until it reaches the given minimum value.
     * @param min Minimum value.
     */

    private static void genPrime(int min) {
        for (int biggestKnown = primes.getLast() + 1; biggestKnown <= min; biggestKnown++) {
            if (isPrime(biggestKnown)) primes.add(biggestKnown);
        }
    }

    private static boolean isPrime(int num) {
        int sqrt = (int) Math.floor(Math.sqrt(num));

        for (int p : primes) {
            if (p > sqrt) break;
            if (num % p == 0) return false;
        }

        return true;
    }

}
