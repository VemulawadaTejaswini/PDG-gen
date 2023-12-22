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
        long odd = N % 2 == 0 ? N / 2 : N / 2 + 1;
        System.out.println(String.format("%f", odd / (double) N));
    }
}

