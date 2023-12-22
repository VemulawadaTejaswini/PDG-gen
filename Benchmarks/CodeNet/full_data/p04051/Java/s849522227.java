import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    private static final BigInteger N = new BigInteger("1000000007");

    // Calculates (a + b)! / (a! * b!)
    public static BigInteger calcCmbsBig(long a, long b) {
        long c = Math.min(a, b);
        BigInteger res = new BigInteger("1");

        for (int i = 0; i < c; i++) {
            res = res.multiply(new BigInteger(String.valueOf(a + b - i)));
            res = res.divide(new BigInteger(String.valueOf(i + 1)));
        }
        return res.mod(N);
    }

    public static long countCombinations(int[][] sets, int n) {
        BigInteger count = new BigInteger("0");
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int a = sets[i][0] + sets[j][0];
                int b = sets[i][1] + sets[j][1];
                count = count.add(calcCmbsBig(a, b));
            }
        }
        return count.mod(N).longValue();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] sets = new int[n][];

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            sets[i] = new int[]{a, b};
        }

        long result = countCombinations(sets, n);
        System.out.println(result);
    }
}

