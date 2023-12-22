import java.util.Scanner;

class Main {
    static final long mod = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = 1;
        long[] cnt = new long[n + 1];
        for (int i = 2; i < n + 1; i++) {
            int tmp = i;
            int j = 2;
            while (tmp != 1) {
                while (tmp % j == 0) {
                    tmp = tmp / j;
                    cnt[j]++;
                }
                j++;
            }
        }
        for (int i = 1; i < n + 1; i++) {
            ans = ans * (cnt[i] + 1) % mod;
        }
        System.out.println(ans);
        sc.close();
    }
}