import java.util.*;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i=0; i<N; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println(solve(N, a) ? YES : NO);
    }

    private static boolean solve(int N, int[] a) {
        if (allZero(a)) return true;
        if (N%3 != 0) return false;

        Arrays.sort(a);
        List<Pair> set = new ArrayList<>();
        int last = a[0];
        int count = 1;
        for (int i=1; i<N; i++) {
            if (a[i] == last) {
                count++;
            } else {
                set.add(new Pair(last, count));
                last = a[i];
                count = 1;
            }
        }
        set.add(new Pair(last, count));

        if (set.size() == 3) {
            if ((set.get(0).x ^ set.get(1).x ^ set.get(2).x) == 0) {
                if (set.get(0).y == N/3 && set.get(1).y == N/3 && set.get(2).y == N/3) {
                    return true;
                }
            }
        } else if (set.size() == 2) {
            if (set.get(0).x == 0 && set.get(0).y == N/3) {
                return true;
            }
        }

        return false;
    }

    private static boolean allZero(int[] a) {
        for (int i=0; i<a.length; i++) {
            if (a[i] != 0) return false;
        }

        return true;
    }

    public static class Pair {
        public int x;
        public int y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
