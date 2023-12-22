import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        sc.close();

        int gcd_max = 0;
        int min = A[0];
        for (int i = 0; i < N; i++) {
            min = Math.min(A[i], min);
        }

        for (int i = 0; i < N; i++) {
            int a = 0;
            int b = min;
            if (A[i] >= b) {
                a = A[i];
            } else {
                continue;
            }

            while (a % b != 0){
                int extra = a % b;
                a = b;
                b = extra;
            }
            gcd_max = Math.max(gcd_max, b);
        }

        // for (int i = 0; i < N - 1; i++) {
        //     for (int j = i + 1; j < N; j++) {
        //         int a = Math.max(A[i], A[j]);
        //         int b = Math.min(A[i], A[j]);
        //         while (a % b != 0) {
        //             int extra = a % b;
        //             a = b;
        //             b = extra;
        //         }
        //         gcd_max = Math.max(gcd_max, b);
        //     }
        // }
        System.out.println(gcd_max);
    }
}
