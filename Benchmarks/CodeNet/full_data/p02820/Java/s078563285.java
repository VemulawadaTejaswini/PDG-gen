import java.io.*;
import java.util.*;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        int N;
        N = sc.nextInt();
        int K;
        K = sc.nextInt();
        long R;
        R = sc.nextLong();
        long S;
        S = sc.nextLong();
        long P;
        P = sc.nextLong();
        String T;
        T = sc.next();

        final Solver solver = new Solver(R, S, P);
        solver.solve(N, K, T);
    }
}

class Solver {
    private long R;
    private long S;
    private long P;

    public Solver(long R, long S, long P) {
        this.R = R;
        this.S = S;
        this.P = P;
    }

    public void solve(int N, int K, String T) {
        long ans = 0;
        for (int i = 0; i < K; i++) {

            final List<Character> hands = new ArrayList<>();
            for (int j = i; j < N; j += K) {
                final char h = getBestHand(T, j, K, hands);
                hands.add(h);

                ans += getPoints(T.charAt(j), h);
            }
        }
        System.out.println(ans);
    }

    private char getBestHand(String T, int j, int step, List<Character> hands) {
        final Character prev = hands.isEmpty() ? null : hands.get(hands.size() - 1);
        final Character next = j + step >= T.length() ? null : T.charAt(j + step);
        final Character cur = T.charAt(j);

        switch (cur) {
            case 'r':
                if (prev != null && prev == 'p') {
                    if (next == null) return 'r';
                    switch (next) {
                        case 'r':
                            return 'r';
                        case 's':
                            return 's';
                        case 'p':
                            return 'r';
                    }
                }
                return 'p';
            case 's':
                if (prev != null && prev == 'r') {
                    if (next == null) return 's';
                    switch (next) {
                        case 'r':
                            return 's';
                        case 's':
                            return 's';
                        case 'p':
                            return 'p';
                    }
                }
                return 'r';
            case 'p':
                if (prev != null && prev == 's') {
                    if (next == null) return 'p';
                    switch (next) {
                        case 'r':
                            return 'r';
                        case 's':
                            return 'p';
                        case 'p':
                            return 'r';
                    }
                }
                return 's';
        }

        assert false;

        return 'n';
    }

    private long getPoints(char machine, char hand) {
        switch (machine) {
            case 'r':
                if (hand == 'p') return P;
                break;
            case 's':
                if (hand == 'r') return R;
                break;
            case 'p':
                if (hand == 's') return S;
                break;
        }

        return 0;
    }
}

