
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);


    static long n;
    static long m;


    public static void main(String[] args) {
        n = sc.nextLong();
        m = sc.nextLong();

        long result = solve(n, m);
        System.out.println(result);
    }

    private static long solve(long n, long m) {
        long ans = 0;
        long num = 1;
        for (int i = 0; i < m / n; i++) {
            if (m % num == 0) {
                if (m / num >= n) {
                    ans = num;
                }
            }
            num++;
        }
        return ans;
    }
}
