import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static ArrayList<Integer> leaf_list;
    private static ArrayList<Integer> test_leaf_list;

    //検証用リストの初期化
    public static void init(int leaf_num) {
        test_leaf_list = new ArrayList(leaf_num);
        for (int score : leaf_list) {
            test_leaf_list.add(score);
        }
    }

    public static void main(String[] args) {
        //標準入力からデータを読み込み
        Scanner sc = new Scanner(System.in);
        int leaf_num = sc.nextInt();
        leaf_list = new ArrayList(leaf_num);
        for (int i = 0; i < leaf_num; i++) {
            leaf_list.add(sc.nextInt());
        }

        int max_score = Integer.MIN_VALUE, score, pos, cnt;
        for (int a = 1; a < leaf_num; a++) {
            for (int b = 1; b < a; b++) {
                init(leaf_num);
                score = 0;
                pos = 0;
                cnt = 0;
                while (true) {
                    //進むと戻るを交互に実施
                    if (cnt % 2 == 0) {
                        pos = pos + a;
                    } else {
                        pos = pos - b;
                    }

                    //現在の場所が範囲外の場合は終了
                    if ((0 > pos) || (pos >= leaf_num)) {
                        break;
                    //蓮がなければ終了
                    } else if (test_leaf_list.get(pos) == Integer.MIN_VALUE) {
                        score -= 10 ^ 100;
                        if (max_score < score) {
                            max_score = score;
                        }
                        break;
                    //終点に到着すれば終了
                    } else if (pos == leaf_num - 1) {
                        if (max_score < score) {
                            max_score = score;
                        }
                        break;
                    //それ以外は得点を加算
                    } else {
                        score += test_leaf_list.get(pos);
                    }

                    test_leaf_list.set(pos, Integer.MIN_VALUE);
                    cnt++;
                }
            }
        }
        System.out.println(max_score);
    }
}
