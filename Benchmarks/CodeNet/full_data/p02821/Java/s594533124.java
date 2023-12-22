import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int MAX = (int) 1e5;
            int N = sc.nextInt();
            long M = sc.nextLong();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            long[] csNum = new long[MAX + 2];
            for (int i = 0; i < N; i++)
                csNum[A[i]]++;
            for (int i = MAX - 1; i >= 0; i--)
                csNum[i] += csNum[i + 1];
            long[] csSum = new long[MAX + 2];
            for (int i = 0; i < N; i++)
                csSum[A[i]] += A[i];
            for (int i = MAX - 1; i >= 0; i--)
                csSum[i] += csSum[i + 1];

            int ok = 0, ng = MAX * 2 + 1;
            while (Math.abs(ok - ng) > 1) {
                int mid = (ok + ng) / 2;
                long sum = 0;
                for (int i = 0; i < N; i++) {
                    sum += csNum[Math.min(MAX + 1, Math.max(0, mid - A[i]))];
                }
                if (sum >= M)
                    ok = mid;
                else
                    ng = mid;
            }

            long ans = 0, num = 0;
            for (int i = 0; i < N; i++) {
                ans += A[i] * csNum[Math.min(MAX + 1, Math.max(0, ok + 1 - A[i]))]
                        + csSum[Math.min(MAX + 1, Math.max(0, ok + 1 - A[i]))];
                num += csNum[Math.min(MAX + 1, Math.max(0, ok + 1 - A[i]))];
            }
            ans += (M - num) * ok;
            System.out.println(ans);
        }
    }

}
