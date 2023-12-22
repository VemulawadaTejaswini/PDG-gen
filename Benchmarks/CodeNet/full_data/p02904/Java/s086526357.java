import java.io.*;
import java.util.*;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long N;
        N = sc.nextLong();
        long K;
        K = sc.nextLong();
        long[] P = new long[(int)(N)];
        for(int i = 0 ; i < N ; i++){
                P[i] = sc.nextLong();
        }

        final Solver solver = new Solver();
        solver.solve(N, K, P);
    }
}

class Solver {
    public void solve(long N, long K, long[] P) {

        final Deque<Integer> deque = new LinkedList<>();
        long ans = 1;
        long sorted = 0;
        for (int i = 0; i < N; i++) {
            if (i >= K - 1 && deque.size() == K) {
                sorted++;
            }

            boolean isRightMax = true;
            while (!deque.isEmpty() && P[deque.peekLast()] >= P[i]) {
                deque.removeLast();
                isRightMax = false;
            }
            deque.addLast(i);

            if (i >= K) {
                int left = (int) (i - K);
                boolean isLeftMin = deque.peekFirst() == left;

                boolean isEquivalent = isLeftMin && isRightMax;
                if (!isEquivalent) {
                    ans++;
                }

                if (isLeftMin) {
                    deque.removeFirst();
                }

            }
        }

        if (sorted == 0) {
            System.out.println(ans);
        }
        else {
            System.out.println(ans - sorted + 1);
        }
    }
}

