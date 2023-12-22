import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
    
    // 変数一覧
    int n;

    public void run() {
        // 入力情報取得
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.close();

        // 解答処理
        solve();
    }
    
    private void solve() {
        boolean flg = false;
        for(int i=0;i<3;i++) {
            if (n % 10 == 7) {
                System.out.println("Yes");
                flg = true;
                break;
            }    
            n /= 10;
        }
        if (flg == false) {
            System.out.println("No");
        }
    }
}