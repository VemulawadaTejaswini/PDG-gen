import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
    
    // 変数一覧
    double n;
    double k;
    int res;

    public void run() {
        // 入力情報取得
        Scanner sc = new Scanner(System.in);
        n = sc.nextDouble();
        k = sc.nextDouble();
        sc.close();

        // 解答処理
        solve();
    }
    
    private void solve() {
        a(n%k);
        System.out.println(res);
    }
    
    private void a(double a) {
        if (Math.abs(a - k) <= a) {
            a = Math.abs(a - k);
            a(a);
        } else {
            res = (int)a;
            return;
        }
    }
}