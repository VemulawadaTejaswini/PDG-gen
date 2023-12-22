import java.io.*;
import java.util.*;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        String S;
        S = sc.next();
        String T;
        T = sc.next();
        long A;
        A = sc.nextLong();
        long B;
        B = sc.nextLong();
        String U;
        U = sc.next();

        final Solver solver = new Solver();
        solver.solve(S, T, A, B, U);
    }
}

class Solver {
    public void solve(String S, String T, long A, long B, String U) {
        long ansA = A;
        long ansB = B;
        if (U.equals(S)) {
            ansA--;
        }
        if (U.equals(T)) {
            ansB--;
        }
        System.out.println(String.format("%d %d", ansA, ansB));
    }
}

