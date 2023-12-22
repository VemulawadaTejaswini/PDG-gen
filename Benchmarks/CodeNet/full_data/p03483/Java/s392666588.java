import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(final String[] args) {
        new Solver().run();
    }

    static class Solver {
        private final static int N_MAX = 200050;
        int[] seg = new int[N_MAX];

        void inc(int x, int v) {
            x++;
            for (int i = x; i < N_MAX; i += i & -i) {
                seg[i] += v;
            }
        }

        int sum(int x) {
            x++;
            int ans = 0;
            for (int i = x; i > 0; i -= i & -i) {
                ans += seg[i];
            }
            return ans;
        }

        boolean deadPos(int x) {
            return sum(x) - sum(x - 1) == 0;
        }

        int countFront(int x) {
            return sum(x - 1);
        }

        int countBack(int x) {
            return sum(N_MAX - 10) - sum(x);
        }


        void run() {
            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            int[] frequency = new int[128];
            List<Deque<Integer>> idxs = new ArrayList<>();
            for (int i = 0; i < 128; i++) {
                idxs.add(new ArrayDeque<>());
            }

            for (int i = 0; i < s.length(); i++) {
                frequency[s.charAt(i)]++;
                inc(i, 1);
                idxs.get(s.charAt(i)).add(i);
            }

            if (Arrays.stream(frequency).mapToLong(i -> i % 2).sum() > 1) {
                System.out.println(-1);
                return;
            }

            int l = 0, r = s.length() - 1;
            int ans = 0;
            while (l < r) {
                if (deadPos(l)) {
                    l++;
                } else if (deadPos(r)) {
                    r--;
                } else if (frequency[s.charAt(l)] == 1) {
                    l++;
                } else if (frequency[s.charAt(r)] == 1) {
                    r--;
                } else {
                    int lc = countBack(idxs.get(s.charAt(l)).getLast()) + countFront(l);
                    int rc = countFront(idxs.get(s.charAt(r)).getFirst()) + countBack(r);

                    if (lc < rc) {
                        ans += lc;
                        inc(l, -1);
                        inc(idxs.get(s.charAt(l)).getLast(), -1);
                        idxs.get(s.charAt(l)).removeFirst();
                        idxs.get(s.charAt(l)).removeLast();
                        frequency[s.charAt(l)] -= 2;
                    } else {
                        ans += rc;
                        inc(r, -1);
                        inc(idxs.get(s.charAt(r)).getFirst(), -1);
                        idxs.get(s.charAt(r)).removeFirst();
                        idxs.get(s.charAt(r)).removeLast();
                        frequency[s.charAt(r)] -= 2;
                    }
                }
            }
            System.out.println(ans);
        }

    } ;


}