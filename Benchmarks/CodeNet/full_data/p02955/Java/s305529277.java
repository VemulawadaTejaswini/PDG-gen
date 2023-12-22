import java.util.*;

public class Main {
    static final TreeMap<Integer, Integer> factorization = new TreeMap<>();
    static final List<Integer> factors = new ArrayList<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] array = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
            sum += array[i];
        }
        for (int p = 2, sumTemp = sum; p < 22361; p++) {
            int power;
            for (power = 0; sumTemp % p == 0; sumTemp /= p, power++);
            if (power > 0) {
                factorization.put(p, power);
            }
        }
        if (factorization.isEmpty()) {
            factorization.put(sum, 1);
        }
        generateFactors(1);
        factors.sort(Comparator.reverseOrder());
        for (int f : factors) {
            Long[] residues = new Long[n];
            long residueSum = 0;
            for (int i = 0; i < n; i++) {
                residues[i] = (long) array[i] % f;
                residueSum += residues[i];
            }
            Arrays.sort(residues);
            long req = 0;
            for (int i = 0; i < n - (residueSum / f); i++) {
                req += residues[i];
            }
            if (k >= req) {
                System.out.println(f);
                return;
            }
        }
    }

    static void generateFactors(int curr) {
        if (factorization.isEmpty()) {
            factors.add(curr);
        } else {
            int p = factorization.firstKey();
            int power = factorization.remove(p);
            for (int e = 0; e <= power; e++, curr *= p) {
                generateFactors(curr);
            }
            factorization.put(p, power);
        }
    }
}
