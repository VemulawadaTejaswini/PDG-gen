import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Z = sc.nextInt();
        int W = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println( solve(N, Z, W, A) );
    }

    private static int solve(int N, int Z, int W, int[] A) {
        if( N == 1 ) {
            return Math.abs(A[N-1] - W);

        } else {
            // 全部取っていきなり終了のケース
            int case_1 = Math.abs(A[N-1] - W);

            // 相手に残ったものを取らせるケース
            int case_2 = Math.abs(A[N-1] - A[N-2]);

            return Math.max(case_1, case_2);
        }
    }
}