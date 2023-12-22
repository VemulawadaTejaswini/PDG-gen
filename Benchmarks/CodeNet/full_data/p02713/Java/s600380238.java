import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
    
    // 変数一覧
    int k;

    public void run() {
        // 入力情報取得
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        sc.close();

        // 解答処理
        solve();
    }
    
    private void solve() {
        int ans = 0;
        for (int i = 1; i <= k; i++) {
            for (int j = 1; j <= k; j++) {
                for (int l = 1; l <= k; l++) {
                    ans += gcd(i, gcd(j, l));
                }
            }    
        }
        System.out.println(ans);
    }
    
    private int gcd(int a, int b) {
        int r = 0;
        if (a < b) {
            int tmp;
            tmp = a;
            a = b;
            b = tmp;
        }
        r = a % b;
        while (r != 0) {
            a = b;
            b = r;
            r = a % b;
        }
        return b;
    }
}