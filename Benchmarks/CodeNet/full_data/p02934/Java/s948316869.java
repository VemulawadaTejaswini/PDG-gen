import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine());
        String[] an = sc.nextLine().split(" ");

        // 分母の最小公倍数を求める
        long molec = 0L;
        for (String elm : an) {
            int i = Integer.parseInt(elm);

            if (molec == 0L) {
                molec = gcd(i, i);
            } else {
                molec = gcd(i, molec);
            }
        }

        // 分子の計算
        long denom = 0L;
        for (String elm : an) {
            int i = Integer.parseInt(elm);
            long times = molec / i;
            denom += times;
        }

        // 答え
        System.err.println(molec + "/" + denom);
        double ans = (double) molec / (double) denom;
        System.out.println(ans);
    }

    private static long gcd(long a, long b) {
        long tmp;
        long c = a;
        c *= b;
        while ((tmp = a % b) != 0) {
            a = b;
            b = tmp;
        }
        return c / b;
    }

}

