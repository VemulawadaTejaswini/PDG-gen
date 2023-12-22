import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Solver {

    public void run() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
            max = Math.max(max, a[i]);
        }

        int[] cnt = new int[max + 3];
        for (int i = 0; i < N; i++) {
            cnt[a[i] + -1 + 1]++;
            cnt[a[i] +  0 + 1]++;
            cnt[a[i] +  1 + 1]++;
        }

        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < max + 2; i++) {
            ans = Math.max(ans, cnt[i]);
        }

        System.out.println(ans);
        return;
    }

}