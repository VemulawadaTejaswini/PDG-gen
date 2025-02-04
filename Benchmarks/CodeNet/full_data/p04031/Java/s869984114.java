import java.util.*;

class Main {
        public static void main(String args[]) {
                int N;
                int[] A;
                try (Scanner sc = new Scanner(System.in)) {
                        N = sc.nextInt();
                        A = new int[N];
                        for (int i = 0; i < N; i++) {
                                A[i] = sc.nextInt();
                        }
                } catch (Exception e) {
                        return;
                }
                long ans  = 1L << 60;
                for (int j = -100; j <= 100; j++) {
                        int memo = 0;
                        for (int i = 0; i < N; i++) {
                                memo += (A[i] - j) * (A[i] - j);
                        }
                        ans = Math.min(memo, ans);
                }
                System.out.println(ans);
        }
}