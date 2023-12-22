import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        long[] T = new long[N];
        for (int i = 0; i < T.length; ++i) {
            T[i] = sc.nextLong();
        }
        long[] A = new long[N];
        for (int i = 0; i < A.length; ++i) {
            A[i] = sc.nextLong();
        }

        long div = (long)Math.pow(10, 9) + 7;

        long res = solve(T, A);
        System.out.println(res % div);
    }
    private static long solve(long[] T, long[] A) {
        int tIdx = maxIdx(T);
        int aIdx = maxIdx(A);
        if (T[tIdx] != A[aIdx]) {
            return 0;
        }

        List<Integer> tvIdx = new ArrayList<>(T.length);
        for (int i = 0; i < T.length - 1; ++i) {
            if (T[i] == T[i + 1]) {
                tvIdx.add(i + 1);
            }
        }
        List<Integer> avIdx = new ArrayList<>(A.length);
        for (int i = A.length - 1; i > 0; --i) {
            if (A[i] == A[i - 1]) {
                avIdx.add(i - 1);
            }
        }
        List<Integer> prod = product(tvIdx, avIdx);
        long[] max = new long[prod.size()];
        long res = 1;
        for (int i = 0; i < max.length; ++i) {
            int idx = prod.get(i);
            long min = Math.min(T[idx], A[idx]);
            res *= min;
        }
        return res;
    }
    private static List<Integer> product(List<Integer> l1, List<Integer> l2) {
        List<Integer> res = new ArrayList<>();
        for (Integer v1 : l1) {
            for (Integer v2 : l2) {
                if (v1.equals(v2)) {
                    res.add(v1);
                }
            }
        }
        return res;
    }
    private static int maxIdx(long[] a) {
        long max = -1;
        int maxIdx = -1;
        for (int i = 0; i < a.length; ++i) {
            if (a[i] > max) {
                max = a[i];
                maxIdx = i;
            }
        }
        return maxIdx;
    }
}