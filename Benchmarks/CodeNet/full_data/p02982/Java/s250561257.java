import java.util.Scanner;

public class Main {
    //
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), d = sc.nextInt();
        int[][] A = new int[n][d];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < d; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println(sln(A, n, d));
        sc.close();
    }

    static int sln(int[][] A, int n, int d) {
        int res = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int[] B = A[i];
                int[] C = A[j];
                if (helper(B, C, d)) res++;
            }
        }
        return res;
    }

    static boolean helper(int[] A, int[] B, int d) {
        int sum = 0;
        for (int i = 0; i < d; i++) {
            sum += Math.pow(A[i] - B[i], 2);
        }
        int m = (int) Math.sqrt(sum);
        if (m * m == sum) return true;
        return false;
    }
}
