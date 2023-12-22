import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String[] a = new String[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.next();
        }

        int maxGcd = 0;
        for (int k = 0; k < n; k++) {
            List<String> list = new ArrayList<>(Arrays.asList(a));
            list.remove(k);
            String[] removed = list.toArray(new String[]{});

            int gcd = Integer.parseInt(removed[0]);
            for (int j = 1; j < removed.length; j++) {
                gcd = gcd(Integer.parseInt(removed[j]),gcd);
            }

            if (gcd > maxGcd) {
                maxGcd = gcd;
            }
        }
        System.out.printf(String.valueOf(maxGcd));
    }

    private static int gcd(int m, int n) {
        if (m < n) {
            return gcd(n, m);
        } else if (n == 0) {
            return m;
        }
        return gcd(n, m % n);
    }
}
