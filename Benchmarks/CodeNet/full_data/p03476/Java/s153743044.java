import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        boolean[] sieve = sieve(100000 + 10);
        int[] like = new int[100000 + 10 + 1];
        like[0] = 0;
        like[1] = 0;
        like[2] = 0;
        for (int i = 3; i < 100000 + 10; i += 2) {
            if (sieve[i] == true && sieve[(i + 1) / 2] == true) {
                like[i] = like[i-2] + 1;
            } else {
                like[i] = like[i-2];
            }
        }

        for (int i = 0; i < q; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();

            int ans = 0;
            if (l == 1) ans = like[r];
            else ans = like[r] - like[l - 2];
            System.out.println(ans);
        }
    }

    public static boolean[] sieve(int n) {
        final boolean[] sieve = new boolean[n+1];
        sieve[0] = false;
        sieve[1] = false;
        sieve[2] = true;
        for (int i = 3; i <= n; i += 2) {
            sieve[i] = true;
        }

        for (int i = 3; i * i <= n; i += 2) {
            if (sieve[i]) {
                for (int j = i * 2; j <= n; j += i) {
                    sieve[j] = false;
                }
            }
        }

        return sieve;
    }
}
