import java.io.*;
import java.util.*;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long K = sc.nextLong();
        long X = sc.nextLong();

        final Solver solver = new Solver();
        solver.solve(K, X);
    }
}

class Solver {
    public void solve(long K, long X) {
        System.out.println(500 * K >= X ? "Yes" : "No");
    }
}

