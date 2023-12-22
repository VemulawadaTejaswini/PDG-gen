import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main implements Runnable {

    public static void main(String[] args) throws Exception {
        Thread.setDefaultUncaughtExceptionHandler((t, e)->System.exit(1));
        new Thread(null, new Main(), "", 16 * 1024 * 1024).start();
    }

    public void run() {
        int N = 0;
        int[] prices = new int[10010];
        
        // 入力
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
            // プレゼントの個数
            N = Integer.parseInt(br.readLine());
            // プレゼントの値段を配列に読み込む
            for (int i = 0; i < N; i++) {
                prices[i] = Integer.parseInt(br.readLine());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 先頭から足していく
        // 最大値も調べて、最後に最大値の半分を引く
        int result = prices[0];;
        int max = prices[0];
        for (int i = 1; i < N; i++) {
            // プレゼントの値段を足していく
            result += prices[i];
            // 最も高いプレゼントの値段を調べる
            if (max < prices[i]) {
                max = prices[i];
            }
        }
        // 最も高いプレゼントの半額を引く
        result = result - max / 2;

        // 出力
        System.out.println(result);
    }
}
