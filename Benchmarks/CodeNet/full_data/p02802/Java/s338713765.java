import java.io.*;
import java.util.*;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long N;
        N = sc.nextLong();
        long M;
        M = sc.nextLong();
        long[] p = new long[(int)(M)];
        String[] S = new String[(int)(M)];
        for(int i = 0 ; i < M ; i++){
                p[i] = sc.nextLong();
                S[i] = sc.next();
        }

        final Solver solver = new Solver();
        solver.solve(N, M, p, S);
    }
}

class Solver {
    private static final String AC = "AC";
    private static final String WA = "WA";

    public void solve(long N, long M, long[] p, String[] S) {
        long was = 0;

        Set<Long> acs = new HashSet<>();
        for (int i = 0; i < M; i++) {
            if (S[i].equals(AC)) {
                acs.add( p[i]);
                if (acs.size() >= N) {
                    break;
                }
            }
            else {
                was += acs.contains(p[i]) ? 0 : 1;
            }
        }
        System.out.println(String.format("%d %d", acs.size(), was));
    }
}

