import java.util.*;

public class Main {

    static final int NONE = -1;
    static final int A_MAX = 2 * 100000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long K = sc.nextLong();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) A[i] = sc.nextInt();

        int[] toNext = new int[N];
        int[] first = new int[A_MAX + 1];
        int[] last = new int[A_MAX + 1];
        Arrays.fill(first, -1);
        Arrays.fill(last, -1);

        for (int i = 0; i < N; i++) {
            if (first[A[i]] == NONE) {
                first[A[i]] = i;
                last[A[i]] = i;
            } else {
                toNext[last[A[i]]] = i - last[A[i]] + 1;
                last[A[i]] = i;
            }
        }

        for (int i = 0; i < N; i++) {
            if (first[A[i]] != NONE) {
                toNext[last[A[i]]] = N - last[A[i]] + first[A[i]] + 1;
            }
        }

        int pos = 0;
        long ops = 0;
        long[] firstVisit = new long[N];
        Arrays.fill(firstVisit, NONE);

        while (true) {
            if (firstVisit[pos] != NONE) {
                long cycleLength = ops - firstVisit[pos];
                ops += ((N * K - ops) / cycleLength) * cycleLength;
            } else {
                firstVisit[pos] = ops;
            }
            if (ops + toNext[pos] > N * K) break;
            ops += toNext[pos];
            pos = (pos + toNext[pos]) % N;
        }

        long remainingOps = N * K - ops;

        LinkedList<Integer> sol = new LinkedList<>();
        boolean[] contains = new boolean[A_MAX + 1];

        for (int i = 0; i < remainingOps; i++) {
            int a = A[(pos + i) % N];
            if (contains[a]) {
                int x = sol.pollLast();
                while (x != a) {
                    contains[x] = false;
                    x = sol.pollLast();
                }
                contains[x] = false;
            } else {
                contains[a] = true;
                sol.addLast(a);
            }
        }

        for (int s : sol) {
            System.out.print(s + " ");
        }
    }
}
