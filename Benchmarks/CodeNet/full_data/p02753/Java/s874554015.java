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
        solver.solve(S);
    }
}

class Solver {
    public void solve(String S) {
        int aCount = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == 'A') aCount++;
        }

        if (aCount == 0 || aCount == 3) {
            System.out.println("No");
        }
        else {
            System.out.println("Yes");
        }
    }
}

