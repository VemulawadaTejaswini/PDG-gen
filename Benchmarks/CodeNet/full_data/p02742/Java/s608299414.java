import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
    
    double h;
    double w;

    public void run() {
        // 入力情報取得
        Scanner sc = new Scanner(System.in);
        h = sc.nextDouble();
        w = sc.nextDouble();
        sc.close();

        // 解答処理
        solve();
    }
    
    private void solve() {
        double odd = Math.round(w / 2);
        double even = w / 2;
        double odd_row = Math.round(h / 2);
        double even_row = h / 2;
        double ans = odd * odd_row + even * even_row;
        System.out.println((long)ans);
    }
}