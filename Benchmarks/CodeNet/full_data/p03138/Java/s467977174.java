import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        sc.close();

        int max = 0;
        for (int i = 0; i < K; i++) {
            int ans = 0;
            for (int j = 0; j < N; j++) {
                ans += i ^ A[j];
            }
            if (max < ans) max = ans;
        }
        System.out.println(max);
    }
}