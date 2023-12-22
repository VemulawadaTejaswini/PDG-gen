import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

class Main {
    static int[] primes;
    static List<Integer> primeList;
    static {
        int length = (int) Math.sqrt(500000000) + 1;
        primes = new int[length];
        int max = (int) Math.sqrt(length) + 1;
        for (int i = 2; i < max; i++) {
            if (primes[i] == 1) {
                continue;
            }
            int cur = i * i;
            while (cur < length) {
                primes[cur] = 1;
                cur += i;
            }
        }

        primeList = new ArrayList<>();
        for (int i = 2; i < length; i++) {
            if (primes[i] == 0) {
                primeList.add(i);
            }
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int K = in.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = in.nextInt();
        }

        int sum = 0;
        for (int a : A) {
            sum += a;
        }

        SortedSet<Integer> factors = new TreeSet<>(Comparator.reverseOrder());
        List<Integer> tmpPrimes = new ArrayList<>(primeList);
        while (sum > 1 && tmpPrimes.size() > 0) {
            if (sum % tmpPrimes.get(0) == 0) {
                sum /= tmpPrimes.get(0);
                factors.addAll(factors.stream().map(i -> i*tmpPrimes.get(0)).collect(Collectors.toList()));
                factors.add(tmpPrimes.get(0));
            } else {
                tmpPrimes.remove(0);
            }
        }
        factors.add(sum);
        boolean hasResult = false;
        for (int i : factors) {
            if (helper(i, K, A)) {
                System.out.println(i);
                hasResult = true;
                break;
            }
        }
        if (!hasResult) {
            System.out.println(1);
        }
    }

    private static boolean helper(int i, int k, int[] A) {
        PriorityQueue<Integer> q1 = new PriorityQueue<>(Comparator.reverseOrder()), q2 = new PriorityQueue<>();
        int sum = 0;
        for (int j = 1; j < A.length; j++) {
            int e = A[j] % i;
            q1.add(e);
            sum += e;
        }
        
        q2.add(sum);
        while (q1.peek() + q2.peek() > i) {
            int x = q2.poll();
            int y = q1.poll();
            q2.add(i - y);
            if (x > i) {
                q2.add(x - i);
            } else {
                q1.add(i - x);
            }
            sum -= y + Math.max(0, i - x);
        }
        
        return sum <= k;
    }
}