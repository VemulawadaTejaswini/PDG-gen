import java.math.BigInteger;
import java.util.*;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        long start = System.nanoTime();

        int n = sc.nextInt();

        int[] a = new int[n];
        for (int i=0; i < n; i++)
            a[i] = sc.nextInt();

        List<Integer> gcd1 = new ArrayList<>();
        List<Integer> gcd2 = new ArrayList<>();

        gcd1.add(a[0]);
        gcd2.add(a[n-1]);
        for (int i=1; i < (n-1); i++) {
            gcd1.add(gcd(gcd1.get(i-1), a[i]));
        }
        for (int i=1; i < (n-1); i++) {
            gcd2.add(gcd(gcd2.get(i-1), a[n-1-i]));
        }

        // System.out.println("GCD took " + (System.nanoTime() - start)/1000000L + " ms");

        int max = 1;

        for (int i=0; i < n; i++) {
            if (i == 0)
                max = Math.max(max, gcd2.get(n-2));
            else if (i == n-1)
                max = Math.max(max, gcd1.get(n-2));
            else
                max = Math.max(max, gcd(gcd1.get(i-1), gcd2.get(n-2-i)));
        }

        System.out.println(max);

        long end = System.nanoTime();

        // System.out.println("Took " + (end - start)/1000000L + " ms");
    }

    public static int gcd(int a, int b) {
        BigInteger num1 = BigInteger.valueOf(a);
        BigInteger num2 = BigInteger.valueOf(b);

        return num1.gcd(num2).intValue();
    }

}
