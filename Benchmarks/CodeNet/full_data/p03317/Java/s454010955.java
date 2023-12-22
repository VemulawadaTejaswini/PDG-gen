public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int K = in.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < A.length; i++) {
                A[i] = in.nextInt();
            }

            int indexOf1 = -1;
            for (int i = 0; i < A.length; i++) {
                if (A[i] == 1) {
                    indexOf1 = i;
                    break;
                }
            }
            Utils.debug("indexOf1", indexOf1);

            int min = (int) 1e9;
            for (int start = Math.max(0, indexOf1 - (K - 1)); start <= indexOf1; start++) {
                if (start <= indexOf1 && indexOf1 < start + K) {
                } else {
                    Utils.debug("@");
                }

                int count = 1;
                for (int i = start; i > 0; count++, i -= K - 1) {
                }
                Utils.debug(start, "count", count);
                for (int i = start + (K - 1); i < N - 1; count++, i += K - 1) {
                }
                Utils.debug(start, "count", count);
                // count += start / K;
                // count += ((N - 1) - (start + (K - 1))) / K;
                min = Math.min(min, count);
            }

            System.out.println(min);
        }
    }

}

final class Utils {
    private Utils() {
    }

    public static final void debug(Object... o) {
        System.err.println(toString(o));
    }

    public static final String toString(Object... o) {
        return Arrays.deepToString(o);
    }

}
