public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt(), ans = 0;
        int[] a = new int[n], b = new int[n], dp = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = scanner.nextInt();
        for (int i = 0; i < n; i++)
            for (int j = 0, k = b[i] = scanner.nextInt(); j < n; j++)
                if (a[j] < k) dp[i]++;
        for (int i = 0; i < n; i++)
            for (int j = 0, k = scanner.nextInt(); j < n; j++)
                if (b[j] < k) ans += dp[j];
        System.out.println(ans);
    }
}