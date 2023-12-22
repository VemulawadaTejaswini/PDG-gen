.util.*;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        long[] A = new long[N];
        long[] B = new long[N];
        long[] C = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextLong();
        }
        for (int i = 0; i < N; i++) {
            B[i] = sc.nextLong();
        }
        for (int i = 0; i < N; i++) {
            C[i] = sc.nextLong();
        }

        Arrays.sort(A);
        Arrays.sort(B);
        Arrays.sort(C);

        // Bを固定して尺取り法
        int aIndex = 0;
        int cIndex = 0;
        long cnt = 0;
        for (int i = 0; i < N; i++) {

            // bより小さいところまで
            while (aIndex < N && A[aIndex] < B[i]) {
                aIndex++;
            }

            while (cIndex < N && C[cIndex] <= B[i]) {
                cIndex++;
            }

            cnt += aIndex * (N - cIndex);
        }

        out.println(cnt);
    }
}