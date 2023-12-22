import java.util.*;

class Main {
    final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        long n = sc.nextLong();

        long ans = Long.MAX_VALUE;
        for (long i = 1; i*i <= n; i++) {
            if (n % i == 0) {
                ans = Math.min(i-1 + n/i-1, ans);
            }
        }
        System.out.println(ans);
    }
}

