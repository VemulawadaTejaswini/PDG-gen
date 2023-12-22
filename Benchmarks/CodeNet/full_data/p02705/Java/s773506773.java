import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
    
    // 変数一覧
    double r;

    public void run() {
        // 入力情報取得
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
        sc.close();

        // 解答処理
        solve();
    }
    
    private void solve() {
        double c = 2 * r * Math.PI;
        System.out.println(c);
    }
}