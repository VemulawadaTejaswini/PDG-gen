import java.io.*;
import java.util.*;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long P;
        P = sc.nextLong();
        long Q;
        Q = sc.nextLong();
        long R;
        R = sc.nextLong();

        final Solver solver = new Solver();
        solver.solve(P, Q, R);
    }
}

class Solver {
    public void solve(long P, long Q, long R) {
        long M = Math.max(P, Math.max(Q, R));
        System.out.println(P + Q + R - M);
    }
}
