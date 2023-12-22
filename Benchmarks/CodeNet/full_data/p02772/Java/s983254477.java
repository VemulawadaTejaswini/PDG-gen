import java.io.*;
import java.util.*;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        final List<Integer> A = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            A.add(sc.nextInt());
        }

        final Solver solver = new Solver();
        solver.solve(A);
    }
}


class Solver {
    public void solve(final List<Integer> A) {
        boolean ans = true;
        for (final Integer a : A) {
            if (a % 2 == 0) {
                if (a % 3 == 0 || a % 5 == 0) {

                }
                else {
                    ans = false;
                    break;
                }
            }
        }

        System.out.println(ans ? "APPROVED" : "DENIED");
    }
}

