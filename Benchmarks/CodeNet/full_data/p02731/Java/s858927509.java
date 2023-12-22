import java.io.*;
import java.util.*;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long L;
        L = sc.nextLong();

        final Solver solver = new Solver();
        solver.solve(L);
    }
}

class Solver {
    public void solve(long L) {
        double s = L / 3.0;
        System.out.println(String.format("%f", s * s * s));
    }
}

