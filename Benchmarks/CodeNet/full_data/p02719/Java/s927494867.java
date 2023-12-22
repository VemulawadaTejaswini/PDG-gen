import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
    
    // 変数一覧
    long n;
    long k;
    long res;

    public void run() {
        // 入力情報取得
        Scanner sc = new Scanner(System.in);
        n = sc.nextLong();
        k = sc.nextLong();
        sc.close();

        // 解答処理
        solve();
    }
    
    private void solve() {
        a(n%k);
        System.out.println(res);
    }
    
    private void a(long a) {
        if (Math.abs(a - k) <= a) {
            a = Math.abs(a - k);
            a(a);
        } else {
            res = a;
            return;
        }
    }
}