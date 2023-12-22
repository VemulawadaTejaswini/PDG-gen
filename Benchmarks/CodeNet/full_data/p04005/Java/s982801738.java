import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        //スタックサイズ2^24で処理を行う
        new Thread(null, () -> {
            int n;
            int k;
            List<Integer> as = new ArrayList<>();

            //try-with-resources文(カッコ内で宣言した変数はtry句を抜けると自動的に閉じられる)
            try (Scanner sc = new Scanner(System.in)) {
                n = sc.nextInt();
                k = sc.nextInt();
                for (int i = 0; i < n; i++) {
                    as.add(sc.nextInt() - 1);
                }
            }
            System.out.println(new Calculator(n, k, as).calculate());
        }, "", 1 << 24).start();
    }
}

/**
 * 計算クラス
 */
class Calculator {
    /**
     * 整数K
     */
    private int k;

    /**
     * 転送先を変えなければならないテレポータの数
     */
    private int answer = 0;

    /**
     * 計算済みかどうか
     */
    private boolean isCalculate = false;

    /**
     * ある町へ転送するテレポータが設置されている町のリスト
     */
    private List<List<Integer>> lists = new ArrayList<>();

    /**
     * コンストラクタ
     *
     * @param n  町の数
     * @param k  整数K
     * @param as 各町のテレポータの転送先リスト
     */
    Calculator(int n, int k, List<Integer> as) {
        this.k = k;
        for (int i = 0; i < n; i++) {
            this.lists.add(new ArrayList<>());
        }
        for (int i = 0; i < n; i++) {
            int j = as.get(i);
            if (0 < i) {
                this.lists.get(j).add(i);
            } else if (0 < j) {
                this.answer++;
            }
        }
    }

    /**
     * 転送先を変えなければならないテレポータの数を求める
     *
     * @return 転送先を変えなければならないテレポータの数
     */
    int calculate() {
        if (!this.isCalculate) {
            this.dfs(0, 0);
            this.isCalculate = true;
        }
        return this.answer;
    }

    /**
     * 転送回数を算出する
     *
     * @param a   着目する町
     * @param pre 1つ前の町
     * @return 転送回数
     */
    private int dfs(int a, int pre) {
        int h = 0;
        for (int i : this.lists.get(a)) {
            h = Math.max(h, this.dfs(i, a));
        }
        if (0 < pre && h == this.k - 1) {
            h = 0;
            this.answer++;
        } else {
            h++;
        }
        return h;
    }
}