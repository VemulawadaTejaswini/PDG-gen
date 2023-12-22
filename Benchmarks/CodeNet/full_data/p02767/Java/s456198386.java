import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
    
    int n;
    int[] x;

    public void run() {
        // 入力情報取得
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }
        sc.close();

        // 解答処理
        solve();
    }
    
    private void solve() {
        int cur_cost = 0;
        int cost = Integer.MAX_VALUE / 2;
        for (int i = 0; i <= 100; i++) {
            for (int j = 0; j < x.length; j++) {
                cur_cost += (x[j] - i)*(x[j] - i);
            }
            cost = Math.min(cost, cur_cost);
            cur_cost = 0;
        }
        System.out.println(cost);
    }
}