import java.io.*;
import java.util.*;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long S;
        S = sc.nextLong();

        final Solver solver = new Solver();
        System.out.println(solver.solve(S));
    }
}

class Solver {
    public String solve(long S) {
        long first = S / 100;
        long second = S % 100;

        if (first == 0 && second == 0) {
            return "NA";
        }
        if (first > 12 && second > 12) {
            return "NA";
        }

        if (first > 12) {
            return "YYMM";
        }

        if (second > 12) {
            return "MMYY";
        }

        return "AMBIGUOUS";
    }
}

