import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        abc141_c solver = new abc141_c();
        solver.solve(1, in, out);
        out.close();
    }

    static class abc141_c {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            int K = in.nextInt();
            int Q = in.nextInt();

            int Player[] = new int[N + 1];
/*
        for (int i = 1; i <= N; i++) {
            Player[i]= K;
        }
 */
            for (int i = 0; i < Q; i++) {
                int acc = in.nextInt();
                Player[acc] += 1;
            /*
            for (int j = 1; j <=N ; j++) {
                if (j != acc) {
                    Player[j]-=1;
                }
            }
            */
            }
            for (int i = 1; i <= N; i++) {
                int dif = Player[i] - Q;
                if (K + dif > 0) {
                    out.println("Yes");
                } else {
                    out.println("No");
                }
            }

        }

    }
}

