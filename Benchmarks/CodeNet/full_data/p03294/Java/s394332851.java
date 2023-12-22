import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = in.nextInt();
            }

//            int max = 0;
//            for (int i = 0; i < A.length; i++) {
//                max = Math.max(max, A[i]);
//            }
//
//            int max2 = 0;
//            for (int i = 1; i < max; i++) {
//                max2 = Math.max(max2, f(i, A));
//            }

            int max2 = 0;
            for (int i = 0; i < A.length; i++) {
                max2 += A[i] - 1;
            }
            System.out.println(max2);
        }
    }

    private static int f(int n, int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += n % a[i];
        }
        return sum;
    }

}
