
import java.util.Scanner;

class Main {

    int n;
    int k;
    int[] d;

    Main(int n, int k, int[] d) {
        this.n = n;
        this.k = k;
        this.d = d;
    }

    boolean check(int m, int[] d) {
        int tmp = m;
        while (tmp != 0) {
            int r = tmp % 10;
            tmp /= 10;
            for (int di : d) {
                if (r == di) {
                    return false;
                }
            }
        }
        return true;
    }

    int solve() {

        int ans = n;

        while (!check(ans, d)) {
            ans++;
        }

        return ans;
    }

    public static void main(String args[]) {
        // input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int d[] = new int[k];
        for (int i = 0; i < k; i++) {
            d[i] = sc.nextInt();
        }
        sc.close();

        // solve
        int ans = new Main(n, k, d).solve();

        // display
        System.out.println(ans);
    }
}