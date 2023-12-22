import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<Integer, Double> expectedValues = new HashMap<>();

    private static double expectedValue(int i) {
        double res = 0;

        for (int j = 1; j <= i; j++) {
            res += ((double) j) / i;
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        double[] ps = new double[n];

        for (int i = 0; i < n; i++) {
            int p = sc.nextInt();

            if (!expectedValues.containsKey(p)) {
                expectedValues.put(p, expectedValue(p));
            }
            ps[i] = expectedValues.get(p);
        }

        for (int i = 1; i < ps.length; i++) {
            ps[i] += ps[i - 1];
        }

        double res = 0;

        for (int i = k - 1; i < ps.length; i++) {
            if (i - k >= 0) {
                res = Math.max(res, ps[i] - ps[i - k]);
            } else {
                res = ps[i];
            }
        }

        System.out.println(res);
    }
}