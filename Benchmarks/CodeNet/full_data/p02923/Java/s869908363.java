import java.util.*;

class Main {
    final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        int n = sc.nextInt();
        int[] h = new int[n+1];
        h[n] = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }

        int ans = 0;
        int cnt = 0;
        for (int i = 1; i < n+1; i++) {
            if (h[i-1] < h[i]) {
                ans = Math.max(ans, cnt);
                cnt = 0;
            } else {
                cnt++;
            }
        }
        System.out.println(ans);
    }
}

