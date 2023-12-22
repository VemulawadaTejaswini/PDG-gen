import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // シミュレーション
        Scanner sc = new Scanner(System.in);

        List<Meal> meal = new ArrayList<>();
        int ans = 0;
        for (int i = 0; i < 5; i++) {
            int dish = sc.nextInt();
            if (dish % 10 == 0) {
                ans += dish;
            } else {
                meal.add(new Meal(dish));
            }
        }

        Collections.sort(meal);

        // 最後以外の要素は注文ルールに従って、端数を10の倍数に合わせて加算
        for (int i = 0; i < meal.size() - 1; i++) {
            int duration = meal.get(i).time;
            ans += duration;
            ans += 10 - (duration % 10); // キリの悪い待ち時間を足す
        }

        // 最後の注文だけそのままの値を追加
        ans += meal.get(meal.size() - 1).time;

        System.out.println(ans);
    }

    static class Meal implements Comparable<Meal> {
        int time;

        public Meal(int t) {
            this.time = t;
        }

        @Override
        public int compareTo(Meal o) {
            return o.time % 10 - this.time % 10;
        }

        @Override
        public String toString() {
            return String.valueOf(this.time);
        }
    }
}
