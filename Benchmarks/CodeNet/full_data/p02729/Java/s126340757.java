import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
    
    // 変数一覧
    int n;
    int m;
    int res;

    public void run() {
        // 入力情報取得
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        sc.close();

        // 解答処理
        solve();
    }
    
    private void solve() {
        res += (n * (n - 1)) / 2;
        res += (m * (m - 1)) / 2;
        System.out.println(res);
    }
}