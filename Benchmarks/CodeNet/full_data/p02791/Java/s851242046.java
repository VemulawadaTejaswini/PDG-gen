import java.util.*;

class Main {
    final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        int n = sc.nextInt();

        int min = Integer.MAX_VALUE;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int p = sc.nextInt();
            if (min > p) ans++;
            min = Math.min(p, min);
        }
        System.out.println(ans);
    }
}
