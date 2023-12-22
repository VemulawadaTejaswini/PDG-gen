import java.util.*;

// E - Crested Ibis vs Monster
// https://atcoder.jp/contests/abc153/tasks/abc153_c
public class Main {

    static class Magic {
        double cospa;
        int damage;
        int requiredMp;

        Magic(int damage, int requiredMp) {
            this.damage = damage;
            this.requiredMp = requiredMp;
            this.cospa = damage / (float)requiredMp;
        }

        double getCospa() {
            return cospa;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = Integer.parseInt(scanner.next());
        int N = Integer.parseInt(scanner.next());
        List<Magic> magics = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int damage = Integer.parseInt(scanner.next());
            int mp = Integer.parseInt(scanner.next());
            magics.add(new Magic(damage, mp));
        }
        scanner.close();

        magics.sort(Comparator.comparingDouble(Magic::getCospa).reversed());

        Magic magic = magics.get(0);

        int count = H / magic.damage;
        int usedMp = magic.requiredMp * count;
        int enemyHp = H % magic.damage;

        if (enemyHp <= 0) {
            System.out.println(usedMp);
            return;
        }

        // 残り一発
        for (Magic m : magics) {
            if (m.damage < enemyHp) continue;
            if (m.requiredMp > magic.requiredMp) continue;
            magic = m;
        }

        usedMp += magic.requiredMp;
        System.out.println(usedMp);
    }
}
