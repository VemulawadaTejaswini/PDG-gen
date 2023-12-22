import java.util.Scanner;

class Main {
    static int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long nck[][] = new long[2500][2500];
        for (int i = 0; i < 2500; i++) {
            nck[i][0] = 1;
            nck[i][i] = 1;
        }
        for (int i = 1; i < 2300; i++) {
            for (int j = 1; j < i; j++) {
                nck[i][j] = (nck[i - 1][j] + nck[i - 1][j - 1]) % MOD;
            }
        }
        for (int i = 1; i < k + 1; i++) {
            // 計算をする.
            int akamasu = i + 1;
            int amari = (n - k) - akamasu + 2;
            long red = 0;
            if (akamasu + amari - 1 > amari) {
                if (amari >= 0) {
                    red = nck[akamasu + amari - 1][amari];
                }

            }
            if (red == 0) {
                System.out.println(0);
                continue;
            }

            // kをi個のグループに分割する.
            int nokori = k - i;
            long blue = nck[nokori + i - 1][i - 1];
            long ans = red * blue % MOD;
            System.out.println(ans);
        }
        sc.close();
    }
}
