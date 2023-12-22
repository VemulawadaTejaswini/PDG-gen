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
        int small = (int) Math.min(a, b);
        int large = (int) Math.max(a, b);
        for (int i = 0; i < large; i++) {
            System.out.print(small);
        }
        System.out.println();
    }
}

