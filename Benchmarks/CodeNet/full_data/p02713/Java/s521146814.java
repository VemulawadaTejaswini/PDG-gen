import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int tmp;
        int ans = 0;
        for (int a = 1; a <= k; a++) {
            for (int b = 1; b <= k; b++) {
                for (int c = 1; c <= k; c++) {
                    tmp = gcd(a, b);
                    ans += gcd(tmp, c);
                }
            }
        }
        System.out.println(ans);
    }

    static int gcd(int i, int j) {
        int rem = j;
        while ((rem = i % j) != 0) {
            i = j;
            j = rem;
        }
        return j;
    }
}
