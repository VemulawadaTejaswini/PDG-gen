import java.util.Scanner;

class Solver {

    private final int[][] A;
    private final int N;

    Solver(Scanner in){
        N = in.nextInt();
        A = new int[2][N];
        for (int[] ints : A) {
            for (int i = 0; i < ints.length; i++) {
                ints[i] = in.nextInt();
            }
        }
    }

    void solve() {
        int a = A[0][0];
        int b = 0;
        int bsum = A[1][0];
        int max = a;
        for (int i = 1; i < N; i++) {
            a += A[0][i];
            b -= A[1][i-1];
            bsum += A[1][i];
            max = Math.max(a + b, max);
        }
        System.out.println(max + bsum);
    }
}

class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        new Solver(in).solve();

        in.close();
    }
}