import java.io.*;
import java.util.*;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long N;
        N = sc.nextLong();

        final Solver solver = new Solver();
        solver.solve(N);
    }
}

class Solver {
    public void solve(long N) {
        if (N > 999) {
            System.out.println("ABD");
        } else {
            System.out.println("ABC");
        }
    }
}

