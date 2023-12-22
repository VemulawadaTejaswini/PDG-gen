import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long input = scanner.nextInt();
        scanner.close();

        long ans = 0l;
        for (long a = 1l; a <= input; a++) {
            for (long b = 1l; b <= input; b++) {
                for (long c = 1l; c <= input; c++) {
                    ans += gcd(a, b, c);
                }
            }

        }

        System.out.println(ans);

    }

    public static final long gcd(final long... param) {
        final long len = param.length;
        long g = gcd(param[0], param[1]); // gcd(a, b) は以前作ったもの
        for (long i = 1l; i < len - 1; i++) {
            g = gcd(g, param[(int) (i + 1)]); // gcd(a, b) は以前作ったもの
        }
        return g;
    }
}
