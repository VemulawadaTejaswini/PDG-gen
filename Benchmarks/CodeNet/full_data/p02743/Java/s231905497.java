import java.io.*;
import java.util.*;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long a;
        a = sc.nextLong();
        long b;
        b = sc.nextLong();
        long c;
        c = sc.nextLong();

        final Solver solver = new Solver();
        solver.solve(a, b, c);
    }
}

class Solver {
    static final String YES = "Yes";
    static final String NO = "No";

    public void solve(long a, long b, long c) {

        if (a + b + 2 * Math.sqrt(a) * Math.sqrt(b) < c) {
            System.out.println(YES);
        }
        else {
            System.out.println(NO);
        }
    }
}

