import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        Sushi[] sushis = new Sushi[n];
        for (int i = 0; i < n; ++i) {
            sushis[i] = new Sushi(sc.nextLong(), sc.nextLong());
        }

        // 寿司のおいしさで降順ソートする
        Arrays.sort(sushis, Comparator.reverseOrder());

        // 寿司の種類ごとの個数を保持っておく為の枠作り
        Map<Long, Integer> eats = new HashMap<>();
        for (int i = 0; i < n; i++) {
            eats.put((long) i + 1, 0);
        }

        // K個の寿司をまず降順ソートした順で食べる。種類は気にしない
        List<Sushi> normalSushi = new ArrayList<>();
        long delicious = 0;
        for (int i = 0; i < k; ++i) {
            Sushi sushi = sushis[i];
            long type = sushi.t;

            if (eats.get(type) > 0) {
                // ボーナスにならない寿司を詰める
                normalSushi.add(sushi);
            }

            delicious += sushi.d;
            eats.put(type, eats.get(type) + 1);
        }

        // 最初に食べた寿司以外を詰める
        List<Sushi> otherSushi = new ArrayList<>();
        Set<Long> otherVariety = new HashSet<>();
        for (int i = k; i < n; ++i) {
            Sushi item = sushis[i];
            long sushiType = item.t;
            if (eats.get(sushiType) == 0 && !otherVariety.contains(sushiType)) {
                otherVariety.add(sushiType);
                otherSushi.add(item);
            }
        }

        // 今何種類食べたかカウントする
        long variety = eats.values().stream().filter(s -> s != 0).count();

        long base = delicious + variety * variety;
        long ans = base;

        // 何個入れ替えるかでループ
        long loss = 0;
        for (int i = 0; i < Math.min(otherSushi.size(), normalSushi.size()); ++i) {
            int remIdx = i;
            int replIdx = normalSushi.size() - (i + 1);
            long gain = (2 * variety + i + 1) * (i + 1);
            loss += normalSushi.get(replIdx).d - otherSushi.get(remIdx).d;
            ans = Math.max(ans, base + gain - loss);
        }

        System.out.println(ans);
    }

    /**
     * 種類とおいしさを持った寿司クラス。 おいしさで降順ソートされる
     */
    static class Sushi implements Comparable<Sushi> {
        long t;
        long d;

        Sushi(long t, long d) {
            this.t = t;
            this.d = d;
        }

        @Override
        public int compareTo(Sushi o) {
            return (int) (this.d - o.d);
        }

        @Override
        public String toString() {
            return String.format("%s:%s", t, d);
        }

    }
}

