import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * AtCoder Beginner Contest 129<br>
 * B - Balance<br>
 * <br>
 * <a href="https://atcoder.jp/contests/abc129/tasks/abc129_b">AtCoderへのリンク</a><br>
 */
public class Main {

    /**
     * エントリポイント
     */
    public static void main(String[] args) {
        // 入力
        Model m = input(System.in);
        // 演算
        int result = proc(m);
        // 出力
        System.out.println(result);
    }

    /**
     * 入力モデル
     */
    static class Model {
        /** オモリの数 */
        int N;
        /** オモリの重さリスト */
        List<Integer> list = new ArrayList<Integer>();
    }

    /**
     * 入力値より入力モデルを作成する
     */
    private static Model input(InputStream in) {
        Model m = new Model();
        try (Scanner sc = new Scanner(in)) {
            String[] line1 = sc.nextLine().split(" ");
            String[] line2 = sc.nextLine().split(" ");

            m.N = Integer.parseInt(line1[0]);
            for (String str : line2) {
                m.list.add(Integer.parseInt(str));
            }
        }
        return m;
    }

    /**
     * 演算を行う
     */
    static int proc(final Model m) {
        //int result = 0;
        // TODO:実装する
        
        int sum = 0;
        int s1 = 0;
        int s2 = 0;
        // intの最大許容数をセット
        int min = Integer.MAX_VALUE;
        
        // 全要素合計算出
        for (int i=0; i<m.list.size(); i++) {
            sum += m.list.get(i);
        }
        
        for (int i=0; i<m.N; i++) {
            s1 = 0;
            s2 = 0;
            for (int j=0; j<=i; j++) {
                s1 += m.list.get(j);
            }
            s2 = sum - s1;
            if (min > Math.abs(s1 - s2)) {
                min = Math.abs(s1 - s2);
            }
        }

        return min;
    }
}
