package atCoder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    static int N = 0;
    static int K = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        N = Integer.parseInt(sc.next());
        K = Integer.parseInt(sc.next());
        List<Integer> deq = new ArrayList<>();

        for (int i = 0; i < N; i++) {

            deq.add(Integer.parseInt(sc.next()));
        }
        //左右から取るパターンで試行0回の場合の価値
        deq.add(0);
        deq.add(0,0);

        sc.close();

        //最大値は10^7*100 = 10^9だからintで足りるはず
        int ans = 0;

        //左端からスタート(0～K回)
        for (int l = 0; l <= K; l++) {

            //右端からスタート(0~K回)
            for (int r = N+1; r >= (N+1)-(K-l); r--) {

                //試行回数がデキューの要素数を超えたらもう終了させる
                if (N+1 <= l + (N+1-r)) {

                    break;
                }

                List<Integer> hasJuwel = new ArrayList<>();

                for (int i = 0; i <= l; i++) {

                    hasJuwel.add(deq.get(i));
                }

                for (int i = N+1; i >= r; i--) {

                    hasJuwel.add(deq.get(i));
                }

                int hand_sum = 0;

                //foreach構文を使った手持ちの宝石の合計
                for(int i : hasJuwel) {

                    hand_sum += i;
                }

                //昇順でソート
                Collections.sort(hasJuwel);

                //試行回数が余っていればその分だけ価値が低い順で宝石を戻すことが出来る
                for (int i = 0; i < Math.min(K-l-(N+1-r), l + (N+1-r)); i++) {

                    if(hasJuwel.get(i) < 0) {

                        hand_sum -= hasJuwel.get(i);
                    }
                }
                ans = Math.max(ans, hand_sum);
            }
        }

        System.out.println(ans);
    }

}
