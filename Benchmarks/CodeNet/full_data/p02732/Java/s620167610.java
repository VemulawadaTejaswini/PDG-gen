import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Solver {

    private long combi2(long n) {
        return n * (n - 1) / 2;
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int[] cnt = new int[200005];
        for (int i = 0; i < N; i++) {
            cnt[A[i]]++;
        }

        long sum = 0;
        for (int i = 0; i < 200005; i++) {
            if (cnt[i] > 1) {
                sum+=combi2(cnt[i]);
            }
        }

        for (int k = 0; k < N; k++) {
            // k: bannded index
            int b = A[k];
            long prev = 0;
            long cur = 0;
            if (cnt[b] > 1) prev = combi2(cnt[b]);
            sum-=prev;
            cnt[b]--;
            if (cnt[b] > 1) cur = combi2(cnt[b]);
            sum+=cur;
            System.out.println(sum);
            sum-=cur;
            cnt[b]++;
            sum+=prev;
        }

        return;
    }

}