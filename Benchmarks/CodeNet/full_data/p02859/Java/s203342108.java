import java.io.*;
import java.util.*;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long r;
        r = sc.nextLong();

        final Solver solver = new Solver();
        solver.solve(r);
    }
}

class Solver {
    public void solve(long r) {
        System.out.println(r * r);
    }
}

