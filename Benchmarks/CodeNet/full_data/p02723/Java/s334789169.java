import java.io.*;
import java.util.*;

public class Main {
    static final String YES = "Yes";
    static final String NO = "No";

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        String S;
        S = sc.next();

        final Solver solver = new Solver();
        System.out.println(solver.solve(S) ? YES : NO);
    }
}

class Solver {
    public boolean solve(String S) {
        return S.charAt(2) == S.charAt(3) && S.charAt(4) == S.charAt(5);
    }
}

