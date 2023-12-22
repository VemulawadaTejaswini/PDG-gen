import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            solve(in);
        }
    }

    static void solve(Scanner in) {
        int N = in.nextInt();
        int[] T = new int[N];
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            T[i] = in.nextInt();
            A[i] = in.nextInt();
        }

        long t = T[0];
        long a = A[0];
        for (int i = 1; i < N; i++) {
            int Ti = T[i];
            int Ai = A[i];
            long Tm = (t - 1) / Ti;
            long Am = (a - 1) / Ai;
            long m = Tm > Am ? Tm : Am;
            Ti += Ti * m;
            Ai += Ai * m;
            int sum = Ti + Ai;
            t = (sum) * T[i] / (T[i] + A[i]);
            a = (sum) * A[i] / (T[i] + A[i]);
        }
        System.out.println(t + a);
    }
}