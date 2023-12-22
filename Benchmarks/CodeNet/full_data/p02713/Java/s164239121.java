import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long sum = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= n; k++) {
                    int a = gcd(i, j);
                    sum += gcd(a, k);
                }
            }
        }
        System.out.println(sum);
    }

    static int gcd(int x, int y) {
        return y > 0 ? gcd(y, x % y) : x;
    }
}
