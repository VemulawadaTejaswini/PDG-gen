
import java.util.*;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        for (int i=0; i<N; i++) {
            A[i] = sc.nextInt();
        }
        for (int i=0; i<N; i++) {
            B[i] = sc.nextInt();
        }

        int ans = solve2(N, A, B);

        System.out.println(ans);
    }

    private static int solve2(int N, int[] A, int[] B) {
        int count = 0;

        int[] C = new int[N];
        long sum = 0;
        long negative = 0;
        for (int i=0; i<N; i++) {
            C[i] = A[i] - B[i];
            sum += C[i];
            if (C[i] < 0) {
                negative -= C[i];
                count++;
                C[i] = 0;
            }
        }
        if (sum < 0) return -1;
        Arrays.sort(C);

        for (int i=N-1; i>0; i--) {
            int next = C[i];
            if (next == 0) break;

            negative -= next;
            count++;
            if (negative <= 0) break;
        }


        return count;
    }
}
