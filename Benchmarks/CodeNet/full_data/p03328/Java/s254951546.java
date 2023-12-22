import java.io.*;
import java.util.*;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long a;
        a = sc.nextLong();
        long b;
        b = sc.nextLong();

        final Solver solver = new Solver();
        solver.solve(a, b);
    }
}

class Solver {
    public void solve(long a, long b) {
        long ans = (b - a - 1) * (b - a) / 2 - a;
        System.out.println(ans);
    }
}

