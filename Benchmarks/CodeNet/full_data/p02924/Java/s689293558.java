import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = N - i;
        }

        for (int i = 1; i < N; i++) {
            if (i % A[i - 1] == 0) {
                int tmp = A[i - 1];
                A[i - 1] = A[i];
                A[i] = tmp;
                i++;
            }
        }

        int ans = 0;
        for (int i = 1; i <= N; i++) {
            ans += i % A[i - 1];
        }
        System.out.println(ans);
    }
}