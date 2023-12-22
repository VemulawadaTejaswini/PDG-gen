import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        int[][] C = new int[N][2];
        int sum = 0;
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
            sum += B[i];
            C[i][0] = A[i];
            C[i][1] = B[i];
        }
        sc.close();
        Arrays.sort(C, (a, b) -> Integer.compare(a[0], b[0]));
        long ans = 0;
        long tmp = M;
        for (int i = 0; i < M; i++) {
            if (C[i][1] < tmp) {
                tmp -= C[i][1];
                ans += C[i][0] * C[i][1];
            } else {
                ans += C[i][0] * tmp;
                break;
            }
        }
        System.out.println(ans);
    }
}