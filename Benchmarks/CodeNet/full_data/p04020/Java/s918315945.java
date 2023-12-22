import java.util.Scanner;

class Solver {

    private final int N;
    private final int[] A;

    Solver(Scanner in) {
        N = in.nextInt();
        A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = in.nextInt();
        }
    }

    void solve() {
        long counter = A[0] / 2;
        int mod = A[0] % 2;
        for (int i = 1; i < A.length; i++) {
            A[i] -= mod;
            if (A[i] < 0) mod = 0;
            else {
                counter += mod;
                counter += A[i] / 2;
                mod = A[i] % 2;
            }
        }
        System.out.println(counter);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        new Solver(in).solve();

        in.close();
    }
}