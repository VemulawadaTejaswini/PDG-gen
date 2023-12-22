import java.io.*;
import java.util.*;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        StringBuffer p = new StringBuffer();
        for(int i = 0 ; i < N ; i++){
            p.append(sc.next());
        }
        StringBuffer q = new StringBuffer();
        for(int i = 0 ; i < N ; i++){
            q.append(sc.next());
        }

        final Solver solver = new Solver(p.toString(), q.toString());
        solver.solve(N);
    }
}

class Solver {
    final String P;
    final String Q;

    long lessThanP = 0;
    long lessThanQ = 0;

    public Solver(String P, String Q) {
        this.P = P;
        this.Q = Q;
    }

    public void solve(int N) {
        StringBuffer sb = new StringBuffer();
        for (int i = 1; i <= N; i++) {
            sb.append(i);
        }
        permutate(sb, 0, N - 1);

        System.out.println(Math.abs(lessThanP - lessThanQ));
    }

    private void permutate(StringBuffer str, int l, int r) {
        if (l == r) {
            final String perm = str.toString();
            if (perm.compareTo(P) < 0) {
                lessThanP++;
            }
            if (perm.compareTo(Q) < 0) {
                lessThanQ++;
            }
        }
        else {
            for (int i = l; i <= r; i++) {
                swap(str, l, i);
                permutate(str, l + 1, r);
                swap(str, l, i);
            }
        }
    }

    private StringBuffer swap(StringBuffer s, int i, int j) {
        char tmp = s.charAt(j);
        s.setCharAt(j, s.charAt(i));
        s.setCharAt(i, tmp);
        return s;
    }
}

