import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] cnt = new int[n + 1];

        sc.close();

        int mod = 1000000007;

        for (int i = 1; i <= n; i++) {
            int num = i;
            for (int j = 2; j <= n; j++) {
                while (num % j == 0) {
                    cnt[j]++;
                    cnt[j] %= mod;
                    num /= j;
                }
            }
        }

        long ans = 1;
        for (int num : cnt) {
            ans = (ans * (num + 1)) % mod;
        }

        System.out.println(ans);

    }
}