import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
    
    // 変数一覧
    String s;

    public void run() {
        // 入力情報取得
        Scanner sc = new Scanner(System.in);
        s = sc.next();
        sc.close();

        // 解答処理
        solve();
    }
    private void solve() {
        if ((s.substring(2, 3).equals(s.substring(3, 4)))
                && s.substring(4, 5).equals(s.substring(5, 6))) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
        }
    }
}