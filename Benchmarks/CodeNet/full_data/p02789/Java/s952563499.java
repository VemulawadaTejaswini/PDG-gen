import java.io.*;
import java.util.*;

public class Main {
    static final String YES = "Yes";
    static final String NO = "No";

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long N;
        N = sc.nextLong();
        long M;
        M = sc.nextLong();

        final Solver solver = new Solver();
        solver.solve(N, M);
    }
}

class Solver {
    public void solve(long N, long M) {
        if (N == M) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}

