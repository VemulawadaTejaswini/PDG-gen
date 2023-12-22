import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int ans = 0;
        for (int a = 1; a <= K; a++) {
            for (int b = 1; b <= K; b++) {
                int d = gcd(a, b);
                for (int c = 1; c <= K; c++) {
                    ans += gcd(d, c);
                }
            }
        }
        System.out.println(ans);
    }

    private static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        }
        return gcd(y, x%y);
    }
}
