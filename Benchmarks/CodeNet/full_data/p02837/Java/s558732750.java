import java.io.*;
import java.util.*;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][][] t = new int[N][][];
        for (int i = 0; i < N; i++) {
            int A = sc.nextInt();
            t[i] = new int[A][2];
            for (int j = 0; j < A; j++) {
                t[i][j][0] = sc.nextInt() - 1;
                t[i][j][1] = sc.nextInt();
            }
        }

        Solver solver = new Solver();
        solver.solve(N, t);
    }
}

class Solver {
    public void solve(int N, int[][][] t) {
        int M = 2 << (N - 1);
        int max = 0;

        for (int i = 0; i < M; i++) {

            boolean correct = true;
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < t[j].length; k++) {
                    if (!isHonest(i, j)) continue;

                    if (t[j][k][1] == 1 && !isHonest(i, t[j][k][0])) {
                        correct = false;
                        break;
                    }

                    if (t[j][k][1] == 0 && isHonest(i, t[j][k][0])) {
                        correct = false;
                        break;
                    }
                }

                if (!correct) {
                    break;
                }
            }

            if (correct && max < honestCount(i, N)) {
                max = honestCount(i, N);
            }
        }

        System.out.println(max);
    }

    private int honestCount(int i, int N) {
        int sum = N;
        while (i > 0) {
            if ((i & 0x01) == 1) sum--;
            i /= 2;
        }
        return sum;
    }

    private boolean isHonest(int i, int honest) {
        return ((i >> honest) & 0x01) == 0;
    }
}


