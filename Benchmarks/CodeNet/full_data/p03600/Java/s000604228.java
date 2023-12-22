import java.util.Scanner;
import java.util.Stack;

class Main {

    public static void main(String[] args) {
        new Main().compute();
    }

    void compute() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] A = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    if (A[i][j] + A[i][k] < A[j][k]) {
                        System.out.println("-1");
                        return;
                    }
                }
            }
        }
        long ans = 0;
        for (int i = 0; i < N; i++) {
            check:
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    if (A[j][k] + A[i][k] == A[i][j] && i != k && i != j && j != k) {
                        continue check;
                    }
                }
                ans += A[i][j];
            }
        }
        System.out.println(ans / 2);
    }
}
