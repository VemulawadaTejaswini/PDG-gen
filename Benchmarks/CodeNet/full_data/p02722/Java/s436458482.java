import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        long n = in.nextLong(), ans = 0;
        for (long i = 1; i * i <= n - 1; i++) {
            if ((n - 1) % i == 0) {
                if (i != 1)
                    ans++;
                if ((n - 1) / i != i)
                    ans++;
            }
        }
        for (long i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                long x = n / i;
                while (x % i == 0) {
                    x /= i;
                }
                if (x % i == 1) {
                    ans++;
                }
            }
        }
        System.out.println(ans + 1);
    }

}
