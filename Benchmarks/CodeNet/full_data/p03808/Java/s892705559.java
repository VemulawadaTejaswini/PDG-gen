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

        int maxi = 0;
        for (int i = 0; i < N; i++) {
            A[i] = in.nextInt();
            maxi = A[maxi] > A[i] ? maxi : i;
        }

        int[] M = new int[N];
        int[] B = new int[N];

        while (A[maxi] - B[maxi] > 0) {
//            System.out.println(Arrays.toString(A) + " " + maxi);
            int li = (maxi + N - 1) % N;
            int ci = maxi;
            int ri = (maxi + 1) % N;
            if (B[li] == 0) {
                init(B, M, li);
            }
            if (B[ci] == 0) {
                init(B, M, ci);
            }
            if (B[ri] == 0) {
                init(B, M, ri);
            }
            M[maxi]++;
            add(B, M, li, maxi);
            add(B, M, ci, maxi);
            add(B, M, ri, maxi);

            int nexi = A[li] - B[li] > A[ci] - B[ci] ? li : ci;
            nexi = A[ci] - B[ci] > A[ri] - B[ri] ? ci : ri;

            maxi = nexi;
//            System.out.println(Arrays.toString(B) + " B");
//            System.out.println(Arrays.toString(M) + " M");
        }

//        System.out.println(Arrays.toString(A) + " A");
//        System.out.println(Arrays.toString(B) + " B");
//        System.out.println(Arrays.toString(M) + " M");

        boolean ans = true;
        for (int i = 0; i < N; i++) {
            init(B, M, i);
            if (A[i] - B[i] != 0) {
                ans = false;
                break;
            }
        }
        System.out.println(ans ? "YES" : "NO");
    }

    private static void add(int[] B, int[] M, int i, int mi) {
        int N = B.length;
        if (i > mi) {
            B[i] += (i - mi) * M[mi];
        } else {
            B[i] += (N + i - mi) * M[mi];
        }
    }

    private static void init(int[] B, int[] M, int i) {
        int N = B.length;
        B[i] = 0;
        for (int mi = 0; mi < N; mi++) {
            add(B, M, i, mi);
        }
    }
}