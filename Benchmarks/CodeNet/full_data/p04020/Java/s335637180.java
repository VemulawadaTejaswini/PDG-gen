import java.util.Scanner;

class Solver {

    private final int N;
    private final int[] A;

    Solver(Scanner in){
        N = in.nextInt();
        A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = in.nextInt();
        }
    }

    void solve() {
        int counter = A[0] / 2;
        int mod = A[0] % 2;
        for (int i = 1; i < A.length; i++) {
            counter += (A[i] + mod) / 2;
            mod = Math.min((A[i] + mod) % 2, A[i]);
        }
        System.out.println(counter);
    }
}

class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        new Solver(in).solve();

        in.close();
    }
}