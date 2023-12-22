import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Q = sc.nextInt();
        for (int tc = 0; tc < Q; ++tc) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            System.out.println(solve(A, B));
        }

        sc.close();
    }

    static int solve(int A, int B) {
        int crossNumA = computeCrossNum(A, B);
        int crossNumB = computeCrossNum(B, A);

        // System.out.println("crossNumA: " + crossNumA);
        // System.out.println("crossNumB: " + crossNumB);

        return Math.min(A - 1 - crossNumA, B - 1 - crossNumB) + crossNumA + crossNumB;
    }

    static int computeCrossNum(int maxFactor1, int minFactor2) {
        long productLimit = (long) maxFactor1 * minFactor2 - 1;
        long prevFactor2 = Long.MAX_VALUE;
        int result = 0;
        for (int factor1 = 1; factor1 < maxFactor1; ++factor1) {
            long factor2 = Math.min(prevFactor2 - 1, productLimit / factor1);
            if (factor2 <= minFactor2) {
                break;
            }

            ++result;
            prevFactor2 = factor2;
        }

        return result;
    }

    // static int computeCrossNum(int maxFactor1, int minFactor2) {
    // int result = 0;
    // int lower = 1;
    // int upper = maxFactor1 - 1;
    // while (lower <= upper) {
    // int middle = (lower + upper) / 2;
    // if (check(maxFactor1, minFactor2, middle)) {
    // result = middle;
    // lower = middle + 1;
    // } else {
    // upper = middle - 1;
    // }
    // }

    // if (result != 0) {
    // long factor2 = ((long) maxFactor1 * minFactor2 - 1) / result;

    // result += Math.min(factor2 - (minFactor2 + 1),
    // ((long) maxFactor1 * minFactor2 - 1) / (minFactor2 + 1) - result);
    // }

    // return result;
    // }

    static boolean check(int maxFactor1, int minFactor2, int factor1) {
        long factor2 = ((long) maxFactor1 * minFactor2 - 1) / factor1;

        // return factor2 > minFactor2 && (factor1 - 1) * (factor2 + 1) < (long)
        // maxFactor1 * minFactor2
        // && (factor1 - 2) * (factor2 + 2) < (long) maxFactor1 * minFactor2
        // && (factor1 - 3) * (factor2 + 3) < (long) maxFactor1 * minFactor2;

        return factor2 > minFactor2
                && (factor1 == 1 || ((long) maxFactor1 * minFactor2 - 1) / (factor1 - 1) - factor2 >= 1);
    }
}