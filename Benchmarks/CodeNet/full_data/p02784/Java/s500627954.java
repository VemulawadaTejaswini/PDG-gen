import java.io.*;
import java.util.*;

public class Main {
    static final String YES = "Yes";
    static final String NO = "No";

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long H;
        H = sc.nextLong();
        long N;
        N = sc.nextLong();
        List<Long> A = new ArrayList<>();
        for(int i = 0 ; i < N ; i++){
                A.add(sc.nextLong());
        }

        final Solver solver = new Solver();
        solver.solve(H, N, A);
    }
}

class Solver {
    public void solve(long H, long N, List<Long> A) {
        A.sort(Collections.reverseOrder());

        long life = H;
        for (int i = 0; i < N; i++) {
            H -= A.get(i);
            if (H <= 0) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}

