import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Objects;
import java.util.Scanner;
import java.util.Comparator;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CBBuBBBlesort solver = new CBBuBBBlesort();
        solver.solve(1, in, out);
        out.close();
    }

    static class CBBuBBBlesort {
        public void solve(int testNumber, Scanner in, PrintWriter out) {

        /*
        高橋君は誕生日に長さNの数列をもらった。
        i番目の要素がA _ i で与えられる。
        どの要素も互いに異なる
        - 連続する2要素を選び反転
        - 連続する3要素を選び反転
        ができる。これを用いてソートする場合の最小回数を求めよ。

        なんもわからんけどどうせ偶奇のパリティかなんかでどうにかなるんじゃない？
        ソート後が偶数なら偶数に入れればジャンプジャンプで乗り切れそう
        indexとペアを組んでソートする
         */

            int n = in.nextInt();
            ArrayList<Pair<Integer, Integer>> p = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                p.add(new Pair<>(i, in.nextInt()));
            }

            p.sort(Comparator.comparing(o -> o.u));


            // 思ったけどp.tとp.uってわかりづらいな、o1o2にしようかしら
            // ソートのキーを間違いました。
            // o1o2に書き直します
            // と思ったけど面倒だからあとでいいや
            // さて証明をする必要がある…が
            // とりあえずAC取りに行くか


            int cnt = 0;
            for (int i = 0; i < n; i++) {
                if (i % 2 != p.get(i).t % 2) {
                    cnt++;
                }
            }

            out.println(cnt / 2);


        }

    }

    static class Pair<T, U> {
        public T t;
        public U u;

        public Pair(T t, U u) {
            this.t = t;
            this.u = u;
        }

        public String toString() {
            return "Pair{" +
                    "t=" + t.toString() +
                    ", u=" + u.toString() +
                    '}';
        }

        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair<?, ?> pair = (Pair<?, ?>) o;
            return Objects.equals(t, pair.t) &&
                    Objects.equals(u, pair.u);
        }

        public int hashCode() {
            return Objects.hash(t, u);
        }

    }
}

