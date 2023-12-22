import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int N = sc.nextInt();
        final int M = sc.nextInt();

        int[] ans = new int[N];
        for (int i = 0; i < N; i++) {
            ans[i] = Integer.MAX_VALUE;
        }

        for (int i = 0; i < M; i++) {
            int s = sc.nextInt();
            int c = sc.nextInt();

            ans[s-1] = Math.min(ans[s-1], c);
        }

        if (ans[0] == Integer.MAX_VALUE || ans[0] == 0) {
            System.out.println(-1);
            return;
        }

        for (int i = 0; i < N; i++) {
            System.out.print(ans[i] == Integer.MAX_VALUE ? 0 : ans[i]);
        }
        System.out.println();
    }
}
