import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long ans = 0;

        for (int m = 1; m * m <= n; m++) {
            if (n % m == 0) {
                if (m > 1) {
                    if (n / (m - 1) == n % (m - 1))
                        ans += m - 1;
                }
                if (n / (n / m - 1) == n % (n / m - 1))
                    ans += n / m - 1;
            }
        }

        System.out.println(ans);
        sc.close();
    }
}