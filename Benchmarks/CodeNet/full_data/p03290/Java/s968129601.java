import java.util.Scanner;

public class Main {
    static final int INF = 10000;

    private static int solve(int d, int g, int[] p, int[] c, int used) {
        int res = INF;
        for(int i = 0; i < d; i++) {
            if((used / (int) Math.pow(2, i)) % 2 == 1) continue;

            if((i + 1) * (p[i] - 1) >= g) {
                res = Math.min(res, (int) Math.ceil(1.0 * g / (i + 1)));
            }else if ((i + 1) * p[i] + c[i] >= g) {
                res = Math.min(res, p[i]);
            }else {
                res = Math.min(res, p[i] + solve(
                    d, g - ((i + 1) * p[i] + c[i]), p, c, used + (int) Math.pow(2, i)
                ));
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int d = sc.nextInt();
        int g = sc.nextInt() / 100;

        int[] p = new int[d];
        int[] c = new int[d];
        for(int i = 0; i < d; i++) {
            p[i] = sc.nextInt();
            c[i] = sc.nextInt() / 100;
        }

        int used = 0;
        System.out.println(solve(d, g, p, c, used));

        sc.close();
    }
}