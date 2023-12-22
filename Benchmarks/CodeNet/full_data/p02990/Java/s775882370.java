import java.util.*;

public class Main {
    public static long[][] _c;
    public static long _mod = 1000000007;


    public static long comb(int a, int b) {
        if (_c[a][b] > 0) {
            return _c[a][b];
        } else {
            if (a == 0 && b == 0) {
                _c[0][0] = 1;
            } else {
                if (a == b) {
                    _c[a][b] = comb(a - 1, b - 1);
                } else if (b == 0) {
                    _c[a][b] = comb(a - 1, b);
                } else {
                    // if (a > 0 && b > 0) {
                    _c[a][b] = (comb(a - 1, b - 1) + comb(a - 1, b)) % _mod;
                }
            }
            return _c[a][b];
        }
    }
    public static void main(String[] args) {
        _c = new long[2001][2001];

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        for (int i = 1; i <= k; ++i) {
            int ans = 0;

            System.out.println(comb(n - k + 1, i) * comb(k - 1, i - 1));
        }
    }
}
