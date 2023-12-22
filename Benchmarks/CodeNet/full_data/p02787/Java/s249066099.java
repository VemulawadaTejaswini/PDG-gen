
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int N = sc.nextInt();
        sc.nextLine();
        M[] magics = new M[N];
        for (int i = 0; i < N; i++) {
            M m = new M();
            m.atack = sc.nextInt();
            m.consume = sc.nextInt();
            sc.nextLine();
            magics[i] = m;
        }
        Comparator<M> comparator = Comparator.comparingInt(m -> m.consume);
        comparator = comparator.thenComparingInt(m -> -m.atack);
        Arrays.sort(magics, comparator);
        if (magics[0].atack >= H) {
            System.out.println(magics[0].consume);
            return;
        }
        int[] DP = new int[H + 1];
        DP[0] = 0;
        for (int i = 1; i <= magics[0].atack; i++) {
            DP[i] = magics[0].consume;
        }
        for (int i = magics[0].atack + 1; i < DP.length; i++) {
            int minDP = Integer.MAX_VALUE;
            for (M magic : magics) {
                int hp = Math.max(i - magic.atack, 0);
                int dp = DP[hp] + magic.consume;
                minDP = Math.min(dp, minDP);
            }
            DP[i] = minDP;
        }

        System.out.println(DP[H]);
    }

    static class M {
        int atack;
        int consume;
    }
}