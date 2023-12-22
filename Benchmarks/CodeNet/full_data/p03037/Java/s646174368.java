import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();// cards
        int M = scan.nextInt();// gates
        int[] L = new int[M];
        int[] R = new int[M];
        int[] counter = new int[N];
        for (int i = 0; i < M; i++) {
            L[i] = scan.nextInt();
            R[i] = scan.nextInt();
        }
        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < M; j++) {
                if (i >= L[j] && i <= R[j]) {
                    counter[i - 1] = counter[i - 1] + 1;
                }
            }
        }
        int ans = 0;
        for (int k = 0; k < N; k++) {
            if (counter[k] == M) {
                ans++;
            }
        }
        System.out.print(ans);

    }
}