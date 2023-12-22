import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
//            while (true)
                solve(in);
        }
    }

    private static void solve(Scanner in) {
        int N = in.nextInt();
        int[] A = new int[N];

//        int maxi = 0;
        for (int i = 0; i < N; i++) {
            A[i] = in.nextInt();
//            maxi = A[maxi] > A[i] ? maxi : i;
        }

        //
        boolean algo = true;
        if (N > 1) {
            int d = A[1] - A[0];
            int e = d > 0 ? (d - N) : d + N;
            for (int i = 1; i < N; i++) {
                int di = A[i] - A[i - 1];
                if (di != d && di != e) {
                    algo = false;
                    break;
                }
            }
        }
        //

//        while (A[maxi] != 0) {
//            System.out.println(Arrays.toString(A) + " " + maxi);
//            int nexi = (maxi + 1) % N;
//            for (int j = 1; j < N + 1; j++) {
//                int k = (maxi + j) % N;
//                A[k] -= j;
//                maxi = A[maxi] > A[k] ? maxi : k;
//            }
//            maxi = nexi;
//        }

//        System.out.println(Arrays.toString(A));

//        boolean ans = true;
//        for (int i = 0; i < N; i++) {
//            if (A[i] != 0) {
//                ans = false;
//                break;
//            }
//        }
        System.out.println(algo ? "YES" : "NO");
//        System.out.println(ans ? "YES" : "NO");
    }
}