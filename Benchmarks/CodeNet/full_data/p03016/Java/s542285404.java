import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    static final int DIGIT_NUM_LIMIT = 18;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long L = sc.nextLong();
        long A = sc.nextLong();
        long B = sc.nextLong();
        int M = sc.nextInt();

        System.out.println(solve(L, A, B, M));

        sc.close();
    }

    static int solve(long L, long A, long B, int M) {
        long[] beginIndices = new long[DIGIT_NUM_LIMIT + 1];
        long[] endIndices = new long[DIGIT_NUM_LIMIT + 1];
        for (int digitNum = 1; digitNum <= DIGIT_NUM_LIMIT; ++digitNum) {
            beginIndices[digitNum] = findBeginIndex(L, A, B, digitNum);
            endIndices[digitNum] = findEndIndex(L, A, B, digitNum);
        }

        int result = 0;
        BigInteger tenExponent = BigInteger.ZERO;
        for (int digitNum = DIGIT_NUM_LIMIT; digitNum >= 1; --digitNum) {
            if (beginIndices[digitNum] != -1) {
                result = addMod(result,
                        multiplyMod(computePart(A, B, M, digitNum, beginIndices[digitNum], endIndices[digitNum]),
                                BigInteger.TEN.modPow(tenExponent, BigInteger.valueOf(M)).intValue(), M),
                        M);

                tenExponent = tenExponent.add(BigInteger.valueOf(digitNum)
                        .multiply(BigInteger.valueOf(endIndices[digitNum] - beginIndices[digitNum] + 1)));
            }
        }

        return result;
    }

    static int computePart(long A, long B, int M, int digitNum, long beginIndex, long endIndex) {
        long a1 = A + B * endIndex;
        long an = A + B * beginIndex;
        long n = endIndex - beginIndex + 1;
        long d = -B % M + M;
        int q = BigInteger.TEN.modPow(BigInteger.valueOf(digitNum), BigInteger.valueOf(M)).intValue();

        if (n == 1) {
            return mod(a1, M);
        }

        if (q == 1) {
            return addMod(multiplyMod(mod(n, M), mod(a1, M), M),
                    multiplyMod(BigInteger.valueOf(n).multiply(BigInteger.valueOf(n - 1)).divide(BigInteger.valueOf(2))
                            .mod(BigInteger.valueOf(M)).intValue(), mod(d, M), M),
                    M);
        }

        return divideMod(
                subtractMod(
                        addMod(mod(a1, M),
                                divideMod(
                                        multiplyMod(mod(d, M),
                                                subtractMod(1,
                                                        BigInteger.valueOf(q)
                                                                .modPow(BigInteger.valueOf(n - 1),
                                                                        BigInteger.valueOf(M))
                                                                .intValue(),
                                                        M),
                                                M),
                                        subtractMod(1, q, M), M),
                                M),
                        multiplyMod(
                                BigInteger.valueOf(q).modPow(BigInteger.valueOf(n), BigInteger.valueOf(M)).intValue(),
                                mod(an, M), M),
                        M),
                subtractMod(1, q, M), M);
    }

    static int mod(long x, int M) {
        return (int) (x % M);
    }

    static int addMod(int x, int y, int M) {
        return (x + y) % M;
    }

    static int subtractMod(int x, int y, int M) {
        return ((x - y) % M + M) % M;
    }

    static int multiplyMod(int x, int y, int M) {
        return (int) ((long) x * y % M);
    }

    static int divideMod(int x, int y, int M) {
        return multiplyMod(x, BigInteger.valueOf(y).modInverse(BigInteger.valueOf(M)).intValue(), M);
    }

    static long findBeginIndex(long L, long A, long B, int digitNum) {
        long result = -1;
        long lower = 0;
        long upper = L - 1;
        while (lower <= upper) {
            long middle = (lower + upper) / 2;
            String s = String.valueOf(A + B * middle);

            if (s.length() >= digitNum) {
                if (s.length() == digitNum) {
                    result = middle;
                }

                upper = middle - 1;
            } else {
                lower = middle + 1;
            }
        }

        return result;
    }

    static long findEndIndex(long L, long A, long B, int digitNum) {
        long result = -1;
        long lower = 0;
        long upper = L - 1;
        while (lower <= upper) {
            long middle = (lower + upper) / 2;
            String s = String.valueOf(A + B * middle);

            if (s.length() <= digitNum) {
                if (s.length() == digitNum) {
                    result = middle;
                }

                lower = middle + 1;
            } else {
                upper = middle - 1;
            }
        }

        return result;
    }
}