import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
    
    int a;
    int b;

    public void run() {
        // 入力情報取得
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        sc.close();

        // 解答処理
        solve();
    }
    
    private void solve() {
        System.out.println(a(1, 1));
    }
    
    private int a(int ps, int i) {
        if (b == 1) {
            return 0;
        }
        if (ps == 1) {
            ps = a;
        } else {
            ps += a - 1;
        }
        if (ps >= b)
            return i;
        else
            return a(ps, i+1);
    }
}